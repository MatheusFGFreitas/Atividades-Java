package vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
	//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
	//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int V;
		double soma, media;
		
		System.out.print("Quantos valores terá o vetor? ");
		V = sc.nextInt();
		
		double[] vetor = new double[V];
		
		for (int i=0; i<V; i++) {
			System.out.print("Digite o valor: ");
				vetor[i] = sc.nextDouble();
		}
		
			soma = 0;
		for (int i=0; i<V; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma / V;
		
		System.out.printf("\nMedia do vetor = %.3f\n", media);
		System.out.println("Numeros abaixo da media:");
		
		for (int i=0; i<V; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		sc.close();
		
	}

}
