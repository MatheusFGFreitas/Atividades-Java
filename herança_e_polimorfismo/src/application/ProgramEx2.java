package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

public class ProgramEx2 {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre o numero de Produtos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do produto de numero " + i + ":");
			System.out.print("O produto em questão é comum, usado ou importado? (por favor, responda apenas com c/u/i)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome do produto:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço do produto: ");
			double price = sc.nextDouble();
			if(ch == 'c'){
				list.add(new Product(name, price));
			}
			else if(ch == 'u'){
				System.out.print("Inclua a data de fabricação do produto: ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				System.out.print("Insira a taxa de importação: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			

		}
		
		System.out.println();
		System.out.println("Etiquetas de preço de cada produto: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
		
	}


}
