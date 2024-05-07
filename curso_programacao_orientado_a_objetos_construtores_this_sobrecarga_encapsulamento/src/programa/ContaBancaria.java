package programa;

import java.util.Locale;
import java.util.Scanner;
import util.Conta;

public class ContaBancaria {

	public static void main(String[] args) {
		// Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
		//titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
		//inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
		//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
		//Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
		//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
		//exemplo).
		//Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
		//isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
		//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
		//suficiente para realizar o saque e/ou pagar a taxa.
		//Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
		//informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
		//mostrando os dados da conta após cada operação. 

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;//conta instanciada no programa
		
		System.out.print("Entre a numeração da conta: ");//variavel temporaria do numero da conta
		int numero = sc.nextInt();
		
		System.out.print("Entre o nome do cliente: ");//variavel temporaria do nome do cliente
		sc.nextLine();//para comer linha
		String nome = sc.nextLine();
		
		System.out.print("Existe deposito inicial? (y/n)? ");//pergunta para saber qual construtor utilizar
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {//construtor com 3 instancias
			System.out.print("entre o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {//construtor com 2 instancias
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);//retornando os dados da conta atual
		
		System.out.println();
		System.out.print("Entre um valor de deposito: ");//incluindo o deposido na conta
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Dados atualizados da conta: ");//retornando os dados atualizados da conta apos o deposito
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre um valor de retirada: ");//incluindo a retirada da conta
		double valorRetirada = sc.nextDouble();
		conta.retirada(valorRetirada);
		
		System.out.println("Dados atualizados da conta: ");//retornando os dados atualizados da conta apos a retirada e a taxa
		System.out.println(conta);
		
		
		sc.close();
	}

}
