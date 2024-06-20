package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.AccountException;

public class ProgramEx2 {

	public static void main(String[] args) {
//Fazer um programa para ler os dados de uma conta bancaria e depois realizar um saque nessa conta bancaria, mostrando
//o novo saldo. um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao
//saldo da conta. implemente a conta bancaria conforme projeto abaixo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		System.out.print("informe o titular da conta: ");
		sc.nextLine();//para consumir o enter do sc antigo
		String holder = sc.nextLine();
		System.out.print("Saldo inicial da conta: ");
		double balance = sc.nextDouble();
		System.out.print("Limite para o saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);//instanciado a conta com os dados digitados
			
		System.out.println();
		System.out.print("Informe a quantia desejada para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
		}
			
		catch(AccountException e){
			System.out.println("Erro de saque: " + e.getMessage());
		}
		
		sc.close();
	}

}
