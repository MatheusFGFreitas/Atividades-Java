package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Produto;

public class TreeSetComparable {

	public static void main(String[] args) {

		Set<Produto> set = new TreeSet<>();
		
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		for(Produto p : set) {
			System.out.println(p);
		}
		
		//utilizando a classe produto, tive que atualizar para implementar Comparable, para então assim comparar do jeito que eu desejar

	}

}
