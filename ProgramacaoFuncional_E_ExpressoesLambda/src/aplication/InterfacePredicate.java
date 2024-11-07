package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entitites.Product;

public class InterfacePredicate {

	public static void main(String[] args) {
		// interface predicate é uma interface generics parametrizada com o tipo T, com apenas um metodo abstrato chamado test
		//o test vai receber o objeto do tipo T e retornar um booleano

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		Predicate<Product> pred = p -> p.getPrice() >= 100;//criando uma variavel predicada para o list remove, também possivel trocar o valor 100 pela variavel min, e também o usuario consegue escolher o valor da variavel, dando um controle maior
		
		//list.removeIf(p -> p.getPrice() >= 100);//essa expressão lambda também funciona
		
		//list.removeIf(new ProductPredicate());//desse jeito é implementado pelo product predicate, uma função lambda
		
		//list.removeIf(Product::staticProductPredicate);//desse jeito é implementado pela classe product de forma estatica
		
		//list.removeIf(Product::nonStaticProductPredicate);//desse jeito é implementado pela classe product de forma não estatica
		
		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
