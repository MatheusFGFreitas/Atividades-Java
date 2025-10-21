package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter dolar = new CurrencyConverter();
		
		System.out.print("Qual é o preço do dolar?");
		dolar.preco = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados?");
		dolar.quantidade = sc.nextDouble();
		
		double pagamento = dolar.pagamento();
		
		System.out.printf("valor a ser pago em reais: %.2f%n", pagamento);
		
		sc.close();

	}

}
