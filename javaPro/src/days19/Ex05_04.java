package days19;

import java.util.StringTokenizer;

public class Ex05_04 {
	public static void main(String[] args) {
		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		
		// [1]
		// String[] split = team1.split("\\s*, \\s*");
		
		// [2]
		StringTokenizer st = new StringTokenizer(team1, ",");
		st.hasMoreTokens();
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		} // while
		
		
	} // main
}
