package Fixacao.exceptions;

public class DomainException extends Exception{

    private static final long serialVersionUID = 1L;

    public DomainException (String mensage){
        super(mensage);
    }
}
