package curso_porgramacao_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //usuario pode colocar os dados
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();

	}

}
