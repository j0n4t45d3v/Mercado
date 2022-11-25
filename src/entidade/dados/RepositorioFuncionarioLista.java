package entidade.dados;

import entidade.cliente.Cliente;
import entidade.funcionario.Funcionario;

public class RepositorioFuncionarioLista implements InterfaceFuncionario{
    private Node<Funcionario> inicio;
    private Node<Funcionario> fim;
    private int tamanho;



    public RepositorioFuncionarioLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
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
        no = this.inicio;
        while (no != null && no.getValue() != funcionario) {
            no = no.getProx();
        }
        if (no != null && no.equals(this.inicio) && no.equals(this.fim)){
            this.inicio.setValue(null);
            this.fim.setValue(null);
            this.fim.setAnt(null);
        } else if (this.inicio != null && this.inicio.equals(no)) {
            this.inicio = no.getProx();
            this.inicio.setAnt(null);
        } else if (this.fim.equals(no)) {
            this.fim = no.getAnt();
            this.fim.setProx(null);
        }else {
            no.getAnt().setProx(no.getProx());
            no.getProx().setAnt(no.getAnt());
        }
        tamanho--;
    }


    @Override
    public void atualizar(Funcionario funcionario, String cpf) {
        Node<Funcionario> noAtualizar = this.inicio;
        while (noAtualizar!=null && noAtualizar.getValue()!= funcionario){
        noAtualizar = noAtualizar.getProx();
        }
    }

    @Override
    public boolean existeFuncionario(String cpf) {
        Node<Funcionario> p = this.inicio;
        while (p != null && !p.getValue().getCpf().equals(cpf) ){
            p = p.getProx();
        }
        return p != null;
    }

    @Override
    public Funcionario buscarFuncionario(String cpf) {
        Node<Funcionario> noBusca = this.inicio;
        String cpfNoAtual = noBusca.getValue().getCpf();
        Funcionario funcionario = noBusca.getValue();

        while(noBusca != null && !cpfNoAtual.equals(cpf)){
            noBusca = noBusca.getProx();
        }

        return funcionario;
    }

    @Override
    public void imprimir() {
        Node<Funcionario> noAtual = this.inicio;
        if(this.tamanho>0){
            while(noAtual != null){
                System.out.println(noAtual.getValue().getNome());
                noAtual = noAtual.getProx();
            }
        }else{
            System.out.println("Lista vazia!");
        }
    }
}
