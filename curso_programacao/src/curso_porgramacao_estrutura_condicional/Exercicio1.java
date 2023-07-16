package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//crie um programa para ler um numero inteiro, depois diga se é negativo ou não

		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("qual é o número?");
		valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("valor positivo");
		}
		else {
			System.out.println("valor negativo");
		}
	sc.close();
	}

}
