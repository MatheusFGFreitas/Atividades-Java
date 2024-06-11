package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PagamentoTaxa;
import entities.Empresa;
import entities.Individual;

public class ProgramEX4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PagamentoTaxa> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de pagadores de taxas: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println("Taxa de numero" + i + ": ");
			System.out.print("Empresa ou Individual? (e/i)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Valor ganho anual: ");
			double pagamentoAnual = sc.nextDouble();
			if(ch == 'e') {
				System.out.print("Qual a quantidade de funcionarios: ");
				Integer funcionarios = sc.nextInt();
					list.add(new Empresa(nome, pagamentoAnual, funcionarios));
				}
				else {
					System.out.print("Quanto foi o gasto com saude? : ");
					double saude = sc.nextDouble();
					list.add(new Individual(nome, pagamentoAnual, saude));
			}
		}
		
		System.out.println();
		System.out.println("Pagamento de taxas: ");
		for(PagamentoTaxa pgt : list) {
			System.out.println(pgt.getNome() + " $: " + String.format("%.2f", pgt.taxa()));
		}
		
		double soma = 0;
		for(PagamentoTaxa pgt : list) {
			soma += pgt.taxa();
		}
		
		System.out.println("Valor total R$: " + soma);
		
		sc.close();
	}

}
