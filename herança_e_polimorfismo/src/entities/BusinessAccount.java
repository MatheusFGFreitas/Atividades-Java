package entities;

public class BusinessAccount extends Account{ //só com o extends já mostra ao java que essa classe terá todos os dados
										  //e comportamentos da Conta1
		
		private double loanLimit;
		
		public BusinessAccount() {
			super();
		}

		public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
			super(number, holder, balance); // criado construtor com argumentos do Account aqui também
			this.loanLimit = loanLimit;
		}

		public double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(double loanLimit) {
			this.loanLimit = loanLimit;
		}
		
		public void loan(double amount) {
			if (amount <= loanLimit) {
			balance += amount - 10.0;
			}
		}
		
		@Override 
		public void withdraw(double amount) {//esse é para o Business account, onde:
			super.withdraw(amount);//é chamado o withdraw do Account normal, que é retirado 5 de taxa
			balance -= 2.0;//e é adicionado mais 2 reias em taxa pois a conta é empresarial
		}
}
