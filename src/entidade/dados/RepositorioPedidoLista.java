package entidade.dados;

import entidade.cliente.Cliente;
import entidade.funcionario.Funcionario;
import entidade.pedido.Pedido;
import entidade.produto.Produto;

public class RepositorioPedidoLista implements InterfacePedido{
    private Node<Pedido> inicio;
    private Node<Pedido> fim;

    private int tamanho;

    public RepositorioPedidoLista() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void adicionar(Pedido produto) {
        Node<Pedido> no = new Node<>(produto);

        if(this.inicio == null){
            this.inicio = no;
        }else{
            this.fim.setProx(no);
            no.setAnt(this.fim);
        }
        this.fim = no;
    }

    @Override
    public void remover(Pedido produto) {
        Node<Pedido> noAtual = this.inicio;

        while(noAtual != null && noAtual.getValue() != produto){
            noAtual = noAtual.getProx();
        }

        if(noAtual != null && noAtual.equals(this.inicio) && noAtual.equals(this.fim)){
            this.inicio.setValue(null);
            this.fim.setValue(null);
            this.fim.setAnt(null);
        }else if(this.inicio != null && this.inicio.equals(noAtual)){
            this.inicio = noAtual.getProx();
            this.inicio.setAnt(null);
        }else if(this.fim.equals(noAtual)){
            this.fim = noAtual.getAnt();
            this.fim.setProx(null);
        }else{
            noAtual.getAnt().setProx(noAtual.getProx());
            noAtual.getProx().setAnt(noAtual.getAnt());
        }
        tamanho--;
    }

    @Override
    public void imprimir() {
        Node<Pedido> noAtual = this.inicio;
        if (this.tamanho>0){
            while(noAtual != null){
                System.out.println(noAtual.getValue().getProduto().getNome() +", preço: "+ noAtual.getValue().getPreco());
                noAtual = noAtual.getProx();
            }
        }else {
            System.out.println("Lista vazia!");
        }

    }

    @Override
    public void atualizar(Pedido produto, String id) {
        Node<Pedido> noAtualizar = this.inicio;
        while (noAtualizar!=null && noAtualizar.getValue()!= produto){
            noAtualizar = noAtualizar.getProx();
        }
    }

    @Override
    public void valorTotalDaCompra() {
        double valor = 0;
        Node<Pedido> no = this.inicio;
        while(no!=null){
            valor += no.getValue().getPreco();
            no = no.getProx();
        }
        System.out.println("O Valor Total das Compras e "+valor);
    }

    @Override
    public Pedido buscarProduto(Produto produto) {
        Node<Pedido> noBusca = this.inicio;
        String pedidoNoAtual = noBusca.getValue().getProduto().getNome();
        Pedido pedido = noBusca.getValue();

        while(noBusca != null && !pedidoNoAtual.equals(produto.getNome())){
            noBusca = noBusca.getProx();
        }

        return pedido;
    }


}
