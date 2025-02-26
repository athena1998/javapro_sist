package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 3:32:02
 * @subject  자동 자원 반환 try - with - resource
 * 			 한줄씩 처리
 * @content
 */
public class Ex09_03 {
	public static void main(String[] args) {
		
		// System.getProperty("user.dir") + 
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\17일차복습_이정인.txt";
		String line = null;
		int lineNumber = 1;
		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader); ) {
			
			while ((line = br.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
		
		System.out.println("end");
		
	} // main

}
