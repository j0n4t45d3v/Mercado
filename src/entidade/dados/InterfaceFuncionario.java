package entidade.dados;

import entidade.funcionario.Funcionario;

public interface InterfaceFuncionario {
    void add(Funcionario funcionario);
    void remover(Funcionario funcionario);
    void atualizar(Funcionario funcionario, String cpf);
    boolean existeFuncionario(String cpf) ;
    Funcionario buscarFuncionario(String cpf);
    void imprimir();
}
