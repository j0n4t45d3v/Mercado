package entidade.dados;

import entidade.pedido.Pedido;

public class RepositorioPedidoVetor implements InterfacePedido{
    private Pedido[] vetor;
    private int indice;

    public RepositorioPedidoVetor(int tamanho) {
        this.vetor = new Pedido[tamanho];
        this.indice = 0;
    }

    @Override
    public void adicionar(Pedido produto) {

    }

    @Override
    public void remover(Pedido produto) {

    }

    @Override
    public void imprimir() {

    }

    @Override
    public void atualizar(Pedido produto, String id) {

    }

    @Override
    public void valorTotalDaCompra() {

    }
}
