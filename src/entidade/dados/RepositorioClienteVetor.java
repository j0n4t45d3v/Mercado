package entidade.dados;

import entidade.cliente.Cliente;

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
        boolean retorno = false;
        for (Cliente cliente : this.vetor) {
            if (cliente != null) {
                String id = cliente.getCpf();
                if (cpf.equals(id)) {
                    retorno = true;
                    break;
                }
            }
        }
        return retorno;
    }

    @Override
    public Cliente buscarCliente(String cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.vetor) {
            if (cliente != null) {
                String id = cliente.getCpf();
                if (cpf.equals(id)) {
                    clienteEncontrado = cliente;
                    break;
                }
            }
        }
        return clienteEncontrado;
    }

    public void imprimir(){

        for (Cliente cliente : this.vetor) {
            if (cliente != null) {
                System.out.println(cliente.getNome());
            }
        }
    }
}
