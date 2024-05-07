package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
	//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
	//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
	//o vetor C gerado. 	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int V;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		V = sc.nextInt();
		
		int [] A = new int [V];
		int [] B = new int [V];
		int [] C = new int [V];
		
		System.out.println("digite os valores do primeiro vetor:");
		
		for (int i=0; i<V; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("digite os valores do segundo vetor:");
		
		for (int i=0; i<V; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<V; i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.println("Resultado das somas:");
		
		for (int i=0; i<V; i++) {
			System.out.printf("%d\n", C[i]);
		}
		
		sc.close();
		
	}

}
