package entidade.dados;

import entidade.dados.RepositorioFuncionarioVetor;
import entidade.dados.RepositorioProdutoVetor;
import entidade.exceptions.CpfException;
import entidade.exceptions.DataException;
import entidade.exceptions.IdProdutoException;
import entidade.funcionario.CadastroFuncionario;
import entidade.funcionario.Funcionario;
import entidade.produto.CadastroProduto;
import entidade.produto.Produto;

public class OBbjetoComOsDados {
    private InterfaceProduto rp;
    private InterfaceFuncionario rf;


    public OBbjetoComOsDados(InterfaceProduto rp){
        this.rp = rp;
    }
    public OBbjetoComOsDados(InterfaceProduto rp, InterfaceFuncionario rf){
        this.rp = rp;
        this.rf = rf;
    }

    public void adicionarProdutos() throws IdProdutoException {
        CadastroProduto cp = new CadastroProduto(rp);
        Produto p = new Produto("banana", "123456789072", 1.23, 400);
        Produto p1 = new Produto("maçã", "123456789016", 1.23, 400);
        Produto p2 = new Produto("pera", "123456789052", 1.23, 400);
        Produto p3 = new Produto("goiaba", "123456789014", 1.23, 400);
        Produto p4 = new Produto("manga", "123456789013", 1.23, 400);
        Produto p5 = new Produto("cajú", "123456789011", 1.23, 400);
        Produto p6 = new Produto("coco", "123456789012", 1.23, 400);
        cp.adicionarProduto(p);
        cp.adicionarProduto(p1);
        cp.adicionarProduto(p2);
        cp.adicionarProduto(p3);
        cp.adicionarProduto(p4);
        cp.adicionarProduto(p5);
        cp.adicionarProduto(p6);
    }

    public void adicionarFuncionarios() throws CpfException, DataException {
        CadastroFuncionario cf = new CadastroFuncionario(rf);
        Funcionario gerente = new Funcionario("Cleberson", "30/02/1980", "23476580123", "gerente");
        Funcionario joao = new Funcionario("João", "31/12/2000", "21476580123", "repositor");
        Funcionario cleito = new Funcionario("Cleiton", "13/10/1999", "23473580123", "repositor");
        Funcionario pedro = new Funcionario("Pedro", "17/06/2001", "23476680123", "repositor");
        Funcionario carlos = new Funcionario("Carlos", "21/03/1994", "23076580123", "repositor");
        Funcionario fatima = new Funcionario("Fatima", "28/04/1998", "13476580123", "repositor");
        cf.cadastrarFuncionario(gerente);
        cf.cadastrarFuncionario(joao);
        cf.cadastrarFuncionario(cleito);
        cf.cadastrarFuncionario(pedro);
        cf.cadastrarFuncionario(carlos);
        cf.cadastrarFuncionario(fatima);
    }
}
