package dados;

import pedido.Item;

public interface InterfacePedido {

    default void add(Item item){}
    default void remover(String item){}

}
