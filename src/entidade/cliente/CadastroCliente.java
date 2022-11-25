package entidade.cliente;

import entidade.dados.InterfaceCliente;
import entidade.exceptions.CpfException;
import entidade.exceptions.DataException;

public class CadastroCliente {
    private InterfaceCliente clientes;

    public CadastroCliente(InterfaceCliente clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(Cliente cliente) throws CpfException, DataException {
        if(cliente.getCpf().length() != 11){
            throw new CpfException("Cpf invalido!");
        }else if(cliente.getDataNascimento().length() != 10){
            throw new DataException();
        }else if(clientes.existeCliente(cliente.getCpf())){
            throw new CpfException("Usuario já cadastrado!");
        } else{
           clientes.add(cliente);
        }
    }

    public Cliente buscarCliente(String cpfCliente){
        String msg = "Cliente não encontrado!";
        Cliente cliente = null;
        if(clientes.existeCliente(cpfCliente)){
            cliente = clientes.buscarCliente(cpfCliente);
            msg = "Cliente encontrado";
        }
        System.out.println(msg);
        return cliente;
    }

}
