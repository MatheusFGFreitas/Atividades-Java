package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Escreva o valor do raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI * raio * raio;
		
		System.out.printf("Area = %.4f", area);
		
		sc.close();

	}

}
