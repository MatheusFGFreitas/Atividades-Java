package application;
//util utilizado no app
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
//entidades utilizadas nesse programa
import entities.Worker;
import entities.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;

public class ProgramExercicio1 {

	public static void main(String[] args) throws ParseException {
											//adicionado excessão ao codigo para a linha 40
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//formatado o jeito que o java receberá a data
		
		System.out.print("Entre o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre as informações do Trabalhador: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Nivel: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		//instanciado o objeto do tipo worker, com o nome que eu digitei, o nivel que eu digitei e o salario base que eu digitei
		//associado a esse objeto, terá outro objeto com o nome do departamento
		
		System.out.print("Quantos contratos para esse trabalhador? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entre o contrato de numero " + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração em horas do contrato: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); //instanciado o contrato
			worker.addContract(contract);//associando o contrato ao trabalhador
		}
		
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salario (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));//recortado os primeiros numeros inseridos na linha de cima, e transformado em int pelo Interger.parseInt
		int year = Integer.parseInt(monthAndYear.substring(3));//recortado os ultimos numeros, e transformado em int pelo Interger.parseInt
		System.out.println("Nome: " + worker.getName());//puxando o nome do objeto trabalhador
		System.out.println("Departamento: " + worker.getDepartament().getName());//puxando o nome do objeto departamento que esta associado ao objeto trabalhador
		System.out.println("o valor que o trabalhador recebeu durante " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		//print do mes e ano e passando o filtro no valor com duas casas decimais
			
		
		sc.close();
	}

}
