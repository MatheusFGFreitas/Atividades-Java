package util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDatas {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/text/DateFormatter.html
		//local de onde é ensinado a formatar a data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); //instanciando data
		LocalDateTime d02 = LocalDateTime.now(); //instanciando data com horario
		Instant d03 = Instant.now();//instanciando data e horario GMT
		
		LocalDate d04 = LocalDate.parse("2024-03-21");//instanciado data escolhida
		LocalDateTime d05 = LocalDateTime.parse("2024-03-21T01:30:25");//instanciado data e horario escolhido
		
		Instant d06 = Instant.parse("2024-03-21T01:30:26z");//Instanciado no horario de Londres
		Instant d07 = Instant.parse("2024-03-21T01:30:26-03:00");//Instanciado no horaro BR(-03:00)
		
		LocalDate d08 = LocalDate.parse("21/03/2024", fmt1);//local date puxando a formatação do texto
		LocalDateTime d09 = LocalDateTime.parse("21/03/2024 01:30", fmt2);//Local date puxando a segunda formatação para o horario
		
		LocalDate d10 = LocalDate.of(2024, 7, 20);//tipo de instanciamento por ano, mes, dia respectivamente
		LocalDateTime d11 = LocalDateTime.of(2024, 07, 20, 1, 30);//tipo de instanciamento por ano, mes, dia, hora, minuto respectivamente
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
