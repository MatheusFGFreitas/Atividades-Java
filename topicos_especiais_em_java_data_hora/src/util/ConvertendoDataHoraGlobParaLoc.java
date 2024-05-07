package util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobParaLoc {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-07-23");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-23T01:30:26");
		Instant d03 = Instant.parse("2024-07-23T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());//formatando do horario de londres para sp br
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));//formatando do horario de londres para Portugal
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());//dessa vez formatando trazendo o horario tambem com o fuso-horario de SP
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));//formatando trazendo o horario para o fuso-horario de portugal
		
		System.out.println("r1 = " + r1);//traz um dia atrás pois é 3 horas a menos
		System.out.println("r2 = " + r2);//horario de portugal é 1 hora a mais que londres
		System.out.println("r3 = " + r3);//trazendo o dia e horario especifico com o fuso horario aplicado para SP
		System.out.println("r4 = " + r4);//trazendo o dia e horario especifico com o fuso horario aplicado para Portugal
		
		System.out.println("d01 Dia = " + d01.getDayOfMonth());
		System.out.println("d01 Mes= " + d01.getMonthValue());
		System.out.println("d01 Ano = " + d01.getYear());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());
		
	}

}
