package entidade.cliente;

import entidade.pessoa.Pessoa;
import entidade.produto.Produto;

public class Cliente extends Pessoa {
    private String formaDePagamento;


    public Cliente(String nome, String dataNascimento, String cpf, String formaDePagamento) {
        super(nome, dataNascimento, cpf);
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
