package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex09_04 {
	public static void main(String[] args) {
		
		 String dir = System.getProperty("user.dir");
		
		// . : 상대경로
		// .. : 상위 디렉토리
		String fileName = dir + "\\src\\days17\\Car.java";
//		String fileName = ".\\.classpath";
//		String fileName = ".classpath"; // 현재 디렉토리 C:\Class\JavaClass\javaPro
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
