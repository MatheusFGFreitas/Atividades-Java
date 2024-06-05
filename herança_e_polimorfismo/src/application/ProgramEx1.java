package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramEx1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre o numero de empregados: ");
		int n = sc.nextInt();//entrado o numero de empregados
		
		for (int i=1; i<=n; i++) {//criado laço de repetição para leitura de todos os funcionarios
			System.out.println("Entre os dados do empregado " + i + ": ");//programa informando para entrar o dado dos funcionarios
			System.out.print("O funcionario é tercerizado?: (y/n)");//leitura para saber se o funcionario é tercerizado
			char ch = sc.next().charAt(0);//codigo para a leitura da resposta y ou n
			System.out.print("Nome: ");
			sc.nextLine();//quebra de linha para liberar o buffer
			String name = sc.nextLine();//leitura do nome
			System.out.print("Horas Trabalhadas: ");
			int hours = sc.nextInt();//leitura das horas trabalhadas
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();//leitura do valor por hora
			if (ch == 'y') {//aberto if or else para o funcionario tercerizado ou não
				System.out.print("Insira o valor adicional: ");//caso seja terceirizado
				double additionalCharge = sc.nextDouble();//leitura do valor do adicional
				//Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); movido para o list add para economizar linha no codigo, mantido comentario para recordação
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));//adicionado na lista como OutsourcedEmployee
			}
			else {//caso não seja
				//Employee emp = new Employee(name, hours, valuePerHour);feito a mesma coisa aqui
				list.add(new Employee(name, hours, valuePerHour));//adicionado na lista como empregado
			}
		}
		
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			//printar o nome do funcionario concatenado com o pagamento formatado em 2 casas decimais pelo String.format
		}
		
		
		sc.close();
	}

}
