package dados;

import cliente.Cliente;
import produto.Produto;

public interface InterfaceProduto {

    default void add(Produto produto){}
    default void remover(String nomeProduto){}
    void atualizar(Produto produto, String id);
    boolean existeProduto(String id) ;
    Cliente buscarProduto(String nomeProduto);

}
