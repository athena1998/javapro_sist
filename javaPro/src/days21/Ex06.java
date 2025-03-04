package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Ex06 {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.of(2025, 02, 03);
		LocalDate now = LocalDate.now();

		// Period.between() 메소드를 통해 날짜간의 간격을 Period객체로 얻어올 수 있다. 
		Period p = Period.between(d, now);
		
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		System.out.println("----------------------------------------");
		
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.get(ChronoUnit.DAYS));
		
		LocalTime t = LocalTime.of(9, 0, 0);
		LocalTime nowT = LocalTime.now();
		
		Duration duration = Duration.between(t, nowT);
		System.out.printf("%d시간 %d분 %d초 지남\n", duration.toHours(), duration.toMinutes()%60, duration.getSeconds()%60);
		
		System.out.println("----------------------------------------");
		
		long hours = ChronoUnit.HOURS.between(t, nowT);
		long minute = ChronoUnit.MINUTES.between(t, nowT);
		System.out.printf("%d시간 %d분 지남\n", hours, minute%60);
		
		
	} // main
}
