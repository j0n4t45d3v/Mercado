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

/*
* contribuidores: Jonatas de Lima, Paulo César, Douglas Augusto, Marco Antonio, Magno nunes
* tema: Mercado
* */

public class  Main {
//    static RepositorioClienteLista rc = new RepositorioClienteLista();
    static RepositorioClienteVetor rc = new RepositorioClienteVetor(100);
//    static RepositorioProdutoLista rp = new RepositorioProdutoLista();
    static RepositorioProdutoVetor rp = new RepositorioProdutoVetor(100);
//    static RepositorioFuncionarioLista rf = new RepositorioFuncionarioLista();
    static RepositorioFuncionarioVetor rf = new RepositorioFuncionarioVetor(100);
    static Scanner input = new Scanner(System.in);
    static CadastroCliente cc = new CadastroCliente(rc);
    static CadastroFuncionario cf = new CadastroFuncionario(rf);
    public static void main(String[] args) throws IdProdutoException, CpfException {

        OBbjetoComOsDados od = new OBbjetoComOsDados(rp,rf);
        od.adicionarProdutos();
        od.adicionarFuncionarios();

        int perg;

        do{
            System.out.println("Sair-0\nFuncionario-1\nCliente-2");
            perg = input.nextInt();

            switch (perg){
                case 0 -> System.out.println("Programa encerrado!");
                case 1 ->{
                    System.out.println("digite seu cpf: ");
                    String recebeCpf = input.next();
                    if(recebeCpf.length() == 11){
                        funcionario(recebeCpf);
                    }else{
                        throw new CpfException("CPF Invalido!");
                    }
                }
                case 2 -> {
                    System.out.println("Digite seu cpf: ");
                    String buscarCpf = input.next();
                    if (buscarCpf.length() ==11){
                        cliente(buscarCpf);
                    }else {
                        throw new CpfException("CPF Invalido");
                    }
                }
            }

        } while(perg != 0);

    }

    //------------------------------------------------------------------------------------------------------------------------------------
    //Metodos

    public static void funcionario(String cpf) throws CpfException, IdProdutoException {
        //fazer validação para ver se o funcionario é gerente ou repositor

        Funcionario funcionario = rf.buscarFuncionario(cpf);

        int perg = -1;

        do{
            if(funcionario.getCargo().equalsIgnoreCase("gerente")){ //acesso do gerente


                System.out.println("\nSair-0\nAdicionar Funcionario-1\nAdicionar Novo Cliente-2\nListar Clientes cadastrados-3\nListar Funcionarios-4\nListar Produtos-5");
                perg = input.nextInt();

                switch (perg){
                    case 1 -> {
                        System.out.println("Nome do novo funcionario: ");
                        String nome = input.next();
                        System.out.println("Cpf do novo funcionario: ");
                        String cpfFuncionario = input.next();
                        System.out.println("Data nascimento do novo funcionario: ");
                        String dataNascimento = input.next();
                        System.out.println("Cargo do novo funcionario: ");
                        String cargo = input.next();

                        Funcionario f = new Funcionario(nome, dataNascimento, cpfFuncionario, cargo);
                        cf.cadastrarFuncionario(f);
                    }
                    case 2 -> {
                        System.out.println("Nome do cliente: ");
                        String nome = input.next();
                        System.out.println("Cpf do cliente: ");
                        String cpfCliente = input.next();
                        System.out.println("Data nascimento do cliente: ");
                        String dataNascimento = input.next();
                        System.out.println("Cargo do novo funcionario: ");
                        String formaPagamento = input.next();

                        Cliente c = new Cliente(nome, dataNascimento, cpfCliente, formaPagamento);
                        cc.cadastrar(c);
                    }
                    case 3 -> rc.imprimir();
                    case 4 -> rf.imprimir();
                    case 5 -> rp.imprimir();

                }
            }else if(funcionario.getCargo().equalsIgnoreCase("repositor")){ // acesso do repositor

                System.out.println("\nSair-0\nAdicionar Produto-1\nListar Produtos-2");
                perg = input.nextInt();

                switch (perg){
                    case 1 ->{
                        System.out.println("Nome do produto: ");
                        String nome = input.next();
                        System.out.println("codigo de barra do produto: ");
                        String cod = input.next();
                        System.out.println("preço do produto: ");
                        double preco = input.nextDouble();
                        System.out.println("quantidade do produto: ");
                        int qtd = input.nextInt();

                        CadastroProduto cp = new CadastroProduto(rp);
                        Produto p = new Produto(nome, cod, preco, qtd);

                        cp.adicionarProduto(p);

                    }
                    case 2 -> rp.imprimir();

                }
            }
        }while(perg!=0);

    }
    public static void cliente(String cpf){

        int perg;
        do {
            System.out.println("Sair-0\nExcluir Cadastro-1\nAtualizar Cadastro-2\nAdicionar Produto-3 \nRemover Produto-4");
            perg = input.nextInt();

            switch (perg){
                case 1 ->{
                    System.out.println("Digite o cpf do Cliente que deseja remover :");
                    String cpfBuscado = input.next();
                    Cliente c = cc.buscarCliente(cpfBuscado);
                    rc.remover(c);
                } case 2 ->{
                    System.out.println("Digite o cpf do cliente que deseja atualizar :");
                    String cpfAtualizar = input.next();
                    Cliente c = cc.buscarCliente(cpfAtualizar);
                    System.out.println("O que deseja atualizar : \nNome; \nData de nascimento; \nForma de pagamento;");
                    String atualizar = input.nextLine().trim();
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
                    rc.atualizar(c,cpfAtualizar);
                } case 3 ->{
                    System.out.println("Produtos disponivel :");
                    rp.imprimir();

                    System.out.println("Digite o produto que deseja adicionar na lista :");
                    String produto = input.next();

                    RepositorioProdutoVetor rcp = new RepositorioProdutoVetor(100);
                    //RepositorioProdutoLista rcp = new RepositorioProdutoLista();

                }
            }

        }while (perg !=0);
    }
}
