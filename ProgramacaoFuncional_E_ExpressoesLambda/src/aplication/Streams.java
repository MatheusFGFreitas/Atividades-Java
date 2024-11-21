package aplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);//feito uma lista de inteiros
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);//criada uma stream de inteiros a partir da lista//agora feito com map para multiplicar tudo por 10
		System.out.println(Arrays.toString(st1.toArray()));//chamado to array para converter a stream para um vetor
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");//criada uma stream of com os elementos já dentro da stream
		System.out.println(Arrays.toString(st2.toArray()));

	}

}
