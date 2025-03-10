package com.util;

import java.io.File;

public class FileUtil {


	//  Ex01.java 파일명을 반환하는 메소드
	public static String getFileName( File f) {
		String fileName = f.getName();
		return fileName;
	}

	//  Ex01.java 파일명을 반환하는 메소드
	public static String getFileName( String pathname ) {
		int idx =  pathname.lastIndexOf("\\");
		String fileName = pathname.substring(idx+1);      
		return fileName;
	}

	//  Ex01.java 확장자를 반환 = .java
	public static String getExtension(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String ext = fileName.substring(idx);
		return ext;
	}

	//  Ex01.java 파일이름을 반환 =  Ex01
	public static String getBaseName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String baseName = fileName.substring(0, idx);
		return baseName;
	}
}
