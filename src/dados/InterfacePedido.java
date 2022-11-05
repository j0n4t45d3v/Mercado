package dados;

import pedido.Itens;

public interface InterfacePedido {

    default void add(Itens item){}
    default void remover(String item){}

}
