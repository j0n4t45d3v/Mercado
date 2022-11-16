package programa;

import entidade.dados.*;

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
    public static void funcionario(){

        int perg;

        do{
            System.out.println("Sair-0\nAdicionar Cliente-1\nAdicionar Produto-2\nAdicionar Funcionario-3");
            perg = input.nextInt();

            switch (perg){
                case 1 -> {

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

                }
            }

        }while (perg !=0);
    }

}
