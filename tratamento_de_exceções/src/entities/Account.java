package entities;

import model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double amount) {
		validadeWithdraw(amount);
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	private void validadeWithdraw(double amount){
		if(amount > getWithdrawLimit()) {
			throw new AccountException ("A quantia excede o limite de saque");
		}
		else if (amount > getBalance()) {
			throw new AccountException ("Saldo Insuficiente");
		}
		
	}
	
}
