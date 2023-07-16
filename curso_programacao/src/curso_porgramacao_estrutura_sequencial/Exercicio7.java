package curso_porgramacao_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código da peça 2, o número de peças 2 e o valor unitário de cada peça 2. calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorF1 = quant1 * valor1;
		double valorF2 = quant2 * valor2;
		
		double valorTotal = valorF1 + valorF2;
		
		System.out.printf("Valor a pagar = %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
