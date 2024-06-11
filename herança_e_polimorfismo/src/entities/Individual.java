package entities;

public class Individual extends PagamentoTaxa{

	double saude;
	
	public Individual(){
	}
	
	public Individual(String nome, double pagamentoAnual, double saude) {
		super(nome, pagamentoAnual);
		this.saude = saude;
	}

	public double getSaude() {
		return saude;
	}

	public void setSaude(double saude) {
		this.saude = saude;
	}

	@Override
	public double taxa() {
		//forma alternativa: double taxaBasica = (getPagamentoAnual() < 20000.0) ? getPagamentoAnual() * 0.15 : getPagamentoAnual() * 0.25;
		double taxaBasica;
		if (getPagamentoAnual() < 20000.0) {
			taxaBasica = getPagamentoAnual() * 0.15;
		}
		else {
			taxaBasica = getPagamentoAnual() * 0.25;
		}
		double taxaFinal = taxaBasica - (getSaude() * 0.50);
		if(taxaFinal < 0.0) {
			taxaFinal =  0.0;
		}
		return taxaFinal;
	}

}
