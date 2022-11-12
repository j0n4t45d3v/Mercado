package dados;

import cliente.Cliente;
import exceptions.CpfException;

import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;


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
        for(int i = 0 ; i < this.vetor.length; i++){
            if (this.vetor[i].getCpf().equals(cliente.getCpf())){
                this.vetor[i] = null;
                break;
            }
        }
    }

    @Override
    public void atualizar(Cliente cliente,String cpf) {
        for (int i = 0 ; i <this.vetor.length ; i++){
            if (this.vetor[i] != null){
                String id = this.vetor[i].getCpf();
                if (cpf.equals(id) ){
                    this.vetor[i] = cliente;
                }
            }
        }

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

        for (Cliente cliente : this.vetor) {
            if (cliente != null) {
                System.out.println(cliente.getNome());
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
