package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Calculador;

public class MembrosEstaticos {
	
	//public static final double PI = 3.14159;// inserido um membro estatico, o final é para indicar que a variavel PI será constante, ou seja, não sera alterado
											// e o padrao de nomes para constante é sempre maiuscula, com um _ pra separar a palavra: NET_SALARY
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculador calc = new Calculador();//instanciado um objeto na classe
		
		System.out.print("Entre o raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);
		
		
		sc.close();

	}
	
	//public static double circunferencia(double raio) {//criado um membro estatico depois do fim do programa
		//return 2.0 * PI * raio;
	//}
	
	//public static double volume(double raio) {
		//return 4.0 * PI * raio * raio * raio / 3.0;
	//}

}
