package days28;

import java.util.function.Function;

public class Ex01 {
	public static void main(String[] args) {
		
		// 16진수 형태의 문자열을 입력받아서 int 변환
		Function<String, Integer> f = s-> Integer.parseInt(s, 10);

		// int 입력받아서 2진수 문자열로 반환
		Function<Integer, String> g = s-> Integer.toBinaryString(s);
		
//		Function<String, String> h = f.andThen(2);
		
		
	} // main

}
