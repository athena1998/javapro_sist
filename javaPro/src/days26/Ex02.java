package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		File parent = new File(path);
		
		String word = "로또";
		
		quickSearch(parent, word);
		

		
	} // main

	private static void quickSearch(File parent, String word) {
		File[] lists = parent.listFiles();
		File f = null;
		String str = null;
		int index = 1;
		
		for (File file : lists) {
			f = file;
			
			if (f.isDirectory()) {
				quickSearch(f, word);
			} else {
				if (f.isFile()) {
					try(FileReader reader = new FileReader(file);
							BufferedReader br = new BufferedReader(reader)) {
						
						while ((str = br.readLine()) != null ) {
							if(str.contains(word)) {
								System.out.printf("파일 명 : %s, 라인번호 : %d\n", f, index++);
								System.out.println(str.trim());
								System.out.println();
							}

						} // while

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} // if
			}
			
		}
		
	}

}
