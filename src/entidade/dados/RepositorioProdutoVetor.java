package entidade.dados;

import entidade.produto.Produto;

public class RepositorioProdutoVetor implements InterfaceProduto {

    @Override
    public void add(Produto produto) {
        InterfaceProduto.super.add(produto);
    }

    @Override
    public void remover(String nomeProduto) {
        InterfaceProduto.super.remover(nomeProduto);
    }

    @Override
    public void atualizar(Produto produto, String id) {

    }

    @Override
    public boolean existeProduto(String id) {
        return false;
    }

    @Override
    public Produto buscarProduto(String codigoDeBarra) {
        return null;
    }
}