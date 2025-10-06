package Program;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		//essa estrutura continua repetindo até que a condição seja falsa, quando for falsa, pula fora
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
