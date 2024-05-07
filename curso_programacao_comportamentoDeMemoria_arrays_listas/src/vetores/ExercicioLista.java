package vetores;

import utilVetores.Empregados;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//parte de criação da lista
		List<Empregados> list = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados");
		int N = sc.nextInt();
		
		//criação do laço de repetição
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Empregado #" + (i+1) + ":");
			System.out.print("ID:");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine(); //para limpar o buffer de entrada
			String nome = sc.nextLine(); //next line para ler até espaço se necessario
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			
			Empregados emp = new Empregados(id, nome, salario);
			
			list.add(emp);			
		}
		
		System.out.println();
		//criação da validação de ID existente com a função auxiliar apos o fim do void main
		System.out.print("Entre o ID do empregado que trá o aumento de salario: ");
		int idSalario = sc.nextInt();
		Integer pos = posicao(list, idSalario);
		if (pos == -1) { //caso não encontre o ID, cairá nisso
			System.out.println("Esse ID não existe!");
		}
		else { //caso encontre, aqui vem o aumento de salario
			System.out.print("Entre a porcentagem de aumento de salario: ");
			double porcento = sc.nextDouble();
			list.get(pos).aumentoSalario(porcento);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		System.out.println();
		
		for(Empregados emp : list) { //codigo para puxar a impressão de todos os dados em uma linha so
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	//criação de função auxiliar
	public static int posicao(List<Empregados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	
}
