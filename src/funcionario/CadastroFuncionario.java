package funcionario;

import dados.InterfaceFuncionario;
import exceptions.CpfException;

public class CadastroFuncionario {
    private InterfaceFuncionario funcionarios;

    public CadastroFuncionario(InterfaceFuncionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario) throws CpfException {
        String cpfFuncionario = funcionario.getCpf();
        if(cpfFuncionario.length() != 11){
            throw new CpfException("Cpf invalido!");
        } else if (funcionarios.existeFuncionario(cpfFuncionario)) {
            throw new CpfException("Funcionario já cadastrado!");
        }else{
            funcionarios.add(funcionario);
        }
    }
}
