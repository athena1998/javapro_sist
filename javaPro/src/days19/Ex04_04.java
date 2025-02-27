package days19;

import java.io.File;

public class Ex04_04 {
	public static void main(String[] args) {
		
		String path = "C:\\Class\\JavaClass\\javaPro\\src\\Ex19\\Ex02.java";
		
		String fileName; // Sample.java 확장자 포함
		String ext; // 확장자명
		String baseFileName; // 파일명
		
		fileName = path.substring(path.lastIndexOf("\\")+1);
		
		File file = new File(path);
		fileName = file.getName();
		
		String[] split = fileName.split("\\.");
		ext = "." +split[1];
		baseFileName = split[0];

		System.out.println(fileName);
		System.out.println(ext);
		System.out.println(baseFileName);
		
		
	} // main

}
