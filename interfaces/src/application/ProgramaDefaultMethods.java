package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;

public class ProgramaDefaultMethods {

	public static void main(String[] args) {
		//o default methods tem vantagens que é: evitar repetições de implementação de interface, necessidade de criar classes abstratas para
		//serem reutilizadas, mantem a retrocompatibilidade com sistemas existentes, e permite que interfaces funcionais prover outras operações
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantia do emprestimo: ");
		double amount = sc.nextDouble();
		System.out.print("Em quantos meses será o pagamento: ");
		int months = sc.nextInt();
		
		BrazilInterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Pagamento após " + months + "meses: ");
		System.out.println(String.format("%.2f", payment));
		
	sc.close();
	}

}
