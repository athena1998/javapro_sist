package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {
	public static void main(String[] args) {
		
		// Calendar -> Date
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d.getDate());
		
		// Date -> Calendar  
		c.setTime(d);
		System.out.println(c.get(Calendar.DATE));
	
	
	
	
	} // main

}
