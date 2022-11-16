package entidade.dados;


import entidade.cliente.Cliente;

public class RepositorioClienteLista implements InterfaceCliente{
    private Node<Cliente> inicio;
    private Node<Cliente> fim;
    private int tamanho;

    public RepositorioClienteLista() {
        this.inicio = null;
        this.fim = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void add(Cliente cliente){
        Node<Cliente> no = new Node<>(cliente);
        if(this.inicio == null){
            this.inicio = no;
        }else{
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
        tamanho ++;
    }

    @Override
    public void remover(Cliente cliente) {
        Node<Cliente> noAtual = this.inicio;

        while(noAtual != null && noAtual.getValue() != cliente){
            noAtual = noAtual.getProx();
        }

        if(this.inicio.equals(noAtual)){
            this.inicio = noAtual.getProx();
            this.inicio.setAnt(null);
        }else if(this.fim.equals(noAtual)){
            this.fim = noAtual.getAnt();
            this.fim.setProx(null);
        }else{
            noAtual.getAnt().setProx(noAtual.getProx());
            noAtual.getProx().setAnt(noAtual.getAnt());
        }
        tamanho--;
    }

    @Override
    public void atualizar(Cliente cliente, String cpf){
        Node<Cliente> noAtual = this.inicio;
        while(noAtual != null && noAtual.getValue() != cliente) {
            noAtual = noAtual.getProx();
        }
    }

    @Override
    public boolean existeCliente(String cpf) {
        Node<Cliente> p = this.inicio;
        while (p != null && !p.getValue().getCpf().equals(cpf) ){
            p = p.getProx();
        }
        return p != null;
    }

    @Override
    public Cliente buscarCliente(String cpf) {
        return null;
    }

    public void listaClientes(){
        Node<Cliente> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getNome());
            noAtual = noAtual.getProx();
        }
    }
}
