package dados;

import cliente.Cliente;

public interface InterfaceCliente {

    void add(Cliente cliente);
    void remover(Cliente cliente);
    void atualizar(Cliente cliente, String cpf);
    boolean existeCliente(String cpf);
    Cliente buscarCliente(String nome);

}
