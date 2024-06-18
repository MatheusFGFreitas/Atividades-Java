package model.exceptions;

public class DomainException extends Exception{//se colocar RuntimeException, não é necessario colocar throws no reservation
	private static final long serialVersionUID = 1L;
//classe para criar uma exceção personalizada
	
	public DomainException(String msg) {
		super(msg);
	}
}
