package days20;

import java.util.Date;

/**
 * @author junginn
 * @date : 2025. 2. 28. - 오후 12:30:51
 * @subject	날짜 다루는 클래스
 * 			형식화 클래스
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		
		/* jdk 1.8 : java.util.date 클래스
		 * jdk 1.1 : java.util.Calendar 클래스
		 * jdk 1.8 : java.time 패키지 
		 * 
		 */
		
		Date d = new Date();
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime()); // long 1970년 1월 1월 0시 0분 0초부터 지금까지 계산된 milesecond
		System.out.println(d.getDay()); // 월 화 수 목 금 토 일
		
		System.out.println("일월화수목금토".charAt(d.getDay()) );
	} // main

}
