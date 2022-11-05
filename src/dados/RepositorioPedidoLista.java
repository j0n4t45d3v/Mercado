package dados;

import cliente.Cliente;
import pedido.Itens;

public class RepositorioPedidoLista implements InterfacePedido{
    private Node<Itens> inicio;
    private Node<Itens> fim;
    private int tamanho;

    public RepositorioPedidoLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public void add(Itens item) {
        Node<Itens> no = new Node<>(item);
        if(this.inicio == null)
            this.inicio = no;
        else {
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
        this.tamanho++;
    }

    @Override
    public void remover(String NomeItem) {
        Node<Itens> noAtual = this.inicio;
        String nomeItem = noAtual.getValue().getNome();

        while(noAtual != null && nomeItem != NomeItem){
            noAtual = noAtual.getProx();
        }

        if(noAtual.equals(this.inicio)){
            this.inicio = noAtual.getProx();
            this.inicio.setAnt(null);
        } else if(noAtual.equals(this.fim)){
            this.fim = noAtual.getAnt();
            this.fim.setProx(null);
        } else{
            noAtual.getAnt().setProx(noAtual.getProx());
            noAtual.getProx().setAnt(noAtual.getAnt());
        }
        this.tamanho--;
    }

    public void listaClientes(){
        Node<Itens> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getNome());
            noAtual = noAtual.getProx();
        }
    }
}
