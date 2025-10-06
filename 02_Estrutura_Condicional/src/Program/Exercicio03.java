package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		b = sc.nextInt();
		
		//trocando os numeros para ficarem em ordem
		if (a < b) {
			c = a;
			a = b;
			b = c;
		}
		
		if (a % b == 0) {
			System.out.println("Os numeros sao multiplos!");
		}else {
			System.out.println("Os numeros nao sao multiplos!");
		}
		
		sc.close();

	}

}
