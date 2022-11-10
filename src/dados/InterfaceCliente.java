package dados;

import cliente.Cliente;
import exceptions.CpfException;

public interface InterfaceCliente {

    void add(Cliente cliente);
    void remover(Cliente cliente);
    void atualizar(Cliente cliente, String cpf);
    boolean existeCliente(String cpf) throws CpfException;
    Cliente buscarCliente(String nome);

}
