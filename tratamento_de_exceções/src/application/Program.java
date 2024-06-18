package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		//apagado o throws parse exeption, pois iremos tratar na terceira versão
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		try {//colocado o programa inteiro em um Try para caso acontecer algum erro, cair no catch, ou seja, estamos tratando o codigo
			System.out.print("Quarto de numero: ");
			int number = sc.nextInt();
			System.out.print("Data de Check-in (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de Check-out (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
				//removido os if e else da verificação, veja versão antiga no github para entender
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva :" + reservation);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.print("Data de Check-in (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de Check-out (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
				//removido o if e else da verificação da atualização
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reserva :" + reservation);
		}
		catch(ParseException e) {//codigo tratado para caso coloquem a data invalida no programa
			System.out.println("Formato de data invalida");
		}	//alterado para DomainException
		catch(DomainException e) {//para retornar o erro illegal argument colocano o e como o retorno
			System.out.println("Erro na reserva: " + e.getMessage());//trazendo a mensagem de erro
		}
		catch(RuntimeException e) {//para trazer um erro inesperado
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}

}
