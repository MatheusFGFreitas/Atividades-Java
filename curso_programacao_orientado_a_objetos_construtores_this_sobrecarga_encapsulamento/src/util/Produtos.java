package util;

public class Produtos {

	//public String name;   metodo antigo
	//public double price;
	//public int quantity;
	
	String name;  //agora entrando no modo encapsulamento, usado para prevenir ser acessado indevidamente
	private double price;
	private int quantity; 
	
	public Produtos(String name, double price, int quantity) {//feito um construtor para instanciar nome, preco e quantidade assim que foi criado, para os valores não ficarem nulos
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Produtos(String name, double price) {//criado uma sobrecarga para incluir um novo produto, porém com a quantidade nula
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) { //void significa q n retornará nada
		this.price = price;
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
	
	public int getQuantity(){
		return quantity;
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
