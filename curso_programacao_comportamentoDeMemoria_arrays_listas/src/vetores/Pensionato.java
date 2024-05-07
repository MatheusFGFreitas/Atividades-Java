package vetores;

import java.util.Locale;
import java.util.Scanner;

import utilVetores.Aluguel;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel [] vect = new Aluguel[10]; //criação do vetor aluguel
		
		System.out.print("Quantos quartos serão alugados?"); //mensagem do sistema
		int n = sc.nextInt(); //quantidade de quartos que serão alugados
		
		for (int i = 1; i<=n; i++) { //abertura do laço de repetição
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.println("Nome:");
			sc.nextLine(); //next line por causa do espaço, e isso é para limpar o buffer tambem
			String nome = sc.nextLine();
			System.out.println("Email:");
			String email = sc.next(); //next porque esse não tem espaço
			System.out.println("Quarto:");
			int numeroQuarto = sc.nextInt(); //next int lendo o numero do quarto
			
			vect[numeroQuarto] = new Aluguel(nome, email); //instanciando e atribuindo a referencia para a posição em uma linha só
			
		}
		
		System.out.println();
		System.out.println("Quartos Alugados:");
		for (int i = 0; i < 10; i++) { //laço de repetição para dar print nos quartos
			if (vect[i] != null) { //criação de if para qualquer local no vetor diferente de Nulo ser jogado na tela
				System.out.println(i + ":" + vect[i]); // sysout para o numero do quarto junto com os dados
			}
		}
		
		sc.close();

	}

}
