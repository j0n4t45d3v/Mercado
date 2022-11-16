package entidade.cliente;

import entidade.pedido.Pedido;
import entidade.pessoa.Pessoa;
import entidade.produto.Produto;

public class Cliente extends Pessoa {
    private Pedido pedido;
    private String formaDePagamento;


    public Cliente(String nome, String dataNascimento, String cpf, String formaDePagamento) {
        super(nome, dataNascimento, cpf);
        this.pedido = new Pedido();
        this.formaDePagamento = formaDePagamento;
    }

    public void adicionar(Produto produto, int qtd){
        getPedido().adicionarProdutoNoCarrinho(produto, qtd);
        produto.setQuantidade(produto.getQuantidade() - qtd);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
