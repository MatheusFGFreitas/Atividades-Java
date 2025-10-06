package program;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		//para trocar a virgula por ponto, tem que colocar o idioma como inglês
		Locale.setDefault(Locale.US);
		
		//incluindo o valor na variavel y
		int y = 32;
		//incluindo o valor na variavel X com ponto flutuante
		double x = 10.35784;
		
		//mostrando na tela o valor da variavel y
		System.out.println(y);
		//mostrando na tela o valor total da variavel x
		System.out.println(x);
		//mostrando na tela o valor da variavel x com apenas 2 casas decimais, arredondando o valor pra cima ou pra baixo dependendo do valor da variavel
		System.out.printf("%.2f%n", x);
		//mostrando na tela o valor da variavel x com 4 casas decimais arredondada
		System.out.printf("%.4f%n", x);
		//formatando uma frase junto com a variavel
		System.out.println("Resultado: " + x + " metros");
		//formatando um printf com a variavel com 2 casas decimais
		System.out.printf("Resultado: %.2f metros%n", x);
		
		//atribuição dos valores em cada variavel
		String nome = "Maria";
		int idade = 29;
		double salario = 4000.0;
		
		//inserindo nome, idade e salario em um system.out
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);
		

	}

}
