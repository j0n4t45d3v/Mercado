package dados;

import cliente.Cliente;
import exceptions.CpfException;

public class RepositorioClienteVetor implements InterfaceCliente{
    private int tamanho;
    private Cliente[] vetor;

    public RepositorioClienteVetor(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void cadastrar(Cliente cliente) throws CpfException {
        vetor = new Cliente[this.tamanho];
    }
}
