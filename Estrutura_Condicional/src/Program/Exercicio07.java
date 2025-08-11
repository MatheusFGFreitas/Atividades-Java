package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		
		System.out.print("Insira o numero do eixo X: ");
		X = sc.nextDouble();
		
		System.out.print("Insira o numero do eixo Y: ");
		Y = sc.nextDouble();
		
		if(X > 0 && Y > 0) {
			System.out.println("Quadrante Q1");
		}else if (X < 0 && Y > 0) {
			System.out.println("Quadrante Q2");
		}else if (X <0 && Y < 0) {
			System.out.println("Quadrante Q3");
		}else if (X > 0 && Y < 0 ) {
			System.out.println("Quadrante Q4");
		}else {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
