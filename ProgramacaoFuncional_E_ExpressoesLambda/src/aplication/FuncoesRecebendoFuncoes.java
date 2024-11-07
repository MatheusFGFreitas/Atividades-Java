package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitites.Product;
import model.services.ProductService;

public class FuncoesRecebendoFuncoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filtredSum(list, p -> p.getName().charAt(0) == 'T');
		//criando o predicado criteria lá no product service, o mesmo não precisa de alteração, podemos alterar por aqui mesmo
		
		System.out.println("Soma = " + String.format("%.2f", sum));
		
	}

}
