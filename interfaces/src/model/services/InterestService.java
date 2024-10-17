package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	//o Interest rate, não posso colocar default porque o metodo depende do valor da variavel armazenada no serviço
	
	default double payment(double amount, int months) {//colocado como default para todos os serviços de juros puxarem dele
		if (months < 1) {
			throw new InvalidParameterException("A quantidade de meses tem que ser maior que zero");//caso a quantidade de meses for menor que um, o erro é tratado
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);//quantia * potencia(1 + taxa de juros / 100, meses)
	}
}
