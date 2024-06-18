package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para formatar a data
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if(!checkOut.after(checkIn)){//copiado para o inicio do construtor, para ser tratado desde o inicio isso é uma boa pratica e 
			throw new DomainException("a data de check-out deve ser após a data de check-in");//se chama programação defensiva
		}
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
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {//esse metodo fará o checkIn do objeto receber o que vem do argumento
		Date now = new Date();							//colocado throws DomainException para ser tratado no programa principal
		if(checkIn.before(now) || checkOut.before(now)) {//atualizado com os if que estavam no programa principal
			throw new DomainException("data de reserva devem ser atualizados para datas futuras");
		}//colocado um throw illegal argument, para usarmos uma exceção caso o argumento seja invalido
		//alterado depois para DomainException, pois é a exceção personalizada que criamos
		if(!checkOut.after(checkIn)) {
			throw new DomainException("a data de check-out deve ser após a data de check-in");
		}
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
