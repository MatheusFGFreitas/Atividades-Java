package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Conta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Entre o numero da conta: ");
		int number = sc.nextInt();
		
		System.out.print("Entre o nome do dono da conta:");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Existe um deposito inicial? (y/n)");
		char response = sc.next().charAt(0);
		
		if (response== 'y') {
			System.out.print("Entre o deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre um valor para deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre um valor para saque:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(account);
		
		sc.close();
	}

}
