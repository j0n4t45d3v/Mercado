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
        for(int i = 0 ; i < this.vetor.length; i++){
            if (this.vetor[i].getCpf().equals(funcionario.getCpf())){
                this.vetor[i] = null;
                break;
            }
        }

    }

    @Override
    public void atualizar(Funcionario funcionario, String cpf) {
        for (int i = 0 ; i <this.vetor.length ; i++){
            if (this.vetor[i] != null){
                String id = this.vetor[i].getCpf();
                if (cpf.equals(id) ) this.vetor[i] = funcionario;
            }
        }
    }

    @Override
    public boolean existeFuncionario(String cpf) {
        boolean retorno = false;
        for (Funcionario funcionario : this.vetor) {
            if (funcionario != null) {
                String id = funcionario.getCpf();
                if (cpf.equals(id)) {
                    retorno = true;
                    break;
                }
            }
        }
        return retorno;
    }

    @Override
    public Funcionario buscarFuncionario(String cpf) {
        Funcionario funcionarioEncontrado = null;
        for (Funcionario funcionario : this.vetor) {
            if (funcionario != null) {
                String id = funcionario.getCpf();
                if (id.equals(cpf)) {
                    funcionarioEncontrado = funcionario;
                    break;
                }
            }
        }
        return funcionarioEncontrado;
    }

    @Override
    public void imprimir() {
        for (Funcionario funcionario : this.vetor) {
            if(funcionario != null) {
                System.out.println(funcionario.getNome()+" "+ funcionario.getCargo());
            }
        }
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
