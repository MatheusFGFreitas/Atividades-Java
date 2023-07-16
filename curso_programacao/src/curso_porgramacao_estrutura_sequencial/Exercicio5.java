package curso_porgramacao_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// fazer um programa para ler quatro valores inteiros A, B C e D. A seguir calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: Diferença = (A * B - C * D)
		
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int D = sc.nextInt();
	
	int dif1 = A * B;
	int dif2 = C * D;
	
	int diferenca = dif1 - dif2;
	
	System.out.println("Diferença = " + diferenca);
	
	sc.close();

	}

}
