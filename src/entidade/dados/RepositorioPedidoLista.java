package entidade.dados;

import entidade.pedido.Pedido;
import entidade.produto.Produto;

public class RepositorioPedidoLista implements InterfacePedido{
    private Node<Pedido> inicio;
    private Node<Pedido> fim;

    public RepositorioPedidoLista() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void adicionar(Pedido produto) {
        Node<Pedido> no = new Node<>(produto);

        if(this.inicio == null){
            this.inicio = no;
        }else{
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
    }

    @Override
    public void remover(Pedido produto) {

    }

    @Override
    public void imprimir() {
        Node<Pedido> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getProduto().getNome() +", preço: "+ noAtual.getValue().getPreco());
            noAtual = noAtual.getProx();
        }
    }

    @Override
    public void atualizar(Pedido produto, String id) {

    }

    @Override
    public void valorTotalDaCompra() {

    }

    @Override
    public Pedido buscarProduto(Produto produto) {
        Node<Pedido> noBusca = this.inicio;
        String pedidoNoAtual = noBusca.getValue().getProduto().getNome();
        Pedido pedido = noBusca.getValue();

        while(noBusca != null && !pedidoNoAtual.equals(produto.getNome())){
            noBusca = noBusca.getProx();
        }

        return pedido;
    }


}
