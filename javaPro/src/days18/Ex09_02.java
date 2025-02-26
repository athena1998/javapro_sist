package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 3:32:02
 * @subject  자동 자원 반환 try - with - resource
 * 			 한 문자씩 처리
 * @content
 */
public class Ex09_02 {
	public static void main(String[] args) {
		
		// System.getProperty("user.dir") + 
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\17일차복습_이정인.txt";
		int one;
		int lineNumber = 1;
		try (FileReader reader = new FileReader(fileName)) {
			System.out.printf("%d : ", lineNumber++);
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char) one);
				
				if (one == 10) {
					System.out.printf("%d : ", lineNumber++);
				} // if
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
		
		System.out.println("end");
		
	} // main

}
