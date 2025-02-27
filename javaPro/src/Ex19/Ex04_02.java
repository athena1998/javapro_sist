package Ex19;

/**
 * @author junginn
 * @date : 2025. 2. 27. - 오전 10:25:54
 * @subject 문자열 다루는 클래스
 * 			1. String
 * 			2. StringBuffer 
 * 			3. StringBuilder
 * 			4. StringTokenizer
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {

		String s = "public static void main(String[] args)";
		// 1. 문자열 길이 반환
		// System.out.println(s.length());

		// 2. 문자열에서 특정 위치의 문자 반환
		// System.out.println(s.charAt(5));
		//	for (int i = 0; i < s.length(); i++) {
		//		System.out.println(s.charAt(i));
		//	}
		
		// 3. 문자열 대문자/소문자
		// 그러나 문자열이 대문자로 아예 변경되는게 아니라 이 메소드에서만 변형됨
		// 문자열은 절대 변하지 않는다
		// System.out.println(s.toLowerCase());
		// System.out.println(s.toUpperCase());
		
		// 4. String -> char[]
		// 5. char[] -> String
		// char[] chArr = s.toCharArray();
		// String s2 = chArr.toString();
		// String s3 = String.valueOf(chArr);
		
		// s라고 하는 문자열 속에 main이라고 하는 문자열을 찾아서 대문자 MAIN으로 변경하는 코딩
		String search = "main";
		
		// [1]
		String[] arr = s.split(search);
		System.out.println(String.join(search.toUpperCase(), arr));

		// [2]
		s = s.replace(search,search.toUpperCase());
		System.out.println(s);
		
		System.out.println(s.indexOf("ic"));
		System.out.println(s.lastIndexOf("ic"));
		
		// 문자열 연결
		// String s2 = "aaa"+"bbb"+"ccc";
		// String s3 = "aaa".concat("bbb").concat("ccc");
		
		// 문자 반대로 뒤집기
//		String s2 = reverse(s);
//		System.out.printf(s2);
		
		
		String str = "Hello, 안녕하세요! 123";
		
		System.out.println(str.replaceAll("[ㄱ-ㅎㅏ-ㅣ가-힣]", ""));
		
	} // main

	
	private static String reverse(String s) {
		String result = " ";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} // for i
		return result;
	}

}
