package entidade.cliente;

import entidade.dados.InterfacePedido;
import entidade.pessoa.Pessoa;
import entidade.produto.Produto;

public class Cliente extends Pessoa {
    private String formaDePagamento;
    private InterfacePedido pedido;

    public Cliente(String nome, String dataNascimento, String cpf, String formaDePagamento, InterfacePedido pedidos) {
        super(nome, dataNascimento, cpf);
        this.formaDePagamento = formaDePagamento;
        this.pedido = pedidos;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public InterfacePedido getPedido() {
        return pedido;
    }

    public void setPedido(InterfacePedido pedido) {
        this.pedido = pedido;
    }
}
