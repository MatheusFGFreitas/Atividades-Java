package programa;

import java.util.Locale;
import java.util.Scanner;
import util.Produtos;

public class programaTV {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		Produtos produtos = new Produtos(name, price);//feito para previnir que o usuário crie um produto inconsistente com algo faltando, nome preço ou quantidade
		
		produtos.setName("Computer"); // graças a alteração do set name, posso inserir um codigo para colocar automaticamente o nome
		System.out.println("Updated name: " + produtos.getName()); // graças ao get name, pode puxar no util
		produtos.setPrice(1200.00);
		System.out.println("Updated price :" + produtos.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: " + produtos);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");

		int quantity = sc.nextInt();
		produtos.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + produtos);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");

		quantity = sc.nextInt();
		produtos.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + produtos);

		sc.close();
	}
}
