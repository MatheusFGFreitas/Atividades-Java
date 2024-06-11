package entities;

public class Empresa extends PagamentoTaxa{

	Integer funcionarios;
	
	public Empresa() {
	}
	
	public Empresa(String nome, double pagamentoAnual, Integer funcionarios) {
		super(nome, pagamentoAnual);
		this.funcionarios = funcionarios;
	}
	
	public double getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double taxa() {
		double taxaBasica = (getFuncionarios() <= 10) ? getPagamentoAnual() * 0.16 : getPagamentoAnual() * 0.14;
		return taxaBasica;
		}
	

}
