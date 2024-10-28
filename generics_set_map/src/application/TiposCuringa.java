package application;

import java.util.Arrays;
import java.util.List;

public class TiposCuringa {

	public static void main(String[] args) {

		//List<Object> myObjs = new ArrayList<Object>();
		//List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumbers; // erro de compilação, não pode converter um list integer para list object, se utilizar o ? em vez de Object, o sistema aceita

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}
		
	public static void printList(List<?> list) {//desse jeito ele pode imprimir qualquer tipo de lista
		//list.add(3);//porém não podemos adicionar nada nessa lista, pois pode não ser compativel a lista
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
