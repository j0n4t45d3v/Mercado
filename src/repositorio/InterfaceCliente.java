package repositorio;

import cliente.Cliente;
import exceptions.CpfException;

public interface InterfaceCliente {

    default void cadastrar(Cliente cliente) {}
    default void removerCliente(Cliente cliente) {}
}
