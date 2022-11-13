package funcionario;

import cliente.Cliente;
import dados.RepositorioClienteLista;
import exceptions.CpfException;
import pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private RepositorioClienteLista rcl = new RepositorioClienteLista();

    public Funcionario(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    /*public void cadastrarCliente(Cliente cliente) throws CpfException{
        String cpfCliente = cliente.getCpf();
        if(rcl.buscarCliente(cpfCliente)){
            rcl.add(cliente);
        }else{
            throw new CpfException("qualquer coisa");
        }
    }*/
}
