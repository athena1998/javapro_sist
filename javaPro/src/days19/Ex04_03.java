package days19;

public class Ex04_03 {
	
	public static void main(String[] args) {
		String s = "public static void main(String[] args)";
		
		// 문자 반대로 뒤집기
		// String s2 = reverse(s);
		// System.out.println(s2);
		
		String url = "https://ocwokocw.tistory.com/195";
		String prefix = "https://www.google.com/";
		System.out.println(url.startsWith(prefix));
		
		String fileName = "Sample.java";
		String suffix = ".java";
		System.out.println(fileName.endsWith(suffix));
		
		String[] urls = {
				"https://www.google.com/"
				, "www.google.com/"
				, "ftps://www.google.com/"
				, "https://www.google.com/"
		};
		
		String regex = "https://.*";
		for (String str : urls) {
			if (str.matches(regex)) {
				System.out.println(str);
			} // if
		}
		
		
	} // main


	private static String reverse(String s) {
		String result = " ";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} // for i
		return result;
	}

}
