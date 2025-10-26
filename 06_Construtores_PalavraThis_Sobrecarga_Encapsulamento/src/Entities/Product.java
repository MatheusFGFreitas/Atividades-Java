package Entities;

public class Product {
	
	private String name;//deixando em private para não ser alterado diretamente, previnindo assim erros
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {//obrigando o usuario a instanciar o nome preço e quantidade para não ficar nulo
		this.name = name;//this serve pra diferenciar o atributo do objeto do parametro do construtor, ou seja, está referenciando o objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {//sobrecarga é disponibilizar mais de uma versão da mesma operação, a diferença é a lista de parametros
		this.name = name;
		this.price = price;
	}
	
	public String getName(){//argumento para retornar o nome
		return name;
	}
	
	public void setName(String name) {//argumento para mudar o nome
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {//apenas colocando o get quantity, para proteger a integridade do produto, mudando a quantidade apenas com
		return quantity;	  //entrada e saida
	}
	
	public double totalValueInStock() {
	return price * quantity;
	}
	
	public void addProducts(int quantity) {
	this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}
	
	public String toString() {
	return name
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantity
	+ " units, Total: $ "
	+ String.format("%.2f", totalValueInStock());
	}
}
