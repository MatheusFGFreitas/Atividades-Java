package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {
		
		//faça um programa que leia um número inteiro positivo N(Máximo = 10) e depois N 
		//números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os
		//números negativos lidos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		
		int n;
		
		n = sc.nextInt();
		
		double [] vect = new double [n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect [i] = sc.nextDouble();
		}
		
		System.out.println("Números negativos: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] <0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		
		sc.close();

	}

}
