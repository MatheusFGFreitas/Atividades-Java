package programa;

import java.util.Locale;
import java.util.Scanner;
import util.ConversorDolar;

public class ProgramaExercicio {

	public static void main(String[] args) {
		// Faça um programa para ler a cotação do dolar, e depois um valor em dolares a ser comprado
		//por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando
		//ainda que a pessoa tera que pagar 6% de iof sobre o valor em dolar
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("qual é o valor do dólar?: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("quantos dólares serão comprados?: ");
		double quantidade = sc.nextDouble();
		
		double resultado = ConversorDolar.dolarParaReal(quantidade, precoDolar);
		System.out.printf("Quantidade a ser pago em reais = %.2f%n", resultado);
		
		sc.close();

	}

}
