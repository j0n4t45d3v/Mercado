package cliente;

import pedido.Item;
import pessoa.Pessoa;
import produto.Produto;

public class Cliente extends Pessoa {

    private Item[] pedidos;
    private String formaDePagamento;
    private int tamanho;

    public Cliente(String nome, String dataNascimento, String cpf, int tamanho) {
        super(nome, dataNascimento, cpf);
        this.tamanho = tamanho;
        this.pedidos = new Item[tamanho];
    }



    public void setPedidos(Item[] pedidos) {
        this.pedidos = pedidos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
