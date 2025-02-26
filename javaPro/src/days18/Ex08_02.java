package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 2:49:02
 * @subject  throws - 예외처리 두번째 방법
 * 			 throw -  예외를 강제적으로 발생시키는 방법
 * 			 사용자 정의 예외 객체
 * @content
 */
public class Ex08_02 {
	public static void main(String[] args) {

		// 국어점수를 입력받아서 수우미양가 출력
		int kor = 0;

		try {
			kor = getScore();
			System.out.println("kor : " + kor);
		} catch (ScoreOutofBoundException e) {
			System.out.println(e.getERROR_CODE() + "\n" + e.getMessage());
			e.printStackTrace();
		}

	} // main

	private static int getScore() throws ScoreOutofBoundException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력 : ");
		String input = sc.next();
		int score ;

		// 0~100 유효성 검사
		String regex = "^(100|[1-9]?[0-9])$";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			throw new ScoreOutofBoundException("점수의 범위는 0부터 100까지 입니다.");
			// Checked 예외
			// throw new IOException("점수의 범위는 0부터 100까지 입니다.");
			// Unchecked 예외 
			//throw new ArithmeticException("점수의 범위는 0부터 100까지 입니다.");
		}

		return score;
	}
}

// checked 예외
class ScoreOutofBoundException extends Exception{ 

	private static final long serialVersionUID = -1361386386864749666L;

	// 예외 코드 번호
	private final int ERROR_CODE;

	// getter 
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutofBoundException(int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code; 
	}

	public ScoreOutofBoundException(String message) {
		this(1001, message);
	}
}














