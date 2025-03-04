package days21;

import java.time.LocalDate;

public class Ex03_03 {
	public static void main(String[] args) {
		
		
		LocalDate d = LocalDate.of(2025, 02, 03);
		System.out.println(d);
		
		// 생일
		// A - 1990.2.5
		// B : 1995.4.25
		// c : 2000.11.23
		
		LocalDate a = LocalDate.of(1990, 02, 05);
		LocalDate b = LocalDate.of(1995, 04, 25);
		LocalDate c = LocalDate.of(2000, 11, 23);
		
		int date = LocalDate.now().getDayOfYear();
		LocalDate now = LocalDate.now();
		
		System.out.println((a.getDayOfYear()) < date ? "생일이 지남" : "생일이 안지남");
		System.out.println((b.getDayOfYear()) < date ? "생일이 지남" : "생일이 안지남");
		System.out.println((c.getDayOfYear()) < date ? "생일이 지남" : "생일이 안지남");
		
		
		
	} // main

}
