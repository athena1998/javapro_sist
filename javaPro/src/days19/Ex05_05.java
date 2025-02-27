package Ex19;

import java.util.StringJoiner;

public class Ex05_05 {
	public static void main(String[] args) {
		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String[] names = team1.split("\\s*,\\s*");
		
		StringJoiner sj = new StringJoiner("</li>\n\t<li>"
				, "<ol>\n\t<li>"
				,"</li>\n</ol>");
		
		for (int i = 0; i < names.length; i++) {
			sj.add(names[i]);
		}
		
		System.out.println(sj.toString());
		
//		String content = "<ol>\n\t<li>";
//		content += String.join("</li>\n\t<li>", names);
//		content += "</li>\n</ol>";
//		System.out.println(content);
		
		
	} // main

}
