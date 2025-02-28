package days20;

import java.util.Calendar;

public class Ex07_02 {
	public static void main(String[] args) {
		
		int year = 2025;
		int month = 3;
		int day = 1;
		
		Calendar c = Calendar.getInstance();
		
		System.out.println();
		
		getDayOfWeek(c);
		getLastDay(c);
		
	} // main
	private static int getLastDay(Calendar c) {
		int lastDay = c.getActualMaximum(Calendar.DATE);
		return lastDay;
		
	}
	private static int getDayOfWeek(Calendar c) {
		int dayOfWeeks = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeeks;
		
	}
	public static String getCalendar(Calendar c) {
		return String.format("%d, %02d, %02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}

}
