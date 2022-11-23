package entidade.dados;

import entidade.produto.Produto;

public interface InterfaceProduto {

    void add(Produto produto);
    void remover(Produto produto);
    void atualizar(Produto produto, String id);
    boolean existeProduto(String id);
    Produto buscarProduto(String nome);

    void imprimir();
}
