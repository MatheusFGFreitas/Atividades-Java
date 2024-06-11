package entities;

public class Account {//se eu usar o abstract entre o public class, a classe não poderá ser instanciada
						//logo isso previnirá erros de programadores, pois não deixará compliar a classe

		private Integer number;
		private String holder;
		protected Double balance; //utilizado protected para ser utilizavel pelo BusinessAccount
		
		public Account() {
			
		}

		public Account(Integer number, String holder, Double balance) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}

		//public void setBalance(Double balance) { retirado pois não utilizaremos o set balance, afinal só podemos
			//this.balance = balance;			   depositar ou sacar dinheiro
		//}
		
		public void withdraw(double amount) { // criado argumento para retirada de dinheiro
			balance -= amount + 5.0;
		}
		
		public void deposit(double amount) { // criado argumento para deposito de dinheiro
			balance += amount;
		}
		
}
