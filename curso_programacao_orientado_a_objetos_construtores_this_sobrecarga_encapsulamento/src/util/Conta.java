package util;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	//construtor com 2 instancias
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	//construtor com 3 instancias
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	//para puxar os dados do numero de conta
	public int getNumero() {
		return this.numero;
	}
	
	//para puxar os dados do nome do cliente
	public String getNome() {
		return this.nome;
	}
	
	//para alterar os dados do nome do cliente
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//para puxar os dados do saldo do cliente
	public double getSaldo() {
		return this.saldo;
	}
	
	//operação para o deposito de valor no saldo do cliente
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	//operação para retirada de valor no saldo do cliente
	public void retirada(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	//operação para trazer os dados do cliente, sendo eles o numero da conta, nome e o saldo atual
	public String toString() {
		return "Conta "
				+ this.numero
				+ ", Nome do Usuario da conta: "
				+ this.nome
				+", Saldo: $ "
				+ String.format("%.2f", this.saldo);
	}

}