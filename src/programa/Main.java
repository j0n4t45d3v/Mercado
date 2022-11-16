package programa;

import entidade.cliente.Cliente;
import entidade.dados.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RepositorioClienteLista ic = new RepositorioClienteLista();
        InterfaceCliente icv = new RepositorioClienteVetor(100);
        InterfaceProduto ip = new RepositorioProdutoLista();
        InterfaceProduto ipv = new RepositorioProdutoVetor();
        InterfaceFuncionario itfun = new RepositorioFuncionarioLista();
        InterfaceFuncionario ifv = new RepositorioFuncionarioVetor();

        int n;
        do {
            System.out.println("Funcionario - 1\nFuncionario - 2\nFuncionario - 3\nSair - 0");
            n = input.nextInt();


            switch (n) {
                case 1 -> {
                    System.out.println("nome: ");
                    String nome = input.nextLine();
                    System.out.println("data nascimento: ");
                    String dataNascimento = input.next();
                    System.out.println("cpf: ");
                    String cpf = input.next();

                    Cliente a = new Cliente(nome, dataNascimento, cpf);

                    ic.add(a);
                    ic.listaClientes();
                }
                case 0 -> {
                    System.out.println("Programa encerrado!");
                }
            }
        } while (n != 0);

    }
}
