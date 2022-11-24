package entidade.dados;

import entidade.pedido.Pedido;

public interface InterfacePedido {

    void adicionar(Pedido produto);
    void remover(Pedido produto);
    void imprimir();
    void atualizar(Pedido produto, String id);
    void valorTotalDaCompra();

}
