package repositorio;

import cliente.Cliente;
import exceptions.CpfException;

public interface InterfaceCliente {

    public default void cadastrar(Cliente cliente) {}
}
