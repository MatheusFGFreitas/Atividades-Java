package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService {
	
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	

	public double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("A quantidade de meses tem que ser maior que zero");//caso a quantidade de meses for menor que um, o erro é tratado
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);//quantia * potencia(1 + taxa de juros / 100, meses)
	}

}
