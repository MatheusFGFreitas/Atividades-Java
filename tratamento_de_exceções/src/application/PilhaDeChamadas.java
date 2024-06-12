package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamadas {

	public static void main(String[] args) {
		
		method1();//o programa está chamando o metodo que está depois do fim do programa
		
		System.out.println("End of Program");	
		
	}
	
	public static void method1() {
		
		System.out.println("Method 1 start");//criado um metodo para chamar outro metodo
		method2();
		System.out.println("method 2 start");
		
	}
	
	public static void method2() { //metodo feito em um local diferente pra facil identificação
		Scanner sc= new Scanner(System.in);
		System.out.println("Method 2 Start");//para saber onde começa
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();//imprimirá na tela o rastreiamento do stack, que imprimira o erro que chamará a excessão
			sc.next();//feito para aguardar para a leitura do problema
		}
		catch(InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("method 2 end");//e onde termina
		
		sc.close();
	}
}
