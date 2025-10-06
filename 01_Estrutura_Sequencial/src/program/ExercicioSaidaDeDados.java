package program;

import java.util.Locale;

public class ExercicioSaidaDeDados {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Mesa";
		
		int idade = 30;
		int codigo = 5290;
		char genero ='F';
		
		double preco1 = 2100.0;
		double preco2 = 650.0;
		double medida = 53.234567;
		
		System.out.println("Produtos: ");
		System.out.printf("%s, que o preço é de R$%.2f%n", produto1, preco1);
		System.out.printf("%s, que o preço é de R$%.2f%n", produto2, preco2);
		
		System.out.printf("Cadastro: %d anos, codigo %d e genero %c", idade, codigo, genero);
		
		System.out.println("Medida com 8 casas decimais: " + medida);
		System.out.printf("Medida arredondada com 3 casas decimais: %.3f%n", medida);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com ponto em vez de virgula: %.3f%n", medida);
		

	}

}
