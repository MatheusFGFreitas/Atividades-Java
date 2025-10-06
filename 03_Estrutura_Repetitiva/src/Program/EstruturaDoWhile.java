package Program;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%", F);
		
			System.out.print("Deseja repetir? (s/n)");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		
		sc.close();

	}

}
