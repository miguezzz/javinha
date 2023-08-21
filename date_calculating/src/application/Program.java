package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.parse("2023-08-21");
		LocalDateTime t = LocalDateTime.parse("2023-08-21T17:30:29");
		Instant i = Instant.parse("2023-08-21T17:30:29Z");
		
		LocalDate pastWeek = d.minusDays(7);
		LocalDate nextWeek = d.plusDays(7);
		
		System.out.println("past week: " + pastWeek);
		System.out.println("next week: " + nextWeek);
		//funciona analogamente para LocalDateTime
		
		LocalDateTime x = t.plusHours(2);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(x.format(fmt));
		
		Instant pastWeekInstant = i.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = i.plus(7, ChronoUnit.DAYS);
		
		DateTimeFormatter instFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("pastWeekInstant: " + instFmt.format(pastWeekInstant));
		System.out.println("nextWeekInstant: " + instFmt.format(nextWeekInstant));
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		
		Duration d1 = Duration.between(pastWeekInstant, nextWeekInstant);
		
		System.out.println("de semana passada ate a proxima: " + d1.toDays() + " dias.");
		
		//para usar no localdate
		Duration d2 = Duration.between(pastWeek.atStartOfDay(), d.atStartOfDay());
		System.out.println("de semana passada ate hj: " + d2.toDays() + " dias.");
	}
}
