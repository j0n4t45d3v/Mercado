package entidade.dados;

import entidade.funcionario.Funcionario;
import entidade.pedido.Pedido;
import entidade.produto.Produto;

public class RepositorioPedidoVetor implements InterfacePedido{
    private Pedido[] vetor;
    private int indice;

    public RepositorioPedidoVetor(int tamanho) {
        this.vetor = new Pedido[tamanho];
        this.indice = 0;
    }

    @Override
    public void adicionar(Pedido produto) {
        if (this.vetor.length == indice){
            Pedido[] aux = new Pedido[indice * 2];
            for (int i = 0 ; i < indice ; i++){
                aux[i] = this.vetor[i];
            }
            this.vetor = aux;
        }
        this.vetor[indice] = produto;
        indice++;
    }

    @Override
    public void remover(Pedido produto) {
        for(int i = 0 ; i < this.vetor.length; i++){
            if (this.vetor[i].getProduto().getId().equals(produto.getProduto().getId())){
                this.vetor[i] = null;
                break;
            }
        }
    }

    @Override
    public void imprimir() {
        for (Pedido pedido : this.vetor) {
            if (pedido != null) {
                System.out.println(pedido.getProduto().getNome()+", preço: "+ pedido.getPreco());
            }
        }
    }

    @Override
    public void atualizar(Pedido produto, String nome) {
        for (int i = 0 ; i <this.vetor.length ; i++){
            if (this.vetor[i] != null){
                String nome1 = this.vetor[i].getProduto().getNome();

                if (nome.equals(nome1) ){
                    this.vetor[i] = produto;
                }
            }
        }
    }

    @Override
    public void valorTotalDaCompra() {
        double precoTotal = 0;
        for (Pedido i : this.vetor) {
            if(i != null) {
                precoTotal += i.getPreco();
            }
        }
        System.out.println("Valor Total das Compras é: "+ precoTotal);
    }

    @Override
    public Pedido buscarProduto(Produto produto) {
        Pedido pedidoAtual = null;
        for (Pedido pedido : this.vetor) {
            if (pedido != null) {
                String id = pedido.getProduto().getNome();
                if (id.equals(produto.getNome())) {
                    pedidoAtual = pedido;
                    break;
                }
            }
        }
        return pedidoAtual;
    }


}
