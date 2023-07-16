package curso_porgramacao_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double Pi = 3.14159;
		
		double area = Pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
		
		
	}

}
