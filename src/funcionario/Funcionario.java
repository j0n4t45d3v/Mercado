package funcionario;

import cliente.Cliente;
import dados.Node;
import exceptions.CpfException;
import pessoa.Pessoa;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    public void cadastroCliente(){
        /*Node<Cliente> noAtual = this.inicio;
        boolean verificacao = false;
        while(noAtual != null){
            if(noAtual.getValue().getCpf().equals(cliente.getCpf())){
                verificacao = true;
            }
            noAtual = noAtual.getProx();
        }

        if(verificacao){

        }else{
            throw new CpfException("usuario já existe!");
        }*/
    }
}
