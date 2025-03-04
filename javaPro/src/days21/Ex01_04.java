package days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01_04 {
	public static void main(String[] args) {


		String s = "이름:홍길동, 나이:20살, 성별:여자";

		// 패턴 수정: 쉼표와 공백도 처리하도록 변경
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);

		String name;
		int age;
		boolean gender;

		try {
			Object[] objArr = mf.parse(s);
			name = (String) objArr[0];
			age = Integer.parseInt((String) objArr[1]);
			gender =  ((String) objArr[2]).equals("남자") ? true:false;

			System.out.println( name ); 
			System.out.println( age ); 
			System.out.println( gender ); 

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	} // main

}
