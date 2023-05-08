package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date =LocalDate.now();
		System.out.println(date);
		
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:MM:SS");
		System.out.println(formatter);
		
		System.out.println(formatter.format(dateTime));
		
	}

}
