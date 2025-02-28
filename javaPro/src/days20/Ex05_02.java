package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05_02 {
	public static void main(String[] args) {
		
		String source = "안녕하세요 홍길동입니다"
				+ "핸드폰 번호는 010-2324-2321, 집번호 02-543-3232 입니다";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		while (m.find()) {
			System.out.printf("%s\t%s-%s-%s\n", m.group(), m.group(1),  m.group(2), m.group(3));
		} // while
		
	} // main

}
