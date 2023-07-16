package curso_porgramacao_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses numeros com uma mensagem explicativa
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int Soma = X + Y;
		
		System.out.println("Soma = " + Soma);
		
		sc.close();

	}

}
