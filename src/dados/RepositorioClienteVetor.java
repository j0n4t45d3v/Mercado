package dados;

import cliente.Cliente;
import exceptions.CpfException;

import java.util.Arrays;


public class RepositorioClienteVetor implements InterfaceCliente{
    private Cliente[] vetor;

    public RepositorioClienteVetor() {

    }

    @Override
    public void add(RepositorioClienteLista clientes){

        this.vetor = new Cliente[clientes.getTamanho()];

        clientes.cloneArray(this.vetor);
    }

    public void imprimir(){

        for(Cliente i : this.vetor){
            System.out.println(i.getNome());
        }
    }
}
