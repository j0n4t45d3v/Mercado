package dados;

import cliente.Cliente;
import exceptions.CpfException;

public interface InterfaceCliente {

    default void cadastrar(Cliente cliente) throws CpfException {}
    default void removerCliente(Cliente cliente) throws CpfException {}
}
