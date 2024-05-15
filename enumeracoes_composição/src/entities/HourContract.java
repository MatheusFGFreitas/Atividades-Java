package entities;

import java.util.Date;//importado java util para as datas

public class HourContract {

	private Date date; //criado atributo data
	private Double valuePerHour;// criado atributo valor por hora
	private Integer hours;//criado atributo horas
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours; //criado a operação que retornará o valor do contrato inteiro
	}
}