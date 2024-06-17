package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
//o throws ParseException é dito ao sistema que o metodo main não tem que tratar o parse, então não trava o sistema
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.print("Quarto de numero: ");
		int number = sc.nextInt();
		System.out.print("Data de Check-in (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de Check-out (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro em reserva, a data de check-out deve ser após a data de check-in");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva :" + reservation);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.print("Data de Check-in (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de Check-out (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva: data de reserva devem ser atualizados para datas futuras");
			}
			else if(!checkOut.after(checkIn)) {
				System.out.println("Erro em reserva, a data de check-out deve ser após a data de check-in");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reserva :" + reservation);
			}
		}
		
		sc.close();
	}

}
