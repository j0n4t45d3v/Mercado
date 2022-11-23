package entidade.dados;

import entidade.dados.RepositorioFuncionarioVetor;
import entidade.dados.RepositorioProdutoVetor;
import entidade.exceptions.IdProdutoException;
import entidade.produto.CadastroProduto;
import entidade.produto.Produto;

public class OBbjetoComOsDados {
    private RepositorioProdutoVetor rpv;

    public OBbjetoComOsDados(RepositorioProdutoVetor rpv){
        this.rpv = rpv;
    }

    public void adicionarProdutos() throws IdProdutoException {
        CadastroProduto cp = new CadastroProduto(rpv);
        Produto p = new Produto("banana", "123456789012", 1.23, 400);
        Produto p1 = new Produto("maçã", "123456789012", 1.23, 400);
        Produto p2 = new Produto("pera", "123456789012", 1.23, 400);
        Produto p3 = new Produto("goiaba", "123456789012", 1.23, 400);
        Produto p4 = new Produto("manga", "123456789012", 1.23, 400);
        Produto p5 = new Produto("cajú", "123456789012", 1.23, 400);
        Produto p6 = new Produto("coco", "123456789012", 1.23, 400);
        cp.adicionarProduto(p);
        cp.adicionarProduto(p1);
        cp.adicionarProduto(p2);
        cp.adicionarProduto(p3);
        cp.adicionarProduto(p4);
        cp.adicionarProduto(p5);
        cp.adicionarProduto(p6);
    }
}
