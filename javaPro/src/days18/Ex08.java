package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 2:49:02
 * @subject  throws - 예외처리 두번째 방법
 * 			 throw -  예외를 강제적으로 발생시키는 방법
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		// 국어점수를 입력받아서 수우미양가 출력
		int kor = 0;
		
		try {
			kor = getScore();
			System.out.println(kor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // main

	private static int getScore() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력 : ");
		String input = sc.next();
		int score ;
		
		// 0~100 유효성 검사
		String regex = "^(100|[1-9]?[0-9])$";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// Checked 예외
			 throw new IOException("점수의 범위는 0부터 100까지 입니다.");
			// Unchecked 예외 
			//throw new ArithmeticException("점수의 범위는 0부터 100까지 입니다.");
		}
		
		return score;
	}
}
