package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex04 {
	public static void main(String[] args) {
		
//		LocalDateTime dt = LocalDateTime.now();
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println(dt);
		
		d = dt.toLocalDate();
		System.out.println(d);
		
		dt = d.atTime(t);
		System.out.println(dt);
		
		// truncatedTo 기본 밀리초에서 분까지만 출력, 초까지만 출력할 수 있는 메소드
		dt = dt.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(dt);
		
	} // main

}
