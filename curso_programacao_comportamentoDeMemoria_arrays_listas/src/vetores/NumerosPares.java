package vetores;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// faça um programa que leia N numeros inteiros e armazene-os em um vetor. Em seguida,
		//mostre na tela todos os números pares, e também a quantidade de números pares
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		int [] num = new int [n];
		int par = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("Números pares:");
		for(int i = 0; i<n; i++) {
			if(num[i] % 2 == 0) {
				System.out.printf("%d\n", num[i]);
				par++;
			}
		}
		
		System.out.printf("Quantidade de pares = %d\n", par);
		
		sc.close();

	}

}
