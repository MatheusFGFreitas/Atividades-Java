package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite o numero desejado: ");
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
		sc.close();
	}

}
