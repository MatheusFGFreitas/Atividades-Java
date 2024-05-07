package vetores;

public class TesteWrapper {

	public static void main(String[] args) {

		int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);
		
		int y = obj;
		
		System.out.println(y);
		
		//wraper classes são classes que tem o objetivo de tratar os tipos primitivos como classes
		//mas de uma forma transparente para não fazer conversoes e castings
		//wraper class tamnbém auxilia para aceitar valores nulos, coisa que os tipos primitivos
		//normalmente não aceita
	}

}
