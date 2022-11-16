package entidade.dados;

import entidade.produto.Produto;

public class RepositorioProdutoVetor implements InterfaceProduto {

    private Produto[] produto;

    private int indice;

    public RepositorioProdutoVetor(int t) {
        this.produto = new Produto[t];
        this.indice = 0;
    }

    @Override
    public void add(Produto produto) {

    }

    @Override
    public void remover(Produto produto) {

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
