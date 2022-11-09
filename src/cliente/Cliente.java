package cliente;

import dados.RepositorioPedidoLista;
import pedido.Item;
import pessoa.Pessoa;

public class Cliente extends Pessoa {

    private Item[] pedidos;
    private String formaDePagamento;
    private int tamanho;

    public Cliente(String nome, String dataNascimento, String cpf, int tamanho) {
        super(nome, dataNascimento, cpf);
        this.tamanho = tamanho;
    }

    public void adicionarProduto(){
        
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
