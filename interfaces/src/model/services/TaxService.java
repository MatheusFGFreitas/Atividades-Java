package model.services;

public interface TaxService {

	double tax(double amount);//criado a interface para não precisar trocar dois locais ao mesmo tempo
	//essa interface não terá implementação, só vai definir o contrato, por exemplo o serviço de imposto precisa do tax
	//para ficar mais facil a implementação de determinadas taxas, por exemplo, graças a essa interface, caso eu precise
	//trocar do BrazilTaxService para USATaxService, não precisarei trocar o nome, a interface já serve para esse proposito
}
