package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex03 {
	public static void main(String[] args) {
		
		// 1. LocalDate 클래스
		// LocalDate은 NEW 생성자를 사용허지 않는다
		LocalDate d = LocalDate.now(); // 2025-03-04
		
		System.out.println(d);
		
//		int year = d.getYear();
		int year = d.get(ChronoField.YEAR);
		System.out.println(year);
		
		int month = d.getMonthValue();
//		Month month = d.getMonth();
//		int month = d.get(ChronoField.MONTH_OF_YEAR);
		
		System.out.println(month);
		
//		int day = d.getDayOfMonth();
		int day = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		
		DayOfWeek date = d.getDayOfWeek();
//		int date = d.get(ChronoField.DAY_OF_WEEK);
		
		System.out.println(date);
		System.out.println(date.getValue());
		
		System.out.println(d.isLeapYear());
		
		
	} // main

}
