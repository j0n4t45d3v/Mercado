package entidade.dados;

import entidade.funcionario.Funcionario;
import entidade.produto.Produto;

public class RepositorioProdutoVetor implements InterfaceProduto {

    private Produto[] vetor;

    private int indice;

    public RepositorioProdutoVetor(int t) {
        this.vetor = new Produto[t];
        this.indice = 0;
    }

    @Override
    public void add(Produto produto) {
    if (this.vetor.length == indice){
        Produto[] aux = new Produto[indice * 2];
        for (int i = 0 ; i <indice; i++){
            aux[i] = vetor[i];
        }
        this.vetor = aux;
    }
    this.vetor[indice]= produto;
    indice++;
    }

    @Override
    public void remover(Produto produto) {
        for (int i = 0 ; i < this.vetor.length; i++){
            if (this.vetor[i].getId().equals(produto.getId())){
                this.vetor[i] = null;
            }
        }

    }

    @Override
    public void atualizar(Produto produto, String id) {
        for (int i = 0 ; i < this.vetor.length ; i++){
            if (this.vetor[i] != null){
                if (this.vetor[i].getId().equals(id)){
                    this.vetor[i] = produto;
                }
            }

        }
    }
//ajustar
    @Override
    public boolean existeProduto(String id) {
        boolean produtoEncontrado = false;
        for (Produto produto : this.vetor) {
            if(produto != null){
                if (id.equals(produto.getId())) {
                    produtoEncontrado = true;
                    break;
                }
            }
            break;
        }
        return produtoEncontrado;
    }

    @Override
    public Produto buscarProduto(String nome) {
        Produto existe = null;
        for (Produto produto : this.vetor) {
            if (produto.getId().equals(nome)){
                existe = produto;
            }
        }
        return existe;
    }

    @Override
    public void imprimir() {
        for (Produto produto : this.vetor) {
            if(produto != null) {
                System.out.println(produto.getNome()+" estoque = "+produto.getQuantidade());
            }
        }
    }
}
