package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex03_02 {
	public static void main(String[] args) {
		
		LocalTime loc = LocalTime.now();
		System.out.println(loc);
		
		int minute = loc.get(ChronoField.MINUTE_OF_HOUR);
//		int minute = loc.getMinute();
		System.out.println(minute);
		
//		int second = loc.get(ChronoField.SECOND_OF_MINUTE);
		int second = loc.getSecond();
		
		System.out.println(second);

		int milesSecond = loc.get(ChronoField.MICRO_OF_SECOND);
		System.out.println(milesSecond);
		
		
	} // main

}
