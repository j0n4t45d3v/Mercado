package entidade.dados;

import entidade.funcionario.Funcionario;

public class RepositorioFuncionarioVetor implements InterfaceFuncionario{
    @Override
    public void add(Funcionario funcionario) {

    }

    @Override
    public void remover(Funcionario funcionario) {

    }

    @Override
    public void atualizar(Funcionario funcionario, String cpf) {

    }

    @Override
    public boolean existeFuncionario(String cpf) {
        return false;
    }

    @Override
    public Funcionario buscarFuncionario(String nome) {
        return null;
    }
}
