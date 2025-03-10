package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

public class Ex01_03 {
	public static void main(String[] args) {

		String fileName = ".\\src\\days24\\Ex02.java"; // 원본파일
		String copyFileName = ".\\src\\days25\\CopyEx01.java"; // 복사본

		fileCopy_textStream(fileName, copyFileName);



	} // main

	private static void fileCopy_textStream(String source, String target) {

		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		
		try(FileReader reader = new FileReader(source);
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
				FileWriter writer = new FileWriter(target);
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE)) { // BufferedWriter 보조스트림

//			String code;
//			while ((code = br.readLine()) != null) {
//				writer.write(code);
//				writer.write("\r\n");
//			} // while
			
			// 버퍼 크기 만큼 읽기 = 1024
			// 읽어온 값 저장
			char [] cbuf = new char[BUFFER_SIZE];
			
			// 실제 읽어온 문자 수
			int n = -1;
			
			while ((n = br.read(cbuf)) != -1  ) {
				bw.write(cbuf, 0, n);
			} // while
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		// 처리시간 : 642800
		System.out.println("처리시간 : " + (end-start));
		
	}

}
