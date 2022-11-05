package funcionario;

import cliente.Cliente;
import dados.Node;
import dados.RepositorioClienteLista;
import exceptions.CpfException;
import pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private RepositorioClienteLista rcl = new RepositorioClienteLista();

    public Funcionario(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    public void cadastrarCliente(Cliente cliente) throws CpfException{

        if(rcl.buscaCpf(cliente.getCpf())){
            rcl.add(cliente);
        }else{
            throw new CpfException("Usuario ja existe!");
        }
    }
}
