package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> alunos = new HashSet<>();
		
		
		System.out.print("Quantos estudantes para o curso A?");
		int nA = sc.nextInt();
		for(int i = 0; i < nA; i++) {
			int codigoAluno = sc.nextInt();
			alunos.add(codigoAluno);
		}
		
		System.out.print("Quantos estudantes para o curso B?");
		int nB = sc.nextInt();
		for(int i = 0; i < nB; i++) {
			int codigoAluno = sc.nextInt();
			alunos.add(codigoAluno);
		}
		
		System.out.print("Quantos estudantes para o curso A?");
		int nC = sc.nextInt();
		for(int i = 0; i < nC; i++) {
			int codigoAluno = sc.nextInt();
			alunos.add(codigoAluno);
		}
		
		System.out.println("total de alunos: " + alunos.size());
		
		sc.close();
		
	}

}
