package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex07_02 {
	public static void main(String[] args) {
		// 문자열 -> 날짜 객체
		String str = "2025년 03월 04일 (화)";
		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(str, dtf);
		System.out.println(d);
		
	} // main

}
