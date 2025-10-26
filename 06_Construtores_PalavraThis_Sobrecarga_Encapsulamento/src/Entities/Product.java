package Entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {//obrigando o usuario a instanciar o nome preço e quantidade para não ficar nulo
		this.name = name;//this serve pra diferenciar o atributo do objeto do parametro do construtor, ou seja, está referenciando o objeto
		this.price = price;
		this.quantity = quantity;
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
