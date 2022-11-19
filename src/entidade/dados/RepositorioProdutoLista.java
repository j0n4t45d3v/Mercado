package entidade.dados;

import entidade.produto.Produto;

public class RepositorioProdutoLista implements InterfaceProduto {
    private Node<Produto> inicio;
    private Node<Produto> fim;
    private int tamanho;

    public RepositorioProdutoLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public void add(Produto produto) {
        Node<Produto> no = new Node<>(produto);
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
    public void remover(Produto produto) {
        Node<Produto> noAtual = this.inicio;
        String nomeItem = noAtual.getValue().getNome();

        while(noAtual != null && !nomeItem.equals(produto.getNome())){
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

    @Override
    public void atualizar(Produto produto, String id) {

    }


    @Override
    public boolean existeProduto(String id) {
        return false;
    }

    @Override
    public Produto buscarProduto(String nome) {
        return null;
    }

    public void listaProdutos(){
        Node<Produto> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getNome());
            noAtual = noAtual.getProx();
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
