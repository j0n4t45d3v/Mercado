package programa;

import entidade.cliente.CadastroCliente;
import entidade.cliente.Cliente;
import entidade.dados.*;
import entidade.exceptions.CpfException;
import entidade.exceptions.IdProdutoException;
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
    public static void main(String[] args) {



        int perg;

        do{
            System.out.println("Sair-0\nFuncionario-1\nCliente-2");
            perg = input.nextInt();

            switch (perg){
                case 0 -> System.out.println("Programa encerrado!");
                case 1 -> rfl.imprimir();
                case 2 -> rcl.listaClientes();
            }
        } while(perg != 0);
    }
    public static void funcionario() throws CpfException, IdProdutoException {

        int perg;

        do{
            System.out.println("\nSair-0\nAdicionar Cliente-1\nAdicionar Produto-2\nAdicionar Funcionario-3");
            perg = input.nextInt();

            switch (perg){
                case 1 -> {
                    System.out.println("Nome do Cliente: ");
                    String nome = input.next();
                    System.out.println("Cpf do Cliente: ");
                    String cpf = input.next();
                    System.out.println("Data nascimento do Cliente: ");
                    String dataNascimento = input.next();

                    CadastroCliente cc = new CadastroCliente(rcl);
                    Cliente c = new Cliente(nome, dataNascimento, cpf, "dinheiro");
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

            }
        }while(perg!=0);
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
                    Cliente c = rcv.buscarCliente(cpfBuscado);
                    rcv.remover(c);
                } case 2 ->{

                }

            }

        }while (perg !=0);

    }

}
