package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class exercicioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario ();

		System.out.println("Insira o Nome, Salario Bruto e o total de imposto do funcionario:");
		func.nome = sc.nextLine();
		func.bruto = sc.nextDouble();
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario :" + func);
		System.out.println();
		
		System.out.println("quantos % será o acrescimo de salario? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualização: " + func);
		
		
		sc.close();
		
	}

}
