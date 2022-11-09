package dados;

import cliente.Cliente;
import exceptions.CpfException;

import java.util.Arrays;


public class RepositorioClienteVetor implements InterfaceCliente{
    private Cliente[] vetor;

    private int indice;

    public RepositorioClienteVetor(int t) {
        this.indice = 0;
        this.vetor = new Cliente[t];
    }

    @Override
    public void add(Cliente cliente) {
        if (this.vetor.length == indice){
            Cliente[] aux = new Cliente[indice * 2];
            for (int i = 0 ; i < indice ; i++){
                aux[i] = this.vetor[i];
            }
            this.vetor = aux;
        }
        this.vetor[indice] = cliente;
        indice++;
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

        for (int i = 0; i < this.vetor.length; i++){
            System.out.println(this.vetor[i].getNome());
            if (this.vetor[i+1] == null){
                break;
            }
        }
    }

    public Cliente[] getVetor() {
        return vetor;
    }

    public void setVetor(Cliente[] vetor) {
        this.vetor = vetor;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
