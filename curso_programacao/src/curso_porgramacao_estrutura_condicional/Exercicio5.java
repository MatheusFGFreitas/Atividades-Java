package curso_porgramacao_estrutura_condicional;


import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner sc = new Scanner(System.in);

		int item;
		int quantidade;
		
		double valor;
		
		System.out.println("insira o código do item desejado");
		item = sc.nextInt();
		
		System.out.println("insira a quantidade desejada");
		quantidade = sc.nextInt();
		
		if (item == 1) {
			valor = quantidade * 4.0;
		}
		else if (item == 2) {
			valor = quantidade * 4.5;
		}
		else if (item == 3) {
			valor = quantidade * 5.0;
		}
		else if (item == 4) {
			valor = quantidade * 2.0;
		}
		else {
			valor = quantidade * 1.5;
		}
		
		System.out.printf("o total é: %.2f%n", valor);
			
		sc.close();
	}

}
