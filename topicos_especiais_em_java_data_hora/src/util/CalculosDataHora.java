package util;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-07-23");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-23T01:30:26");
		Instant d03 = Instant.parse("2024-07-23T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);//data do d01 menos 7 dias
		LocalDate nextWeekLocalDate = d01.plusDays(7);//data d01 mais 7 dias
		//LocalDate plusYearLocalDate = d01.plusYears(2); para ano por exemplo
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);//date time -7 dias
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);//date time +7 dias
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);//instant para dias 
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);//instant para dias
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());//necessario adicionar at start of day para colocar o horario
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);//instanciando a diferença entre pastweeklocaldatetime e o d02
		Duration t3 = Duration.between(pastWeekInstant, d03);//diferença instant somando
		Duration t4 = Duration.between(d03, pastWeekInstant);//diferença instant subitraindo
		
		System.out.println("T1 dias = " + t1.toDays());//saida da diferença
		System.out.println("T2 dias = " + t2.toDays());//saida da diferença das duas datas em dias
		System.out.println("T3 dias = " + t3.toDays());//saida da diferença instant somando
		System.out.println("T4 dias = " + t4.toDays());//saida diferença instant subtraindo
		
		
		
		
	}

}
