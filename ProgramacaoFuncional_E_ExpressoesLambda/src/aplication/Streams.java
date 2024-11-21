package aplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);//feito uma lista de inteiros
		
		Stream<Integer> st1 = list.stream();//criada uma stream de inteiros a partir da lista
		
		System.out.println(Arrays.toString(st1.toArray()));//chamado to array para converter a stream para um vetor

	}

}
