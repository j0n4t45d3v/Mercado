package entidade.pedido;

import entidade.produto.Produto;

public class Pedido {
    private Produto produto;
    private int quantidade;
    private double preco;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.produto.setQuantidade(quantidade);
        this.preco = produto.getPreco() * quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
