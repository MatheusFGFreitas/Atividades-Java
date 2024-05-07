package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class exercicioAluno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("insira o nome do aluno, a primeira nota, a segunda e a terceira:");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.00) {
			System.out.println("Reprovado");
			System.out.printf("Pontos a menos: %.2f%n", 60 - aluno.notaFinal());
		}
		else {
			System.out.println("Aprovado");
		}
		
		sc.close();

	}

}
