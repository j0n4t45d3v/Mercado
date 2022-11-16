package programa;

import entidade.dados.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RepositorioClienteLista rcl = new RepositorioClienteLista();
        RepositorioClienteVetor rcv = new RepositorioClienteVetor(100);
        RepositorioProdutoLista rpl = new RepositorioProdutoLista();
        RepositorioProdutoVetor rpv = new RepositorioProdutoVetor(100);
        RepositorioFuncionarioLista rfl = new RepositorioFuncionarioLista();
        RepositorioFuncionarioVetor rfv = new RepositorioFuncionarioVetor(100);

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


}
