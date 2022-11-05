package cliente;

import dados.RepositorioPedidoLista;
import pessoa.Pessoa;

public class Cliente extends Pessoa {
    private RepositorioPedidoLista rpl;
    private String formaDePagamento;

    public Cliente(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    public RepositorioPedidoLista getRpl() {
        return rpl;
    }

    public void setRpl(RepositorioPedidoLista rpl) {
        this.rpl = rpl;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
