package days25;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오전 11:07:05
 * @subject String - StringReader (read)  / StringWriter (write)
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import java.io.BufferedReader;\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.FileWriter;\r\n"
				+ "import java.util.Arrays;\r\n"
				+ "import java.util.Date;\r\n"
				+ "\r\n"
				+ "public class Ex01_02 {\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "\r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex02.java\"; // 원본파일\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\"; // 복사본\r\n"
				+ "\r\n"
				+ "		fileCopy_textStream(fileName, copyFileName);\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_textStream(String source, String target) {\r\n"
				+ "";
		
		
		// source 문자열에서 10번째 라인의 문자열을 찾아서 출력
		
//		[1]
		String[] sArr = source.split("\r\n");
		System.out.println(sArr[10]);
		
//		[2]
		// String 메모리 스트림
		// 문자열 -> 문자 스트림 -> BufferedReader
		try(StringReader reader = new StringReader(source);
				BufferedReader br = new BufferedReader(reader);) {
			
			int n = 0;
			String line10 = ""; 
			
			while (n++ <= 10) {
				line10 = br.readLine();
			} // while
			System.out.println(line10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
