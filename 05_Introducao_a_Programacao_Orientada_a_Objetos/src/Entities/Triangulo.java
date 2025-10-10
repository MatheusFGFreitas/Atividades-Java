package Entities;

public class Triangulo {

	public double a;//o prefixo publico indica que podera ser usado em outros arquivos
	public double b;//atributos da classe triangulo
	public double c;
	
	public double area() {//trazendo o calculo do triangulo para a entidade triangulo, para deixar o codigo mais limpo e delegando responsabilidade para a classe triangulo
		double p = (a + b+ c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

}
