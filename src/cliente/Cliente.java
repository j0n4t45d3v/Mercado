package cliente;

import pedido.Pedido;
import pessoa.Pessoa;

public class Cliente extends Pessoa {
    private Pedido pedido;
    private String formaDePagamento;


    public Cliente(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.pedido = new Pedido();
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
