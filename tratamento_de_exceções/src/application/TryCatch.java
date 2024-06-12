package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {//aberto um comando Try para caso apareça algum erro dentro desse comando, podemos tratar no catch
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//caso apareça esse erro em especifico
			System.out.println("Invalid Position");//será feito esse comando em resposta
		}
		catch(InputMismatchException e) {//aqui a mesma coisa
			System.out.println("input error");
		}
		System.out.println("End Of Program");
		
		sc.close();

	}

}
