package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio2Enquanto {

	public static void main(String[] args) {
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("Segundo");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
	
}
