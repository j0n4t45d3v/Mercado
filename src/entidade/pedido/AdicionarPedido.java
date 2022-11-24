package entidade.pedido;

import entidade.dados.InterfacePedido;
import entidade.dados.InterfaceProduto;
import entidade.exceptions.PedidoException;
import entidade.produto.Produto;

public class AdicionarPedido {
    private InterfacePedido pedidos;
    private InterfaceProduto produtos;

    public AdicionarPedido(InterfacePedido pedidos, InterfaceProduto produtos) {
        this.pedidos = pedidos;
        this.produtos = produtos;
    }

    public void adicionarItem(Pedido item) throws PedidoException {
        if(produtos.existeProduto(item.getProduto().getId())){
            Produto produto = produtos.buscarProduto(item.getProduto().getNome());

            if(item.getQuantidade() > produto.getQuantidade()){
                throw new PedidoException();
            }else{
                pedidos.adicionar(item);
                produto.setQuantidade(produto.getQuantidade() - item.getQuantidade());
            }
        }else{
            throw new PedidoException();
        }
    }
}
