package util;

import java.util.function.Predicate;

import entitites.Product;

public class ProductPredicate implements Predicate<Product>{//implementa predicate product para trazer o teste em uma interface

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
