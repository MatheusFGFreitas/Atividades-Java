package aplication;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;

public class ProgramacaoFuncional_E_CalculoLambda {

	public static int compareProducts(Product p1, Product p2) {//função que recebe 2 produtos
		return p1.getPrice().compareTo(p2.getPrice());//retorna a comparação dos preços
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(ProgramacaoFuncional_E_CalculoLambda::compareProducts);//passando a referencia para a função, para deixar ordenado por preço
		
		list.forEach(System.out::println);
	}
}
