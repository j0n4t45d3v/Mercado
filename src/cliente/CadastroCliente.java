package cliente;

import dados.InterfaceCliente;
import exceptions.CpfException;

public class CadastroCliente {
    private InterfaceCliente clientes;

    public CadastroCliente(InterfaceCliente clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(Cliente cliente) throws CpfException {
        if(cliente.getCpf().length() != 11){
            throw new CpfException();
        }else{
           clientes.add(cliente);
        }
    }

}
