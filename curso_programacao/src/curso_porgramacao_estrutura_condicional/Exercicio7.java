package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio7 {

	public static void main(String[] args) {
		// Leia 2 valores com uma casa decimal(X e Y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (X = Y = 0)
		//Se o ponto estiver na origem, escreva a mensagem "Origem"
		//Se o ponto estiver sobre um dos eixos escreva "Eixo X ou Eixo Y", conforme a situação
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double X;
		Double Y;
		
		System.out.println("digite o numero X");
		X = sc.nextDouble();
		
		System.out.println("digite o numero Y");
		Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		
		else if (X >= 0.0 && Y >= 0.0){
			System.out.println("Q1");
		}
		
		else if (X <= 0.0 && Y >= 0.0) {
			System.out.println("Q2");
		}
		
		else if (X <= 0.0 && Y <= 0.0) {
			System.out.println("Q3");
		}
		
		else if (X == 0.0){
			System.out.println("eixo Y");
		}
		
		else if (Y == 0.0){
			System.out.println("Eixo X");
		}
		
		else {
			System.out.println("Q4");
		}
	sc.close();

	}

}
