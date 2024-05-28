package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;//implementada a composição entre o OrderItem para o Product
	
	public OrderItem() {//criado construtor vazio
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {//constructor using fields
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {//getters and setters
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {//criado o subtotal, que faz o preço x quantidade
		return price * quantity;
	}
	
	@Override
	public String toString() {//o string foi feito para puxar o nome com o valor e um cifrão na frente, 
		return getProduct().getName() //quantidade e subtotal, todos concatenados 
				+ ", $"				  //um em cada linha para facil leitura
				+ String.format("%.2f", price)
				+", Quantity: "
				+ quantity
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
}
