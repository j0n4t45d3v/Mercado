package dados;

import cliente.Cliente;
import exceptions.CpfException;

import java.util.Arrays;


public class RepositorioClienteVetor implements InterfaceCliente{
    private Cliente[] vetor;

    public RepositorioClienteVetor() {

    }

    @Override
    public void add(Cliente cliente) {

    }

    @Override
    public void remover(Cliente cliente) {

    }

    @Override
    public void atualizar(Cliente cliente , String cpf) {

    }

    @Override
    public boolean existeCliente(String cpf) {
        return false;
    }

    @Override
    public Cliente buscarCliente(String nome) {
        return null;
    }

    public void imprimir(){

        for(Cliente i : this.vetor){
            System.out.println(i.getNome());
        }
    }
}
