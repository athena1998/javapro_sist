package days19;

import java.util.Arrays;

public class Ex04_05 {
	public static void main(String[] args) {
		
		String team1 = "권용범,   김대원   , 김민곤  ,   김하은,  박세훈";   
		String regex = "\\s*,\\s*";
//		String[] split = team1.split(regex, 3); // 최대 3개
		String[] split = team1.split(regex); // 최대 3개
		System.out.println(Arrays.toString(split));
		
		String content = "<ol>\n\t<li>";
		content += String.join("</li>\n\t<li>", split);
		content += "</li>\n</ol>";
		System.out.println(content);
		
	} // main

}
