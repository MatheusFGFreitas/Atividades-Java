package entities;

public abstract class PagamentoTaxa {
	
	String nome;
	double pagamentoAnual;
	
	public PagamentoTaxa() {	
	}

	public PagamentoTaxa(String nome, double pagamentoAnual) {
		this.nome = nome;
		this.pagamentoAnual = pagamentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPagamentoAnual() {
		return pagamentoAnual;
	}

	public void setPagamentoAnual(double pagamentoAnual) {
		this.pagamentoAnual = pagamentoAnual;
	}
	
	public abstract double taxa();

}
