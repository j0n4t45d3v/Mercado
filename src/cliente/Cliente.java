package cliente;

import pedido.Item;
import pessoa.Pessoa;
import produto.Produto;

public class Cliente extends Pessoa {

    private Item[] pedidos;
    private String formaDePagamento;
    private int indice;

    public Cliente(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.indice = 0;
        this.pedidos = new Item[10];
    }

//    passivel de auteração!
    public void adicionarProdutoNoCarrinho(Produto produto, int qtd){
        Item item = new Item(produto, qtd);
        if(indice == pedidos.length){
            Item[] auxiliar = new Item[pedidos.length * 2];
            for(int i = 0; i < pedidos.length; i++){
                auxiliar[i] = pedidos[i];
            }
            pedidos = auxiliar;
        }
        pedidos[indice] = item;
        indice++;
    }

    public void setPedidos(Item[] pedidos) {
        this.pedidos = pedidos;
    }

    public Item[] getPedidos() {
        return pedidos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
