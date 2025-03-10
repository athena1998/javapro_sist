package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class Ex01 {
	/*
	 * 스트림
	 * 1. 2가지 종목 : 문자, 바이트 스트림
	 * 2. 보조스트림
	 * 
	 * 믄자(텍스트) 스트림		-> 파일 복사
	 * FileReader / FileWriter
	 * 
	 * File 클래스 : 파일, 디렉터리(폴더)를 다루는 (생성삽입추가삭제) 클래스
	 * 
	 */
	public static void main(String[] args) {
//		String fileName = ".\\src\\days24\\Ex02.java";
//		File f = new File(fileName);
		
//		System.out.println(f.isDirectory());
//		System.out.println(f.isFile());
//		
//		System.out.println(f.length()); // 파일의 크기 (byte)
		
		String parent = ".\\src\\days24"; // 디렉토리
		String child = "Ex02.java"; // 파일명
		File f = new File(parent, child);
		
		 // 마지막에 수정된 날짜 - long
//		System.out.println(f.lastModified());
//		
//		Date d = new Date(f.lastModified());
//		System.out.println(d.toLocaleString());
		
		int code;
		
		try(FileReader reader = new FileReader(f)) {
			while ((code = reader.read()) != -1) {
				System.out.print((char) code);
			} // while
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main
	

}
