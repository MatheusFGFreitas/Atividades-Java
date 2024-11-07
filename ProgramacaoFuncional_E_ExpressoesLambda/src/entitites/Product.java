package entitites;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {
		
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
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
	
	public static boolean staticProductPredicate(Product p) {//Reference method com método estático, onde é feita no Products mesmo
		return p.getPrice() >= 100.0;//com a mesma expressão lambda feita no Product Predicate
	}

	@Override
	public String toString() {
		return "Product [name= " + name + ", price=" + price + "]"; 
	}
	
	
}
