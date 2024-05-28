package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order1;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;//utilizado em duas atividades do Java, já que é a mesma coisa

public class ProgramExercicio3 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product p = new Product("TV", 1000.0);
		//OrderItem oi1 = new OrderItem(1, 1000.0, p);
		//System.out.println(oi1.getProduct().getName());//foi feito um comando para imprimir o nome do produto associado ao order item
		//System.out.println(oi1);  teste feito para ver se funcionava tudo certo
		
		//Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
		//System.out.println(cli);  teste para ver se funcionava o Client
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);//instanciado o cliente com os dados digitados
		
		System.out.println("Enter order data: ");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next()); //ja convertido automatico o que o usuario digitar para Order Status
		
		Order1 order = new Order1(new Date(), status, client);//instanciando dentro da memoria o order associado
																//ao cliente
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();//para consumir a quebra de linha
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);//produto instanciado
			
			OrderItem it = new OrderItem(quantity, productPrice, product);//OrderItem instanciado
			
			order.addItem(it);			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
