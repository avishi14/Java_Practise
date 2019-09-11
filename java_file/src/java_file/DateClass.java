package java_file;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalTime time = LocalTime.now();
		System.out.println(time);*/
		LocalDateTime dttime = LocalDateTime.now();
		System.out.println("Before formatting: "+dttime);
		
		DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String formatDate = dttime.format(dtfmt);
		System.out.println(formatDate);
		System.out.println(dttime.format(dtfmt));
	}

}
