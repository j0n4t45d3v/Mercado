package entidade.dados;

import entidade.produto.Produto;

public interface InterfaceProduto {

    default void add(Produto produto){}
    default void remover(String nomeProduto){}
    void atualizar(Produto produto, String id);
    boolean existeProduto(String id) ;
    Produto buscarProduto(String codigoDeBarra);

}
