package program;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o valor A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
		
	}

}
