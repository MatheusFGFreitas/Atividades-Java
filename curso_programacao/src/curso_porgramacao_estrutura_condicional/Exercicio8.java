package curso_porgramacao_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//em um país imaginario denomidado Lisarb, todos os habitantes ficam felizes em
		//pagar os seus impostos, pois sabem que nele não ha habitantes corruptos e os
		//recursos arrecadados são utilizados em benefício da população, sem qualquer
		//desvio. A moeda deste país é o Rombus, cujo simbolo é o R$
		//Leia um valor com 2 casas decimais equivalente ao salario de uma pessoa em
		//Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de IR
		//segundo valores abaixo
		//R$ 0 a R$ 2000.00 = insento
		//R$ 2000.01 a R$ 3000.00 = 8%
		//R$ 3000.01 a R$ 4500.00 = 18%
		//acima de R$ 4500.00 = 28%
		//Lembre que, se o salário for R$ 3002.00, a taxa que indice é de 8% apenas sobre
		//R$ 1000.00 pois a faixa de salário que fica de 0 a 2000 é insenta de IR
		//no exemplo fornecido, a taxa de 8% é sobre 1000 +18% sobre 2, o que resulta em
		//80.36 no total
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double S = sc.nextDouble();
		Double I;
		
		if (S <= 2000.0) {
			I = 0.0;
		}
		else if (S <= 3000.0) {
			I = (S - 2000.0) * 0.08;
		}
		else if (S <= 4500.0) {
			I = (S - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			I = (S - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(I == 0.0) {
			System.out.println("Insento");
		}
		else {
			System.out.printf("R$ %.2f%n", I);
		}
		sc.close();
	}

}
