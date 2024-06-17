package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para formatar a data
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {//implementada a duração em dias, mandando retornar long, pois é o inteiro mais longo que tem
		long diff = checkOut.getTime() - checkIn.getTime();//calculado a diferença em milisegundos, o padrão do java
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//transformando milisegundos em dias para ser retornado
	}
	
	public void updateDates(Date checkIn, Date checkOut) {//esse metodo fará o checkIn do objeto receber o que vem do argumento
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto "
				+ roomNumber
				+ ", Check-in: "
				+ sdf.format(checkIn)
				+ ", Check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " noites";

	}
}
