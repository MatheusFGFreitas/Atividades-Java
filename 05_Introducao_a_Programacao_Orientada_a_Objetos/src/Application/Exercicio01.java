package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Entre as medidas do retangulo:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		double diagonalX = x.diagonal();
		
		System.out.printf("Area =  %.2f%n", areaX);
		System.out.printf("Perimetro =  %.2f%n", perimetroX);
		System.out.printf("Diagonal =  %.2f%n", diagonalX);
		
		sc.close();

	}

}
