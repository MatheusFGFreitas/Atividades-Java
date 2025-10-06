package Program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double total;
		
		System.out.print("Qual será o produto? ");
		cod = sc.nextInt();
		
		System.out.print("Qual a quantidade do produto? ");
		quant = sc.nextInt();
		
		if (cod == 1) {
			total = quant * 4.0;
		}else if (cod == 2){
			total = quant * 4.5;
		}else if (cod == 3) {
			total = quant * 5.0;
		}else if (cod == 4) {
			total = quant * 2.0;
		}else {
			total = quant * 1.5;
		}
		
		System.out.println("Valor total: " + total);
		
		sc.close();
	}

}
