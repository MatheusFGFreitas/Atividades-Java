package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class exercicioRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo ();
		
		System.out.println("Por favor entre a Altura e Largura do Retangulo");
		retangulo.A = sc.nextDouble();
		retangulo.L = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		sc.close();

	}

}
