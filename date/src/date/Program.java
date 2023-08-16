package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatacao do tipo date para um formato especifico
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d = LocalDate.now(); //date
		LocalDateTime t = LocalDateTime.now(); //date + hour
		Instant i = Instant.now(); // date + GMT hour (Z)
		
		LocalDate d01 = LocalDate.parse("2004-05-12"); //format ISO-8601 to LocalDate
		LocalDateTime t01 = LocalDateTime.parse("2004-05-12T13:21:12.2"); //format ISO-8601 to LocalDateTime
		Instant i01 = Instant.parse("2028-06-21T00:00:02Z"); // date + GMT hour (Z)
		Instant iPegadinha = Instant.parse("2023-08-15T10:10:10-03:00"); //hora no fuso de brasilia (-03:00)
		
		LocalDate d02 = LocalDate.parse("12/05/2004", fmt1); //passamos o formato definido anteriormente para utilizarmos este modelo. eh como uma sobrecarga
		LocalDateTime d03 = LocalDateTime.parse("12/05/2004 21:12", fmt2);
		
		LocalDateTime d04 = LocalDateTime.of(2023, 8, 15, 22, 16);
		
		System.out.println(d); //implicitamente usando o .toString()
		System.out.println(t);
		System.out.println(i);
		
		System.out.println(d01);
		System.out.println(t01);
		System.out.println(i01);
		System.out.println(iPegadinha); //imprime no GMT
		
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
	}

}
