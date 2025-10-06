package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite o numero desejado ");
		
		a = sc.nextInt();
		
		if(a < 0 ) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero positivo");
		}
		
		sc.close();

	}

}
