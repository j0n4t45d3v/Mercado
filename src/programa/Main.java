package programa;

import entidade.cliente.CadastroCliente;
import entidade.cliente.Cliente;
import entidade.dados.*;
import entidade.exceptions.CpfException;
import entidade.exceptions.IdProdutoException;
import entidade.funcionario.CadastroFuncionario;
import entidade.funcionario.Funcionario;
import entidade.produto.CadastroProduto;
import entidade.produto.Produto;

import java.util.Scanner;

public class Main {
    static RepositorioClienteLista rcl = new RepositorioClienteLista();
    static RepositorioClienteVetor rcv = new RepositorioClienteVetor(100);
    static RepositorioProdutoLista rpl = new RepositorioProdutoLista();
    static RepositorioProdutoVetor rpv = new RepositorioProdutoVetor(100);
    static RepositorioFuncionarioLista rfl = new RepositorioFuncionarioLista();
    static RepositorioFuncionarioVetor rfv = new RepositorioFuncionarioVetor(100);
    static Scanner input = new Scanner(System.in);
    static CadastroCliente cc = new CadastroCliente(rcl);
    static CadastroFuncionario cf = new CadastroFuncionario(rfv);
    public static void main(String[] args) throws IdProdutoException, CpfException {
        Funcionario gerente = new Funcionario("Cleberson", "30/02/1980", "2347658012", "gerente");
        cf.cadastrarFuncionario(gerente);

        int perg;

        do{
            System.out.println("Sair-0\nFuncionario-1\nCliente-2\nCadastrar Funcionario-3");
            perg = input.nextInt();

            switch (perg){
                case 0 -> System.out.println("Programa encerrado!");
                case 1 ->{
                    System.out.println("digite seu cpf: ");
                    String recebeCpf = input.next();
                    if(recebeCpf.length() == 11){
                        funcionario(recebeCpf);
                    }else{
                        System.out.println("Cpf invalido!");
                    }
                }
                case 2 -> cliente();
            }
        } while(perg != 0);
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------
    //Metodos

    public static void funcionario(String cpf) throws CpfException, IdProdutoException {
        //fazer validação para ver se o funcionario é gerente ou repositor

        Funcionario funcionario = rfv.buscarFuncionario(cpf);

        int perg;

        if(funcionario.getCargo().equalsIgnoreCase("gerente")){
            do{
                System.out.println("\nSair-0\nAdicionar Funcionario-1\nListar Clientes cadastrados-2");
                perg = input.nextInt();

                switch (perg){
                    case 1 -> {
                        System.out.println("Nome do Cliente: ");
                        String nome = input.next();
                        System.out.println("Cpf do Cliente: ");
                        String cpfCliente = input.next();
                        System.out.println("Data nascimento do Cliente: ");
                        String dataNascimento = input.next();

                        Cliente c = new Cliente(nome, dataNascimento, cpfCliente, "dinheiro");
                        cc.cadastrar(c);
                    }
                    case 2 -> rcl.listaClientes();

                }
            }while(perg!=0);
        }else{
            do{
                System.out.println("\nSair-0\nAdicionar Cliente-1\nAdicionar Produto-2\nAdicionar Funcionario-3\nListar Clientes cadastrados-4");
                perg = input.nextInt();

                switch (perg){
                    case 1 -> {
                        System.out.println("Nome do Cliente: ");
                        String nome = input.next();
                        System.out.println("Cpf do Cliente: ");
                        String cpfCliente = input.next();
                        System.out.println("Data nascimento do Cliente: ");
                        String dataNascimento = input.next();

                        Cliente c = new Cliente(nome, dataNascimento, cpfCliente, "dinheiro");
                        cc.cadastrar(c);
                    }
                    case 2 ->{
                        System.out.println("Nome do produto: ");
                        String nome = input.next();
                        System.out.println("codigo de barra do produto: ");
                        String cod = input.next();
                        System.out.println("preço do produto: ");
                        double preco = input.nextDouble();
                        System.out.println("quantidade do produto: ");
                        int qtd = input.nextInt();

                        CadastroProduto cp = new CadastroProduto(rpv);
                        Produto p = new Produto(nome, cod, preco, qtd);

                        cp.adicionarProduto(p);
                    }
                    case 4 ->{
                        rcl.listaClientes();
                    }
                }
            }while(perg!=0);
        }

    }
    public static void cliente(){

        int perg;
        do {
            System.out.println("Sair-0\nExcluir Cadastro-1\nAtualizar Cadastro-2\nAdicionar Produto-3 \nRemover Produto-4");
            perg = input.nextInt();

            switch (perg){
                case 1 ->{
                    System.out.println("Digite o cpf do Cliente que deseja remover :");
                    String cpfBuscado = input.next();
                    Cliente c = cc.buscarCliente(cpfBuscado);
                    rcl.remover(c);
                } case 2 ->{
                    System.out.println("Digite o cpf do cliente que deseja atualizar :");
                    String cpfAtualizar = input.next();
                    Cliente c = cc.buscarCliente(cpfAtualizar);
                    System.out.println("O que deseja atualizar : \nNome; \nData de nascimento; \nForma de pagamento;");
                    String atualizar = input.next();
                    switch (atualizar) {
                        case "Nome" -> {
                            System.out.println("insira um novo nome");
                            String atualizarNome = input.next();
                            c.setNome(atualizarNome);
                        }
                        case "Data de nascimento" -> {
                            System.out.println("insira uma nova data de nascimento");
                            String atualizarData = input.next();
                            c.setDataNascimento(atualizarData);
                        }
                        case "Forma de pagamento" -> {
                            System.out.println("insira uma nova forma de pagamento");
                            String atualizarForma = input.next();
                            c.setFormaDePagamento(atualizarForma);
                        }
                    }
                    rcl.atualizar(c,cpfAtualizar);
                } case 3 ->{

                }
            }

        }while (perg !=0);
    }
}
