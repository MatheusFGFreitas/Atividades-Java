package curso_porgramacao_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Para {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double resultado = (double) a / b;
				System.out.printf("%.1f%n", resultado);
			}
			
		}
		sc.close();
	}

}
