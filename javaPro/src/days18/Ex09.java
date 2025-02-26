package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 3:32:02
 * @subject  자동 자원 반환 try - with - resource
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		
		// days17 17일차복습_이정인 파일 읽어오기
		// FileReader 파일 읽기
		// FileWriter 파일 쓰기
		// System.getProperty("user.dir") + 
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\17일차복습_이정인.txt";
		FileReader reader = null;
		int one;
		try {
			reader = new FileReader(fileName);
//			one = reader.read();
//			System.out.println(one);
			
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char) one);
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println(e.toString());
			
		} finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
		
	} // main

}

