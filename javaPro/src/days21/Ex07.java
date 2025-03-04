package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author junginn
 * @date : 2025. 3. 4. - 오후 3:11:19
 * @subject java.util.format
 * 			ㄴ DataTimeFormatter 형식화 클래스
 * 				날짜와 시간을 형식
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		
		// between = static
		// until = 객체 생성
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
		
		// 2025/03/04 화요일 15:16:45.123
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd E요일 HH:mm:ss.SSS");
//		System.out.println(dt.format(dtf));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(dt.format(dtf));
		
	} // main

}
