package dados;


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
    public void cadastrar(Cliente cliente) throws CpfException {
        Node<Cliente> no = new Node<>(cliente);
        if(this.inicio == null){
            this.inicio = no;
        }else{
            Node<Cliente> noAtual = this.inicio;
            boolean verificacao = false;

            while(noAtual != null){
                if(noAtual.getValue().getCpf().equals(cliente.getCpf())){
                    verificacao = true;
                }
            }

            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;

        throw new CpfException("usuario já existe!");
    }

    @Override
    public void removerCliente(Cliente cliente) {
        Node<Cliente> noAtual = this.inicio;

        while(noAtual != null && noAtual.getValue() != cliente){
            noAtual = noAtual.getProx();
        }

        if(this.inicio.equals(noAtual)){
            this.inicio = noAtual.getProx();
            this.inicio.setAnt(null);
        }else if(this.fim.equals(noAtual)){
            this.fim = noAtual.getAnt();
            this.fim.setProx(null);
        }else{
            noAtual.getAnt().setProx(noAtual.getProx());
            noAtual.getProx().setAnt(noAtual.getAnt());
        }
    }

    public void listaClientes(){
        Node<Cliente> noAtual = this.inicio;

        while(noAtual != null){
            System.out.println(noAtual.getValue().getNome());
            noAtual = noAtual.getProx();
        }
    }
}
