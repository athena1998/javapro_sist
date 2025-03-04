package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex05 {
	public static void main(String[] args) {
		
		// TemporalAdjuster
		// = Temporal + Adjuster
		// 	 시간상의	조정자
		
		// 날짜와 시간 수정
		// 자주 사용되는 날짜/시간을 조정허눈 기능이 구현된 클래스가 TemporalAdjuster
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
//		// 이번달 첫번째 월요일?
//		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
//		System.out.println(d);
//		
//		// 이번달 마지막 토요일
//		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
//		System.out.println(d);
//		
//		// 세번째주 토요일
//		d = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.SATURDAY));
//		System.out.println(d);
//		
//		// 돌아오는 수요일
//		// 기준일이 월요일이면 다음주 수요일이 아니라 이틀 후 인 그 주 수요일 출력
		// 기준일도 수요일이고 설정날도 수요일이면 기준일의 수요일을 출력
//		d = d.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
//		System.out.println(d);
		
//		int dayOfWeek = d.getDayOfWeek().getValue();
//		
//		if (dayOfWeek < DayOfWeek.WEDNESDAY.getValue()) {
//			d = d.plusWeeks(1);
//		} 
//		
//		// 기준일이 월요일이면 다음주 수요일이 아니라 이틀 후 인 그 주 수요일 출력
		// 기준일도 수요일이고 설정날도 수요일이면 기준일의 다음주 수요일을 출력
//		d = d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
//		
//		System.out.println(d);
		
		// 세번째주 목요일
		d = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(d);
		
		
		
		
		
		
	} // main

}
