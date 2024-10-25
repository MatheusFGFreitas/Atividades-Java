package application;

import java.util.Scanner;

import services.PrintService;

public class Exemplo {

	public static void main(String[] args) {//exemplo de reuso, utilizando int em print service, caso eu queira mudar para string, devemos
		//mudar todo o print service para utilizar string, ou então criar outro print service para strings, o que seria reuso.//
		
		
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();//o primeiro abre e fecha é colocado o tipo que deseja, o segundo abre e fecha é opcional
		
		System.out.print("Quantos valores serão inseridos? ");
		int n = sc.nextInt();
		
		//ps.addValue("Maria");//graças a trocar pra object, isso pode acontecer, ou seja, vai adicionar duas coisas ao mesmo tempo, o que
							 //pode resutar em erro, pois o primeiro valor pode ser diferente do valor inserido mais tarde
							 //graças a parametrização generica no Print Service, o string não pode ser convertido pra inteiro, batendo no type safety
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first(); //alterando o printService para object, o type safety não pode converter o object para integer
								//forçando a fazer o casting	depois da atualização para generics, não é mais necessario 
						
		System.out.println("Primeiro: " + x);
		
		sc.close();

	}

}
