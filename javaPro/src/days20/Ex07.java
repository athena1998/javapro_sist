package days20;

import java.util.Calendar;

public class Ex07 {
	public static void main(String[] args) {

		Calendar s = Calendar.getInstance();
		System.out.println(s);


		System.out.println(s.get(1));
		System.out.println(s.get(Calendar.YEAR));
		System.out.println(s.get(Calendar.MONTH));
		System.out.println(s.get(Calendar.DATE));
		System.out.println(s.get(Calendar.DAY_OF_MONTH));


		System.out.printf("%d시 %d분 %d초 %d밀리초\n", 
				s.get(Calendar.HOUR),s.get(Calendar.MINUTE),s.get(Calendar.SECOND),s.get(Calendar.MILLISECOND));
		
		// 월(0) - 일(7)
		int dayOfWeeks = s.get(Calendar.DAY_OF_WEEK);
		System.out.println("0일월화수목금토".charAt(dayOfWeeks));


	} // main

	public static String getCalendar(Calendar c) {
		return String.format("%d, %02d, %02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}
}
