package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 번규표현식 (Regular Expression)
		 * 	문자열 속에 원하는 패턴과 일치하는 문자열을 찾기 위해서 사용하는 식
		 * 	미리 정의된 기호나 문자 사용
		 * 	java.util.regex 패키지
		 * 		ㄴ pattern 클래스 - 정규식을 정의
		 * 		ㄴ Matches 클래스 - 데이터와 정규식을 비교
		 */

		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" };

		String regex = "[a-zA-Z&&[^b-d]].*";
		
//		for (int i = 0; i < data.length; i++) {
//			data[i].matches(regex);
//			System.out.printf("%s - %s 패턴 : %b\n", data[i], regex , data[i].matches(regex));
//		}
		
		Pattern pattern = Pattern.compile(regex);
		
		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);
			if (matcher.matches()) {
				System.out.println(data[i]);
			} // if
		}
		
		// 비밀번호 정규표현식
		String passwordRegex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
		
		
	      // String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
	      // String regex = "c[a-z]";  // c문자 + 소문자 1개
	      // String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
	      
	      // String regex = "c[a-zA-Z0-9] : c부터 시작해서 알파벳 소문자 대문자 숫자 가능";
	      // String regex = "c\\w" c문자부터 시작해서 알파벳 소문자 대문자 숫자 가능 ;
	      // String regex = ".*"; // 모든 한글자를 의미
	      // String regex = "c." // c 부터 임의의 문자 1개를 의미;
	      // String regex = "c\\." // c. 을 의미;
	      // String regex = "c[0-9] // // c문자 + 0부터 9까지 1개";
	      // String regex = "c.*t" // c뒤에 한글자가 이 탭 키 입력;
	      // String regex = "[b|c]"; // b 또는 c
	      // String regex = "[bc]"; // b,c중 한 문자
	      // String regex = "[b-c].*";
	      // String regex = "[^bc].*";

	      // String regex = ".*a.*";

	      // String regex = "[^bcd].*";

	      // String regex = "[a-zA-Z].*";
	      // String regex = "[ae-zA-Z].*";
		
	

	} // main

}
