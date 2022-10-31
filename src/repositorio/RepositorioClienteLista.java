package repositorio;


import cliente.Cliente;
import exceptions.CpfException;

public class RepositorioClienteLista implements InterfaceCliente{
    private Node<Cliente> inicio;
    private Node<Cliente> fim;

    public RepositorioClienteLista() {
        this.inicio = null;
        this.fim = null;
    }


    @Override
    public void cadastrar(Cliente cliente) {
        Node<Cliente> no = new Node<>(cliente);
        if(this.inicio == null){
            this.inicio = no;
        }else{
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
    }

    public void listaClientes(){
        Node<Cliente> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getNome());
            noAtual = noAtual.getProx();
        }
    }
}
