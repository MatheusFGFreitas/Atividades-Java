package curso_porgramacao_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Ex1FacaEnquanto {

	public static void main(String[] args) {
		//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
		//Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
		//programa.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		Double F = 9.0 * C / 5.0 + 32;
		System.out.printf("Equivalente em Farhrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)?");
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.print("digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Farhrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
								
		}
		
		sc.close();
	}

}
