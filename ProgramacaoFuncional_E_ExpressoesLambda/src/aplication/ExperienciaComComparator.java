package aplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entitites.Product;

public class ExperienciaComComparator {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Comparator<Product> comp = new Comparator<Product>() {//feito no mesmo programa, porém mt longo
			//@Override
			//public int compare(Product p1, Product p2) {
				//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			//}
			
		//};
		
		Comparator<Product> comp = (p1, p2) ->{//definindo uma função anonima, com essa sintaxe também chamada de arrow function
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());//feito em lambda
		};
		
		//também pode ser feito desse jeito mais enxuto e o codigo em uma só linha
		//Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		//também pode colocar a expressão lambda dentro do list sort, desse jeito
		//list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
