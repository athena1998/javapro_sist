package days21;

import java.text.MessageFormat;

public class Ex01 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		// 출력 형식 : 이름: 홍길동, 나이 : 20살 성별: 여자
//		String.format("이름: %s, 나이: %d 성별: %b", name, age, gender);
		
		
//		String pattern = "이름: {0}, 나이 : {1}살 성별: {2}";
//		MessageFormat mf = new MessageFormat(pattern);
//		String s = mf.format(new Object[] {name, age, gender});
//		System.out.println(s);
		
		
		String pattern = "이름: {0}, 나이: {1}살 성별: {2}";
		String s = MessageFormat.format(pattern, name, age, gender);
		System.out.println(s);
		
	} // main

}
