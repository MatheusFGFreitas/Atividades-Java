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
	
	public boolean nonStaticProductPredicate() {//metodo estático trabalha com o produto que você passar como argumento, não estatico trabalha com o objeto que está utilizando
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Product [name= " + name + ", price=" + price + "]"; 
	}
	
	
}
