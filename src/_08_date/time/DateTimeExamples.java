package _08_date.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

	private static final String CARACAS_TZ = "America/Caracas";

	public static void main(String[] args) {
		LocalDate nowAsDate = LocalDate.now();
		LocalDateTime nowAsDateTime = LocalDateTime.now();
		LocalTime nowAsTime = LocalTime.now();
		
		System.out.println("local date: " + nowAsDate);
		
		System.out.println("local date+time: " + nowAsDateTime);
		
		System.out.println("local time: " + nowAsTime);
		
		System.out.println("any day: " + LocalDate.of(2015, Month.MARCH, 5));
		
//		System.out.println("in 10 years: " + nowAsDate.plus(1, ChronoUnit.DECADES));
//
//		ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of(CARACAS_TZ));
//		System.out.println(CARACAS_TZ + ": " + zonedDateTime);
		
	}
}
