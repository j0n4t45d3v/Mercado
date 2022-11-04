package dados;

import cliente.Cliente;

public interface InterfaceCliente {

    default void addVetor(Cliente cliente){}
    default void remover(Cliente cliente){}
    default void addVetor(RepositorioClienteLista clientes){

    }
}
