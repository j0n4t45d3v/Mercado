package entidade.dados;

import entidade.pedido.Pedido;
import entidade.produto.Produto;

public interface InterfacePedido {

    void adicionar(Pedido produto);
    void remover(Pedido produto);
    void imprimir();
    void atualizar(Pedido produto, String id);
    void valorTotalDaCompra();
    Pedido buscarProduto(Produto produto);
}
