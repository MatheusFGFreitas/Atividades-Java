package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio2Para {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int IN = 0;
		int OUT = 0;
		int i = 0;
		
		for(i = 0; i < N; i++) {
			int X = sc.nextInt();
			if(X>=10 && X<=20) {
				IN = IN + 1;
			}
			else {
				OUT = OUT + 1;
			}
			
		}
		
		System.out.println(IN + " IN");
		System.out.println(OUT + " OUT");
		sc.close();
		
	}

}
