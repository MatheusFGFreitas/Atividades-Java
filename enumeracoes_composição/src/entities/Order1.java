package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order1 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//com hora min e seg
	
	private Date moment;//atributos basicos
	private OrderStatus status;
	
	private Client client;//associação com o Client
	
	private List<OrderItem> items = new ArrayList<OrderItem>();//associação com o Order Item em forma de Lista
	
	public Order1() {
		
	}

	public Order1(Date moment, OrderStatus status, Client client) {//criado sem o items, pois n precisa
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	//public List<OrderItem> getItems() { removido tambem apenas para deixar add e remove para proteger a lista
		//return items;
	//}

	//public void setItems(List<OrderItem> items) { esse não se aplica, o recomendado é deletar, está aqui só
		//this.items = items;						para recordação e aprendizado
	//}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() { //feito sem Lambda, delegando o subTotal para trazer o valor para a soma
		double sum = 0.0;
		for (OrderItem it: items) {
			sum = sum + it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {//criado pelo stringbuilder para economizar memoria
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
}
