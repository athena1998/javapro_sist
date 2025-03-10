package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		
		// 키보드로부터 한 문자 입력
		// System.in.read();
		
		// 표준입력장치(키보드) -> 입력스트림
//		InputStream is = System.in;
//		
//		System.out.print("한 문자 입력 : " );
//		try {
//			int b = is.read();
//			System.out.printf("%1$d-%1$c\n", b);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		System.out.print("이름을 입력 : ");
//		String name;
//		// Scanner 사용
//		// inputStream System.in : 바이트 스트림
//		
//		// 키보드 -> System.in 표준 바이트스트림
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		name = br.readLine();
//		System.out.println(name);
		
		
		InputStream is = System.in;
		
		System.out.print("한 문자 입력 : " );
//		int i = is.read();
//		System.out.printf("%1$d-%1$c\n", i);
		
		/*
		 * 	한 문자 입력 : 가
			234-ê
			한 문자 입력 : 각
			234-ê
		 */
		
		byte[] b = new byte[3];
		int n = is.read(b); // 배열에 저장된 개수

		for (byte c : b) {
			System.out.println(c);
		}
		
		char one = new String(b).charAt(0);
		System.out.println(one);
		
	} // main

}
