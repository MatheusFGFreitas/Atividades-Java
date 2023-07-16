package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio7Para {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		// exemplo.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			int V = i;
			int V1 = V * V;
			int V2 = V * V * V;
			System.out.print(V + " ");
			System.out.print(V1 + " ");
			System.out.println(V2 + " ");
		}
		sc.close();
	}

}
