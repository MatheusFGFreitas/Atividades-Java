package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		sc.close();
	}
	

}
