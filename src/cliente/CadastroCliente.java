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
            throw new CpfException("Cpf invalido!");
        }else if(clientes.existeCliente(cliente.getCpf())){
            throw new CpfException("Usuario já cadastrado!");
        } else{
           clientes.add(cliente);
        }
    }

}
