package model.entities;

public class Employee implements Comparable<Employee>{//para o employee ser ordenavel, tenho que implementar a interface comparable

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

	@Override
	public int compareTo(Employee other) {//implementado o metodo compare to para comparar o objeto com algum outro objeto
		return name.compareTo(other.getName());//ordenando por nome, definindo que o return irá trazer o nome do funcionario, comparando com outro funcionario
		//caso eu queria comparar por salario, é so trocar o name pra salary
		//e caso seja salario decrescente, so colocar como -salary
	}
	
	//compare to devolve um numero inteiro, comparando um objeto inteiro, trazendo negativo, zero ou positivo
	//se o objeto for menor, igual ou maior respectivamente
}
