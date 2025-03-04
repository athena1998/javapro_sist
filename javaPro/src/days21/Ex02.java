package days21;

/**
 * @author junginn
 * @date : 2025. 3. 4. - 오전 11:20:14
 * @subject java.time 패키지 - 날짜, 시간 패키지
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 * 5개의 time 패키지
		 * 날짜 클래스 / 시간 클래스 분리
		 * 1. 날짜 : LocalDate 클래스
		 * 2. 시간 : LocalTime 클래스
		 * 3. 날짜+시간 : LocalDateTime 클래스
		 * 4. 날짜+시간+시간대 : ZoneDateTime 클래스
		 * -> 모두 Temporal, TemporalAccessor, TemporalAdjuster 
		 * 	  인터페이스를 구현한 클래스
		 * 
		 * 날짜와 날짜 사이의 간격 : Period 클래스
		 * 시간과 시간 사이의 거리 : Duration 클래스
		 * -> TemporalAmount 인터페이스를 구현한 클래스
		 * 
		 * 날짜, 시간, 객체 생성 : now(), of()
		 * 
		 * 날짜. 시간의 특정값 (년,월, 일, 시간)을 얻어올때
		 * -> get(int field)
		 * -> getYear 등등
		 * -> plus(), minus()
		 * -> with()
		 * 
		 * TemporalUnit 인터페이스
		 * -> 날짜, 시간의 단위를 정의해놓은 인터페이스
		 * -> 이 인터페이스를 구현한 클래스 : ChronoUnit
		 * 
		 * TemporalField 인터페이스
		 * -> 필드
		 * -> 필드를 정의해놓은 인터페이스
		 * -> ChronoField 클래스
		 * 
		 */
		
		
	} // main

}
