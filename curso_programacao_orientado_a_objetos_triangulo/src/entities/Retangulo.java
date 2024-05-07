package entities;

public class Retangulo {
	
	public double A;
	public double L;
	
	public double area() {
		return A * L;
	}
	
	public double perimetro() {
		return 2 * (A + L);
	}
	
	public double diagonal() {
		return Math.sqrt(L * L + A * A);
	}
}
