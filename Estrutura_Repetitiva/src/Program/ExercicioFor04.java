package Program;

import java.util.Scanner;

public class ExercicioFor04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int in = 0 , out = 0;
		
		System.out.print("Quantos numeros irá digitar? ");
		
		int N = sc.nextInt();
		
		System.out.println("Digite os numeros na sequencia: ");
		
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in = in +1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.println("dentro: " + in);
		System.out.println("fora: " + out);
		
		sc.close();
		

	}

}
