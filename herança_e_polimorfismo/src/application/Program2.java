package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);//criado uma variavel da conta com o numero da conta, o nome do dono da conta e o valor que tem na conta
		acc1.withdraw(200.0);//criada operação para remoção de 200 reais, porém será 205 por causa da taxa
		System.out.println(acc1.getBalance());//imprimir na tela o valor restante
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);//criado uma variavel de SavingsAccount para utilização do Override, para sobre escrever o withdraw da Account para essa conta não ser cobrada taxa
		acc2.withdraw(200.0);//feita a mesma operação para a remoção de dinheiro, porém sem a taxa de 5 reais
		System.out.println(acc2.getBalance());//imprimir na tela o valor restante
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);//criado uma variavel de BusinessAccount para utilização o Super, para cobrar a taxa normal e mais uma taxa de 2 adicional por conta da conta de negocios
		acc3.withdraw(200.0);//feita a mesma operação para a remoção de dinheiro, porém com a taxa adicional
		System.out.println(acc3.getBalance());//imprimir o valor restante
	}

}
