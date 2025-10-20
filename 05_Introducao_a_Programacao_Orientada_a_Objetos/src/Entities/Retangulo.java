package Entities;

public class Retangulo {

	public double a;
	public double b;
	
	public double area() {
		double resultA = a * b;
		return resultA;
	}
	
	public double perimetro() {
		double resultB = a + a + b + b;
		return resultB;
	}
	
	public double diagonal() {
		double resultC = Math.sqrt((a * a) + (b * b));
		return resultC;
	}
}
