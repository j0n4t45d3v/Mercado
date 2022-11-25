package entidade.exceptions;

public class DataException extends Exception{
    public DataException() {
        super("Data de nascimento inválida");
    }
}
