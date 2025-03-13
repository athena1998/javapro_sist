package days28;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		
		/*
		 * [스트림] Stream
		 * 1. 자바의 입출력을 주관
		 * 2. 스트림
		 * 		많은 데이터 -> 배열, 컬렉션 사용 -> 처리 
		 * 
		 * 표준화 X (중복인 처리 방법)
		 */
		
		String[] strArr = {"aaa", "bbb", "ccc"};
		
		
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		//iterator 반복자로 처리 x
		
		// 배열 -> 스트림
		Arrays.stream(strArr);
		// 컬렉션 -> 스트림 변환
		Stream<String> s1 = strList.stream();
		s1.sorted().forEach(System.out::print);
	} // main

}
