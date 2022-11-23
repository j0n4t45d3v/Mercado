package entidade.dados;

import entidade.funcionario.Funcionario;

public class RepositorioFuncionarioLista implements InterfaceFuncionario{
    private Node<Funcionario> inicio;
    private Node<Funcionario> fim;
    private int tamanho;

    public RepositorioFuncionarioLista() {
    }

    public RepositorioFuncionarioLista(Node<Funcionario> inicio, Node<Funcionario> fim, int tamanho) {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void add(Funcionario funcionario) {
        Node<Funcionario> no = new Node<>(funcionario);
        if (this.inicio == null){
            this.inicio = no;
        }else {
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
        tamanho++;
    }

    @Override
    public void remover(Funcionario funcionario) {
        Node<Funcionario> no = new Node<>(funcionario);
    }

    @Override
    public void atualizar(Funcionario funcionario, String cpf) {

    }

    @Override
    public boolean existeFuncionario(String cpf) {
        return false;
    }

    @Override
    public Funcionario buscarFuncionario(String cpf) {
        return null;
    }

    @Override
    public void imprimir() {

    }
}
