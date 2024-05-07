package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		// - imprimir todos os elementos do vetor
		// - Mostrar na tela a soma e a média dos elementos do vetor
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números você ira digitar? ");
			n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
			soma = 0;
		for(int i=0; i<vet.length; i++) {
			soma = soma + vet[i];
		}
		
		media = soma / n;
		
			System.out.print("Valores incluidos: ");
			
		for(int i=0; i<vet.length; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		System.out.printf("A soma é: %.2f\n", soma);
		System.out.printf("A media é: %.2f\n", media);
		
			sc.close();
	}

}
