package entidade.funcionario;

import entidade.dados.InterfaceFuncionario;
import entidade.exceptions.CpfException;

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

    public void buscarFuncionario(String cpfFuncionario){
        String msg = "Cliente não encontrado!";
        if(funcionarios.existeFuncionario(cpfFuncionario)){
            Funcionario funcionario = funcionarios.buscarFuncionario(cpfFuncionario);
            msg = funcionario.getNome()+" | Cpf: "+funcionario.getCpf();
        }
        System.out.println(msg);
    }
}
