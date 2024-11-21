package aplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipelines {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);//criada uma operação reduce, que pega o elemento inicial(neutro) e depois uma funçao que gera um resultado
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)//criado um filtro apenas pra par
				.map(x -> x * 10)//cada elemento filtrado será multiplicado por 10
				.collect(Collectors.toList());//no fim será criada uma lista nova com os resultados
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
