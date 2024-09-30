package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i<= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);//graças a isso, eu estou adicionando valores aos meses igual aos I do for
			
			double interest = onlinePaymentService.interest(basicQuota, i); //aqui é feito a quantidade de juros
			
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);//aqui é o valor total com juros para adcionar a taxa
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));//adiciona uma parcela com a data e o valor total
		}
	}
}
