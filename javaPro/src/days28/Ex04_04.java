package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex04_04 {
	public static void main(String[] args) {
		
		// 파일 스트림
		String url = ".\\src\\days28\\Ex02.java";
		String url2 = ".\\src\\days28\\Ex03.java";
		
		try {
			Path path = Path.of(url);
			Stream<String> lines = Files.lines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // main

}
