package dados;

import cliente.Cliente;

public interface InterfaceCliente {

    default void add(Cliente cliente){}
    default void remover(Cliente cliente){}
    default void add(RepositorioClienteLista clientes){

    }
}
