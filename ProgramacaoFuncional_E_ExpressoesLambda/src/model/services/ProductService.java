package model.services;

import java.util.List;
import java.util.function.Predicate;

import entitites.Product;

public class ProductService {

	public double filtredSum(List<Product> list, Predicate<Product> criteria){//colocado o predicado para facilitar a não alteração do if
		double sum = 0.0;
		for (Product p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
