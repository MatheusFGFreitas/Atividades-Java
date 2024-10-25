package application;

import java.util.Scanner;

import services.PrintService;

public class Exemplo {

	public static void main(String[] args) {//exemplo de reuso, utilizando int em print service, caso eu queira mudar para string, devemos
		//mudar todo o print service para utilizar string, ou então criar outro print service para strings, o que seria reuso
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("Quantos valores serão inseridos? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("Primeiro: " + ps.first());
		
		sc.close();

	}

}
