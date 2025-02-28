package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11_02 {
	public static void main(String[] args) {
		
		String s = "2025.02.28 (금)";
		
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(s);
			System.out.println(d.toLocaleString());
			Calendar c = Calendar.getInstance();
			c.setTime(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		int year = Integer.parseInt(s.substring(0,4));
//		int month = Integer.parseInt(s.substring(5,7));
//		int date = Integer.parseInt(s.substring(8,10));
//		
//		Date d = new Date(year-1900, month-1, date);
		
		
		
	} // main

}
