package dados;

import pedido.Item;

public interface InterfaceProduto {

    default void add(Item item){}
    default void remover(String item){}

}
