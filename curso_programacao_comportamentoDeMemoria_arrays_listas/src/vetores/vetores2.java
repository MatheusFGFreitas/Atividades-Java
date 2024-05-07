package vetores;

import java.util.Locale;
import java.util.Scanner;

import utilVetores.produtos;

public class vetores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		produtos[] vect = new produtos[n];
		
		for (int i=0; i<vect.length; i++) { //use o vect.length que é melhor que a propria variavel N
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new produtos(name, price);
		}
		
		double soma = 0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Preço medio é de = %.2f%n", media);
		
		sc.close();
	}

}