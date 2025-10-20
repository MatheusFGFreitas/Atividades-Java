package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Empregado;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado x;
		x = new Empregado();
		
		System.out.print("Nome: ");
		x.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		x.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		x.taxa = sc.nextDouble();
		
		double salarioX = x.salarioLiquido();
		
		System.out.println("Empregado: " + x.nome + " R$: " + salarioX);
		
		System.out.print("Quantos porcento será o aumento de salario?: ");
		x.porcentagem = sc.nextDouble();
		
		double salarioY = x.aumentoSalario();
		
		System.out.println("Dados atualizados: " + x.nome + " R$ " + salarioY);
		
		sc.close();
	}

}
