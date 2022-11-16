package entidade.dados;

import entidade.cliente.Cliente;
import entidade.funcionario.Funcionario;

public class RepositorioFuncionarioVetor implements InterfaceFuncionario{
    private Funcionario [] vetor;
    private int indice;

    public RepositorioFuncionarioVetor(int t) {
      this.vetor = new Funcionario[t];
      this.indice = 0;
    }

    @Override
    public void add(Funcionario funcionario) {
        if (this.vetor.length == indice){
            Funcionario[] aux = new Funcionario[indice * 2];
            for (int i = 0 ; i < indice ; i++){
                aux[i] = this.vetor[i];
            }
            this.vetor = aux;
        }
        this.vetor[indice] = funcionario;
        indice++;
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

    public Funcionario[] getVetor() {
        return vetor;
    }

    public void setVetor(Funcionario[] vetor) {
        this.vetor = vetor;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
