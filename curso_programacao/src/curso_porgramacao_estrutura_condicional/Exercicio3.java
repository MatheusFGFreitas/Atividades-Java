package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "são multiplos" ou "Não são mutiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente
		
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		
		System.out.println("insira o valor A");
		A = sc.nextInt();
		
		System.out.println("insira o valor B");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A ==0) {
			System.out.println("são multiplos");
		}
		else {
			System.out.println("não são multiplos");
		}
		sc.close();
	}

}
