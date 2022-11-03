package dados;

import cliente.Cliente;
import exceptions.CpfException;

public interface InterfaceCliente {

    default void add(Cliente cliente) throws CpfException {}
    default void remover(Cliente cliente) throws CpfException {}
    default void add(RepositorioClienteLista clientes){

    }
}
