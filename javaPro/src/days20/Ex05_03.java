package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05_03 {
	public static void main(String[] args) {
		
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String pattern = "홍길동";
		
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(data);
		
		System.out.println(data);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.printf("start : %d ~ end : %d\n", m.start(), m.end());
			if (count == 2) {
				m.appendReplacement(sb, "이정인");
			} // if
		} // while
		m.appendTail(sb);
		
		System.out.println(sb.toString());
		
	} // main

}
