package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		
	      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
	      // 갯수를 파악해서 #으로 막대그래프를 그리기.
	      // A(20) : ####################
	      // B(11) : ###########
	      // :
	      // Z(3)  : ###

		String fileName = ".\\src\\days18\\Ex10.java";

		int code = -1;
		int[] countArr = new int[26];
		try(FileReader reader = new FileReader(fileName);) {
			while ((code = reader.read()) != -1) {
				code = Character.toUpperCase(code);
				
				// code가 대문자로 변경할 수 없는 문자일 경우 (예: 숫자, 특수문자([ ],{ }) 등) index 계산이 잘못될 수 있다.
				if (Character.isUpperCase(code)) {
					int index = code - 'A';
					countArr[index]++;
					// countArr[index] = countArr[index] +1;
				} // if
			} // while
			
			for (int i = 0; i < countArr.length; i++) {
				int count = countArr[i];
				System.out.printf("%c(%d)\t: %s\n" , i+'A', count, "#".repeat(count));
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	} // main

}
