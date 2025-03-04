package days21;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex03_04 {
	public static void main(String[] args) {
		
		
		LocalDate now = LocalDate.now();
		now = now.withDayOfMonth(1);
		System.out.println(now);
		now = now.plusMonths(1);
		System.out.println(now);
		now = now.minusDays(1);
		System.out.println(now);
		
		LocalTime t = LocalTime.now();

		
		
		
	} // main

}
