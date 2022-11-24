package entidade.exceptions;

public class PedidoException extends Exception{
    public PedidoException() {super("Não temos o produto no estoque");}
    public PedidoException(String msg) {super(msg);}
}
