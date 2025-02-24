package days16;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 

		String n = "keNik";   
		String m= "kKnie";    

		char[] splitN = n.toLowerCase().toCharArray();
		char[] splitM = m.toLowerCase().toCharArray();

		Arrays.sort(splitN);
		Arrays.sort(splitM);

		//		boolean isEqual = true;
		//		for (int i = 0; i < splitM.length; i++) {
		//			if (splitN[i] != splitM[i]) {
		//				isEqual = false;
		//			} // if
		//		} // for i
		//
		//		if (isEqual) {
		//			System.out.println("두개의 문자열이 같습니다.");
		//		} else {
		//			System.out.println("두개의 문자열이 다릅니다.");			
		//		}

		// [2]
		System.out.println(String.valueOf(splitN).equals(String.valueOf(splitM)));
		
		

	} // main

}
