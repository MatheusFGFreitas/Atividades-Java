package Program;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int multi;
		
		for (int i = 1; i<=10; i++) {
			multi = i * n;
			System.out.println(i + " X " + n + " = " + multi);
		}
		
		
		
		sc.close();

	}

}
