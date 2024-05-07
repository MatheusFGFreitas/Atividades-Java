package util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraCustomizado {

	public static void main(String[] args) {
		
		
		LocalDate d01 = LocalDate.parse("2024-07-23");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-23T01:30:26");
		Instant d03 = Instant.parse("2024-07-23T01:30:26Z");
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/text/DateFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatação da data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//formatação com data e horario
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//formatado com a data, horario e o fuso-horario do pc que está utilizando o programa
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//formatação com data e horario do site date formatter
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//formatação do site com fusohorario
		
		System.out.println("d01 = " + d01.format(fmt1));//seguindo a formatação feita no datetimeformatter
		System.out.println("d01 = " + fmt1.format(d01));//chamando de jeito diferente com a mesma finalidade
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//com codigo de formatação na mesma linha
		
		System.out.println("d02 = " + d02.format(fmt1));//formatado sem a hora
		System.out.println("d02 = " + d02.format(fmt2));//formatado com a hora
		System.out.println("d02 = " + d02.format(fmt4));//formatado com o pattern do site
		
		System.out.println("d03 = " + fmt3.format(d03));//formatado com a data e horario com o fuso-horario da maquina
		System.out.println("d03 = " + fmt5.format(d03));//formatado com o pattern do site
		
	}

}
