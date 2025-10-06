package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func;
		double h, s, salario;
		
		System.out.printf("Digite o numero do funcionario: ");
		func = sc.nextInt();
		
		System.out.printf("Digite a quantidade de horas trabalhadas: ");
		h = sc.nextDouble();
		
		System.out.printf("Digite o valor por hora: ");
		s = sc.nextDouble();
		
		salario = h * s;
		
		System.out.println("Numero do funcionario = " + func);
		System.out.printf("Salario: R$%.2f%n", salario);
		
		sc.close();

	}

}
