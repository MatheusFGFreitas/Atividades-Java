package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		// fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois,
		//mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
		//com menos de 16 anos, bem como o nome dessas pessoas caso houver.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int [] idade = new int[n];
		double [] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "° pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0; // soma da altura
			for(int i = 0; i < n; i++) {
				soma = soma + altura[i];
			}
		double mediaAltura = soma / n; // formula para media da altura
		
		System.out.println();//quebra de linha
		
		System.out.printf("Altura média : %.2f%n", mediaAltura);//saida da media da altura
		
		int contagem = 0; //contagem de menor de 16
			for(int i = 0; i < n; i++) {
				if(idade[i] < 16) {
					contagem = contagem + 1;
				}
			}
		
		double porcento = (contagem * 100.0) / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcento);
		
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
