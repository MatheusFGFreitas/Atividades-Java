package curso_porgramacao_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos([0,25][25,50][50,75][75,100]) este valor se encontra, obviamente, se o valor não estiver em nenhum destes intevalos, deverá ser impressa a mensagem "fora de intervalo"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double N;
		
		System.out.println("digite o Número a seguir");
		N = sc.nextDouble();
		
		if (N >= 0 && N <= 25) {
			System.out.println("Intervalo de 0 a 25");
		}
		
		else if (N >= 25.01 && N <= 50) {
			System.out.println("Intervalo de 25 a 50");
		}
		
		else if (N >= 50.01 && N <= 75) {
			System.out.println("Intervalo de 50 a 75");
		}
		
		else if (N >= 75.01 && N<= 100) {
			System.out.println("Intervalo de 75 a 100");
		}
		
		else {
			System.out.println("fora de Intervalo");
		}
		sc.close();	

	}

}
