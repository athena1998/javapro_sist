package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11 {
	public static void main(String[] args) {
		
		// SimpleDateFormat
		//	ㄴ date, calendar 객체를 원하는 날짜 형식으로 출력
		
		// [1]
//		Date d = new Date();
//		System.out.println(d.toLocaleString());
//		System.out.println(d.toGMTString());
//		
		/*
		 * mm: 분 (minutes)을 나타냅니다.
		 * MM: 월 (month)을 나타냅니다.
		 * yyyy/MM/dd HH:mm:ss E요일
		 */
//		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(d));
		
		// [2]
//		Calendar c = Calendar.getInstance();
//		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(c.getTime()));

		// [3]
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy/MM/dd a hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		
	} // main

}
