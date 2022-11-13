package pedido;

import produto.Produto;

public class Pedido {
    private Item[] pedidos;
    private int indice;

    public Pedido() {
        this.pedidos = new Item[10];
        this.indice = 0;
    }

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

    public Item[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Item[] pedidos) {
        this.pedidos = pedidos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
