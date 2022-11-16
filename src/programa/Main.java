package programa;

import entidade.cliente.Cliente;
import entidade.dados.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InterfaceCliente ic = new RepositorioClienteLista();
        InterfaceCliente icv = new RepositorioClienteVetor(100);
        InterfaceProduto ip = new RepositorioProdutoLista();
        InterfaceProduto ipv = new RepositorioProdutoVetor();
        InterfaceFuncionario itfun = new RepositorioFuncionarioLista();
        InterfaceFuncionario ifv = new RepositorioFuncionarioVetor(100);


    }
}
