package entidade.funcionario;

import entidade.dados.InterfaceFuncionario;
import entidade.exceptions.CpfException;
import entidade.exceptions.DataException;

public class CadastroFuncionario {
    private InterfaceFuncionario funcionarios;

    public CadastroFuncionario(InterfaceFuncionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario) throws CpfException, DataException {
        String cpfFuncionario = funcionario.getCpf();
        if(cpfFuncionario.length() != 11){
            throw new CpfException("Cpf invalido!"+cpfFuncionario.length());
        } else if (funcionario.getDataNascimento().length() != 10) {
            throw new DataException();
        } else if (funcionarios.existeFuncionario(cpfFuncionario)) {
            throw new CpfException("Funcionario já cadastrado!");
        }else{
            funcionarios.add(funcionario);
        }
    }

    public void buscarFuncionario(String cpfFuncionario){
        String msg = "Funcionario não encontrado!";
        if(funcionarios.existeFuncionario(cpfFuncionario)){
            Funcionario funcionario = funcionarios.buscarFuncionario(cpfFuncionario);
            msg = funcionario.getNome()+" | Cpf: "+funcionario.getCpf();
        }
        System.out.println(msg);
    }
}
