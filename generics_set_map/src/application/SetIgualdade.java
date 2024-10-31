package application;

import java.util.HashSet;
import java.util.Set;

import entities.Produto;

public class SetIgualdade {

	public static void main(String[] args) {

		Set<Produto> set = new HashSet<>();
		
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		Produto prod = new Produto("Notebook", 1200.0);
		//se não colocar o hash e equal na classe de produto, o teste de igualdade não funciona, dá falso negativo
		System.out.println(set.contains(prod));

	}

}
