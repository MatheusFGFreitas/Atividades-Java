package curso_porgramacao_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ex2FacaEnquanto {

	public static void main(String[] args) {
		// no "jeitinho"

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp = 's';

		while (resp != 'n') {
			System.out.print("digite a temperatura em Celsius: ");
			Double C = sc.nextDouble();
			Double F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Farhrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		}
		sc.close();
	}

}
