package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();//criado variavel minutes recebendo a duração para minutos
		double hours = minutes / 60.0;//para assim obter a duração em horas com fração
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);//Math ceil é para arredondar para cima o valor que sair, por exemplo, 4.10 é arredondado pra cima, se tornando 5
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.00);
		}
		
		double tax = taxService.tax(basicPayment);//criado a taxa
		
		carRental.setInvoice(new Invoice(basicPayment, tax));//criado para trazer o valor total
		
	}
	
}
