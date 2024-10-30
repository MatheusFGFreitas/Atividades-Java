package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipioGetPut {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {//graças ao (? extends Number> a lista pode conter qualquer tipo que estenda number, como integer, double etc...
																						  //graças ao <? super Number> a lista de destino pode aceitar qualquer supertipo de number o que significa que pode ser number até object
																						  //resumindo, esse metodo permite copiar os elementos(ou seus filhos) e copiar para uma lista seus numeros(ou super tipos)
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for( Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
