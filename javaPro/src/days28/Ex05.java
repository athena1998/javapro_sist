package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		
		// 빈 스트림
		Stream<Object> s = Stream.empty();
		System.out.println(s.count());
		// Stream.count();
		
		// 두 스트림 연결 concat()
		String[] s1 = {"2", "1","3"};
		String[] s2 = {"g", "d", "w"};
		
		// String[] -> Stream 반환
		Stream<String> ss1 = Stream.of(s1);
		Stream<String> ss2 = Stream.of(s2);
		
		Stream<String>ss3 = Stream.concat(ss1, ss2);
		
		
	} // main

}
