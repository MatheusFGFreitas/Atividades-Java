package application;

import java.util.ArrayList;
import java.util.List;

public class PrincipioGetPut {

	public static void main(String[] args) {
		
		//covariancia
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);
		list.add(20); // erro de compilacao na hora de adicionar, mas acessar não tem problema
		//o ? extends Number deixa a lista bloqueada a novas adições, pois o sistema pode não saber qual é o tipo que a lista aceita
		
		//contravariancia
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		Number x = myNums.get(0); // erro de compilacao na hora de acessar, mas adicionar não tem problema
		//a atribuição no acesso não é feita pois pode ser uma variavel diferente na lista do que lista o myNums
		
	}

}
