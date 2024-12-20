package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {//alterado de integer para object
							  //colocado que o PrintService é do tipo T, o "T" pode ser qualquer letra, contanto que seja utilizada em todos os locais
							  //graças a isso, a classe ficou parametrizada no tipo T
	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
