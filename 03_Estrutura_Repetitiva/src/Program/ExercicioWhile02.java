package Program;

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y");
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
				System.out.println("Digite o valor de X");
				x = sc.nextInt();
				System.out.println("Digite o valor de Y");
				y = sc.nextInt();
			}else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
				System.out.println("Digite o valor de X");
				x = sc.nextInt();
				System.out.println("Digite o valor de Y");
				y = sc.nextInt();
			}else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
				System.out.println("Digite o valor de X");
				x = sc.nextInt();
				System.out.println("Digite o valor de Y");
				y = sc.nextInt();
			}else if (x > 0 && y < 0){
				System.out.println("Quarto Quadrante");
				System.out.println("Digite o valor de X");
				x = sc.nextInt();
				System.out.println("Digite o valor de Y");
				y = sc.nextInt();
			}
		}
		
		
		sc.close();

	}

}
