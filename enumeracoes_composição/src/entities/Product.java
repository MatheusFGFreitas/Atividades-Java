package entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {//criado construtor vazio
		
	}

	public Product(String name, Double price) {//criado pelo generate constructors using fields
		this.name = name;
		this.price = price;
	}

	public String getName() {//getters e setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
