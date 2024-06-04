package entities;

public class SavingsAccount extends Account{ //acrescentado a palava final antes do class, previne que a SavingsAccount seja herdada por outra classe

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {//foi criado o construtor com 4 argumentos, com os 3 primeiros sendo também do Account
		super(number, holder, balance);
		this.interestRate = interestRate;//então é complementado com a taxa de juros
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //utilizando o Override para mostrar ao compilador que isso é uma sobreposição de metdodo para o SavingsAccount. sem o Override, o compilador achará que é um metodo especifico, com o Override, se tiver na superclasse o metodo, será sobree scrito para o savings account, caso não tenha, vai dar erro
	public void withdraw(double amount) {//se adicionar o final antes do void, n poderá ser herdada novamente em outro lugar
		balance -= amount;
	}
	
}
