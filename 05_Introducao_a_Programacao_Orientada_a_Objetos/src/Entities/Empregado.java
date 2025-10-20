package Entities;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double taxa;
	public double porcentagem;
	
	public double salarioLiquido() {
		double resultado = salarioBruto - taxa;
		return resultado;
	}
	
	public double aumentoSalario() {
		double resultado2 = (salarioBruto + ((double)salarioBruto / porcentagem)) - taxa;
		return resultado2;
	}
}
