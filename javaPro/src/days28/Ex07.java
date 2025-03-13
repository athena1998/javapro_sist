package days28;

import java.io.File;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {

		// map() 스트림 변환
		// 스트림의 요소에서 저장된 값 중에서 원하는 필드를 뽑아내거나
		// 특정 형태로 변환해야 할 때 사용하는 메서드

		Stream<File> sf = Stream.of(new File("Ex01"),
				new File("Ex01.bak"),
				new File("Ex02.java"),
				new File("Ex01.txt"));

		Stream<String> fnameSt =   sf.map(File::getName)
				.filter(s->s.indexOf('.') != -1)
				.peek( s -> System.out.printf("filename=%s\n", s ))
				.map(s->s.substring(s.indexOf('.')+1)) // 확장자만
				.peek( s -> System.out.printf("extension=%s\n", s ))
				.map(String::toUpperCase)  // 대문자 변환
				.distinct();
		;
		fnameSt.forEach(System.out::println);
		
		// peek() 
		

	} // main

}
