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
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);//criada uma Steam "infinita" com o iterate, falando que o primeiro elemento da Stream é 0, e a função para os proximos elementos é x + 2
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//criado um limite de 10 itens na lista, para não ficar infinito o processo
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1] ,p[0]+p[1]}).map(p -> p[0]);//criado uma sequencia fibbonaci pela stream com um certo "macete" com o Long
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}

}
