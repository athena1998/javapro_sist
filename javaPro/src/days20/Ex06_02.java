package days20;

import java.util.Date;

public class Ex06_02 {
	public static void main(String[] args) {

		int year = 2025;
		int month = 3;

		/*
		Date d = new Date();
		d.setYear(2025-1900);
		d.setTime(month-1);
		d.setDate(1);
		 */

		// [2]
		//		 Date d = new Date(2025-1900, 3-1, 1);

		// [3] month 마지막 날짜
		//		 Date d = new Date(2025-1900, 3-1, 1);
		//		 int date = d.getDate();
		//		 d.setDate(date+1);
		
		// 1달 더하기
		Date d = new Date();
		d.setDate(d.getDate() - 1);


		System.out.println(d.getDay()); // 일(0) ~ 토(6)



	} // main

}
