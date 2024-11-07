package aplication;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;
import util.ProductPredicate;

public class InterfacePredicate {

	public static void main(String[] args) {
		// interface predicate é uma interface generics parametrizada com o tipo T, com apenas um metodo abstrato chamado test
		//o test vai receber o objeto do tipo T e retornar um booleano

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice() >= 100);//essa expressão lambda também funciona
		
		//list.removeIf(new ProductPredicate());//desse jeito é implementado pelo product predicate, uma função lambda
		
		//list.removeIf(Product::staticProductPredicate);//desse jeito é implementado pela classe product de forma estatica
		
		list.removeIf(Product::nonStaticProductPredicate);//desse jeito é implementado pela classe product de forma não estatica
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
