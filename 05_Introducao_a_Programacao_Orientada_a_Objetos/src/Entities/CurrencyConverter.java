package Entities;

public class CurrencyConverter {

	public double preco;
	public double quantidade;
	public static final double taxa = 0.06;
	
	public double pagamento() {
		return quantidade * preco + (quantidade * preco * taxa);
	}
}
