package entidade.funcionario;

import entidade.dados.RepositorioClienteLista;
import entidade.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private RepositorioClienteLista rcl = new RepositorioClienteLista();

    public Funcionario(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    /*public void cadastrarCliente(Cliente entidade.cliente) throws CpfException{
        String cpfCliente = entidade.cliente.getCpf();
        if(rcl.buscarCliente(cpfCliente)){
            rcl.add(entidade.cliente);
        }else{
            throw new CpfException("qualquer coisa");
        }
    }*/
}
