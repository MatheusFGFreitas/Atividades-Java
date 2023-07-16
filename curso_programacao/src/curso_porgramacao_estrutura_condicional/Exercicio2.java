package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("insira o número");
		valor = sc.nextInt();
		
		
		if (valor % 2 == 0) {
			System.out.println("numero par");
		}
		else {
			System.out.println("numero impar");
		}
		sc.close();
	}

}
