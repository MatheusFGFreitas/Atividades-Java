package curso_porgramacao_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funiconário. a seguir, mostre o número e o salário do funcionário, com duas casas decimais.
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int numero = sc.nextInt();
	double horas = sc.nextDouble();
	double valorH = sc.nextDouble();
	
	double salario = horas * valorH;
	
	System.out.println("Número do Funcionário = " + numero);
	System.out.printf("Salário = %.2f%n", salario);
	
	sc.close();

	}

}
