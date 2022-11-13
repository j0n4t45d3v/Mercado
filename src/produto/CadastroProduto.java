package produto;

import dados.InterfaceProduto;
import exceptions.IdProdutoException;

public class CadastroProduto {
    private InterfaceProduto produtos;

    public CadastroProduto(InterfaceProduto produto) {
        this.produtos = produto;
    }

    public void adicionarProduto(Produto produto) throws IdProdutoException {
        if(produto.getId().length() != 12){
            throw new IdProdutoException();
        }else if(produtos.existeProduto(produto.getId())){
            produtos.atualizar(produto, produto.getId());
        }else{
            produtos.add(produto);
        }
    }

    public void buscarProduto(String codigoDeBarra){
        String msg = "Produto não encontrado!";
        if(produtos.existeProduto(codigoDeBarra)){
            Produto produto = produtos.buscarProduto(codigoDeBarra);
            msg = produto.getNome()+", preço: "+ produto.getPreco()+", quantidade: "+ produto.getQuantidade();
        }
        System.out.println(msg);
    }
}
