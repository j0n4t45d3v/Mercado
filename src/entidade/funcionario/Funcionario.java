package entidade.funcionario;

import entidade.cliente.CadastroCliente;
import entidade.dados.RepositorioClienteLista;
import entidade.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    public Funcionario(String nome, String dataNascimento, String cpf, String cargo) {
        super(nome, dataNascimento, cpf);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
