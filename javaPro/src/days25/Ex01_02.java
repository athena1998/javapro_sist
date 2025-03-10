package days25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

public class Ex01_02 {
	public static void main(String[] args) {

		String fileName = ".\\src\\days24\\Ex02.java"; // 원본파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 복사본

		fileCopy_textStream(fileName, copyFileName);



	} // main

	private static void fileCopy_textStream(String source, String target) {

		long start = System.nanoTime();
		
		String code;
		
		File original = new File(source);
		String fileName = original.getName().split("\\.")[0];
		
		File copy = new File(target);
		String newFileName = copy.getName().split("\\.")[0];
		
		try(FileReader reader = new FileReader(source);
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(target)) {
			while ((code = br.readLine()) != null) {
				if (code.contains(fileName)) {
					code = code.replace(fileName, newFileName);
				} // if
				writer.write(code);
				writer.write("\r\n");
			} // while
			
			// BufferedWriter는 기본적으로 버퍼가 다 찰 경우 내용을 출력하게 되는데 
			// 이때 flush()를 사용하지 않으면 출력하지 않은 내용이 있어도 출력스트림을 닫아버린다
			// 버퍼에만 데이터가 있고 파일에 쓰여지지 않는 오류를 방지
			writer.flush();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		// 처리시간 : 1131600
		System.out.println("처리시간 : " + (end-start));
		
	}

}
