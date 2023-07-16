package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio1Para {

	public static void main(String[] args) {
		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		// X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int Y = 1;
		
		for(int i = 1; Y<=X; i++) {
			System.out.println(Y);
			Y = Y + 2;
		}
	}

}
