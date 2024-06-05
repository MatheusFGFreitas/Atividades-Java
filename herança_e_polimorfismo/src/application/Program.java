package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program { //utiliza Account e BusinessAccount

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//upcasting: converter um objeto da subclasse para a superclasse
		
		Account acc1 = bacc;//uma buiseness account, também é uma conta, então podemos atribuir uma conta impresarial a uma conta sem erros
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);//também nenhum erro pois uma conta empresarial também é uma conta, não da erro
		Account acc3= new SavingsAccount(1004, "Anna", 0.0, 0.01);//esses testes foram utilizados para mostrar que não tem problema utilizar um objeto da subclasse e atribuir a uma superclasse

		//downcasting: converter um objeto da superclasse pra subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2; //o compilador reclama pois não se pode converter a variavel account pra business account e para isso acontecer, você tem que colocar manualmente ente () antes da acc2 por exemplo, que foi feito nessa linha
		acc4.loan(100.0);//graças a isso, você pode fazer uma operação que na variavel Account n é possivel, pois Loan só é possivel na business account
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;//downcasting normal, porém foi instanciada como savins account, então não é permitida, e só vai dar problema durante a execução do programa, por enquanto aqui não dará problema, porém quando chegar ao momento de conversão, mostrará o problema 
		//então o Downcasting pode não dar certo, e isso depende do programador testar e verificar se é possivel a conversão
		if(acc3 instanceof BusinessAccount) {//teste para verificar se a conta 3 é instanciada ao Business Account
			BusinessAccount acc5 = (BusinessAccount)acc3;//caso seja instanciada a business account
			acc5.loan(200.00);//é realizado o emprestimo
			System.out.println("Loan!");//e é jogado o resultado
		}//caso falhe, é ignorado
		
		if (acc3 instanceof SavingsAccount) {//aqui é realizado o teste para ver se o acc3 é instanciado ao Savings Account
			SavingsAccount acc5 = (SavingsAccount)acc3;//caso seja instanciada a savings account
			acc5.updateBalance();//é realizado a atualização do saldo
			System.out.println("Update!");//e é imprimido o resultado
		}//caso não seja, é ignorado o resultado
		//esses dois testes são otimos para caso a conta seja instanciada, e facilita para não ocorrer erros durante a compilação
		
		//Polimorfismo: polimorfismo significa muitas formas, igual os exemplos abaixo, o que acontece neles é:
		Account x = new Account(1020, "Alex", 1000.0);//quando eu chamo essa linha, eu executo o saque da classe account
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);//quando eu chamo essa linha, eu executo o saque da classe savings account
		//o que acontece é que existe a mesma operação nos dois lugares, tanto no account quanto savingsaccount
		//então ele fará o withdraw condizente ao nivel da conta, de forma resumida, deixando mais facil ao programador
		//para fazer a operação, a atribuição da variavel é feito em tempo de execução, ou seja, só saberá durante
		//a hora da execução.
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
