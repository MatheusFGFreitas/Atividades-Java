package entities;

public class Triangulo {//nome da classe

	public double a;
	public double b;	//atributos da classe
	public double c;
	
	public double area() {	//métodos da classe
		double p = (a + b+ c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}


