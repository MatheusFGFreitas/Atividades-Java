package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitites.Product;
import util.PriceUpdate;

public class InterfaceConsumer {

	public static void main(String[] args) {
		// consumer é uma interface funcional que é parametrizado do tipo T e tem um
		// metodo abstrato que é o accept, ele recebe o obj do tipo T
		// e como é void ele executa uma ação e não retorna nada

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(new PriceUpdate());//o for each é um defauft method que ira percorrer a coleção e ira executar um consumer para cada elemento
		
		list.forEach(System.out::println);//tenho que fazer um for each para printar cada um dos produtos na lista, o reference method

	}

}
