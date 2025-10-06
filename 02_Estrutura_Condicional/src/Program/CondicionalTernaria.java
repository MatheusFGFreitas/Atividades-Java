package Program;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		//se for apenas um if/else, uma condicional ternaría é mais agradavel visualmente e economiza linhas
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto " + desconto);
		
		sc.close();

	}

}
