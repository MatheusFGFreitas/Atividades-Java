package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite a hora que iniciou o jogo: ");
		a = sc.nextInt();
		
		System.out.print("Digite a hora que o jogo terminou: ");
		b = sc.nextInt();
		
		if ( a < b) {
			c = b - a;
		}else {
			c = 24 - a + b;
		}
		
		System.out.println("O jogo durou " + c + " horas");
		
		sc.close();
	}

}
