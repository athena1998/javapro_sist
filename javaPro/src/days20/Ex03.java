package days20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days19\\학생명단.txt";
		
		String[][] studentArr = new String[3][6];
		
		try(FileReader reader = new FileReader(fileName);) {
			int one;
			StringBuilder sb = new StringBuilder();
			while ((one = reader.read()) != -1) {
				if (one != 10) {
					sb.append((char) one);	
				} // if
			} // while
			
			String data = sb.toString();
			String[] split = data.split("\r");

			for (int i = 0; i < studentArr.length; i++) {
				for (int j = 0; j < studentArr[i].length; j++) {
					studentArr[i][j] = split[j+(6*i)];
				} // for j
			} // for i
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e1) {
			System.out.println(e1.toString());
		}
		
		String title = "<h1>(주)쌍용교육센터 E강의실 학생 명단</h1>";
		String content = "<h3>1조</h3>\n<ul>\n<ol>\n\t<li>";
		content += String.join("</li>\n\t<li>", studentArr[0]);
		content += "</li>\n</ol>\n</ul>";
		String content1 = "<h3>1조</h3>\n<ul>\n<ol>\n\t<li>";
		content1 += String.join("</li>\n\t<li>", studentArr[1]);
		content1 += "</li>\n</ol>\n</ul>";
		String content2 = "<h3>1조</h3>\n<ul>\n<ol>\n\t<li>";
		content2 += String.join("</li>\n\t<li>", studentArr[2]);
		content2 += "</li>\n</ol>\n</ul>";
		System.out.println(title);
		System.out.println(content);
		System.out.println(content1);
		System.out.println(content2);
		
	} // main

}
