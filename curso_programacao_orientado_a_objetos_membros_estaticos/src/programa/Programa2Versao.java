package programa;

import java.util.Locale;
import java.util.Scanner;

import util.Calculador1Versao;

public class Programa2Versao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculador1Versao calc = new Calculador1Versao(); //puxando o pacote do calculador1vers.
		
		System.out.print("entre o raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("valor do PI: %.2f%n", calc.PI);
		
		sc.close();
	}

}
