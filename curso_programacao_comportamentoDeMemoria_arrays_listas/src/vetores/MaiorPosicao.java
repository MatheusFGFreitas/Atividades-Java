package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		//considerando a primeira posição como 0 (zero). 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n, posicao;
		double maior;
		
		System.out.print("Quantos números você ira digitar? ");
		n = sc.nextInt();
		
		double [] valor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			valor[i] = sc.nextDouble();
		}
		
		maior = valor[0];
		posicao = 0;
		
		for(int i=1; i<n; i++) {
			if (valor[i] > maior) {
				maior = valor[i];
				posicao = i;
			}
		}
		
		System.out.printf("Maior Valor = %.1f\n", maior);
		System.out.printf("Posição do maior valor = %d\n", posicao);
		sc.close();
		
	}

}
