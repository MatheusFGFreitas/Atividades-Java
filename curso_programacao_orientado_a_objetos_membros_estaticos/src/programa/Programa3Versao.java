package programa;

import java.util.Locale;
import java.util.Scanner;

import util.Calculador2Versao;

public class Programa3Versao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entre o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculador2Versao.circunferencia(raio); // agora trazendo a propria classe
															// pois está estatico
		double v = Calculador2Versao.volume(raio);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("valor do PI: %.2f%n", Calculador2Versao.PI);
		
		sc.close();
		
		
		
	}

}
