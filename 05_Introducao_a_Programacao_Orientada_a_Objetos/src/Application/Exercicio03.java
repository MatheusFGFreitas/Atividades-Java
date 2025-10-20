package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno x;
		x = new Aluno();
		
		System.out.print("Nome: ");
		x.nome = sc.nextLine();
		
		System.out.println("Notas: ");
		x.nota1 = sc.nextDouble();
		x.nota2 = sc.nextDouble();
		x.nota3 = sc.nextDouble();
		
		double notaFinal = x.notaFinal();
		
		System.out.printf("Nota final =  %.2f%n", notaFinal);
		
		if(notaFinal < 60) {
			System.out.println("Não Passou");
			double falta = 60 - notaFinal;
			System.out.println("Falta " + falta + " pontos");
		}else {
			System.out.println("Passou");
		}
		
		sc.close();

	}

}
