package entities;

public class Funcionario {

	public String nome;
	public double bruto;
	public double imposto;
	
	public double liquido() {
		return bruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		bruto += bruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $:" + String.format("%.2f", liquido());
	}
	
}
