package curso_porgramacao_estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio1Enquanto {

	public static void main(String[] args) {
		//escreva um programa que repita a leitura de uma senha até que seja valida. Para cada leitura da senha incorreta, escreva senha invalida. quando for informada corretamente, informe acesso permetido e encerre o programa. considere que a senha correta é 2002
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");			
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
