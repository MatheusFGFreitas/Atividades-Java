package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio5Para {

	public static void main(String[] args) {
		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por definição, fatorial de 0 é 1.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int FAT = 1;
		for(int i=1; i<=N; i++) {
			FAT = FAT * i;
		}
		
		System.out.println(FAT);
		sc.close();
	}

}
