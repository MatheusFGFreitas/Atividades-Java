package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {//falando pro sistema que o tipo T trabalhará com qualquer tipo de Comparable T
		//permitindo então que ele possa ser comparado com outro item da mesma classe generica
		
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista não pode ser vazia");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
