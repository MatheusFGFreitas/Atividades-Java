package curso_porgramacao_estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração minima de 1 hora e maxima de 24 horas
		
		Scanner sc = new Scanner(System.in);
		int H1;
		int H2;
		int HF;
		
		System.out.println("digite o horario do inicio do jogo");
		H1 = sc.nextInt();
		
		System.out.println("digite o horario do fim do jogo");
		H2 = sc.nextInt();
		
		if (H1 < H2) {
			HF = H2 - H1;
		}
		else {
			HF = 24 - H1 + H2;
		}
		System.out.println("o jogo durou " + HF + " hora(s)");
		sc.close();

	}

}
