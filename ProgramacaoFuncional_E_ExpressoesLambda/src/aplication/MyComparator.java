package aplication;

import java.util.Comparator;

import entitites.Product;

public class MyComparator implements Comparator<Product>{//interface funcional é a interface que possui um unico metodo abstrato

	@Override
	public int compare(Product p1, Product p2) {//isso também é uma interface funcional, suas implementações são tratadas como expressão lambda
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}//existe varias interfaces funcionais, por exemplo predicatem function e consumer(consumer é esperado que possa gerar efeitos colaterais)
	

}
