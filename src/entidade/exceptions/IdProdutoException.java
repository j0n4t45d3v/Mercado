package entidade.exceptions;

public class IdProdutoException extends Exception{
    public IdProdutoException() {super("Codigo de barra invalido!");}
    public IdProdutoException(String msg){super(msg);}
}
