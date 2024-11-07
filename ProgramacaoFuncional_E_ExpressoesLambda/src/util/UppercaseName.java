package util;

import java.util.function.Function;

import entitites.Product;

public class UppercaseName implements Function<Product, String>{//contem 2 entradas, o tipo de entrada e a saida, então é um function que recebe product e sai string

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
