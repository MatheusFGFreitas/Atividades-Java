package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department departament;
	private List<HourContract> contracts = new ArrayList<>();//lista não é criada por getter e setter
															//você instancia ela como ArrayList<>()
	public Worker () {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//public void setContracts(List<HourContract> contracts) {
	//	this.contracts = contracts;  //setContracts não pode ser utilizado, coloquei como comentario para sempre relembrar
	//}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);//metodo responsavel para fazer a associação do trabalhador ao contrato
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);//metodo responsavel para remover a associação do trabalhador ao contrato
	}
	
	public double income(int year, int month) {
		double sum = baseSalary; //criado a instancia soma com o salario base
		Calendar cal = Calendar.getInstance(); //chamado ao Java o Calendario para trabalhar com datas
		for (HourContract c : contracts) { //aberto um laço de repetição sobre contratos
			cal.setTime(c.getDate()); //para cada contrato c, é setado a data do calendario nesse calendario e definiu a data no calendario
			int c_year = cal.get(Calendar.YEAR);//agora traz o ano do calendario para o c_year
			int c_month = 1 + cal.get(Calendar.MONTH);//mesma coisa para o mês, mas ele começa com 0, então é colocado o 1 + no inicio
			
			if(year == c_year && month == c_month) {//se o ano for igual ao ano do contrato e o mês tambem
				sum += c.totalValue();//o valor do contrato entra na soma
			}			
		}
		return sum;
	}
}
