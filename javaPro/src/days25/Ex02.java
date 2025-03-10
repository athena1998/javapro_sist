package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오전 10:26:56
 * @subject	바이트 스트림 사용- 파일(.exe) 복사
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		
		String fileName = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFileName = ".\\copyBandizip.exe";
		
		fileCopy_byteStream(fileName, copyFileName);
		
		
	} // main

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();
		int code;
		
		try(FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target)) {

			
			// 실제 읽어온 문자 수
			
			while ((code = fis.read()) != -1  ) {
				fos.write(code);
			} // while
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		// 처리시간 : 642800
		System.out.println("처리시간 : " + (end-start));
	}
}
