package days11;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 1. 한 반에 10명인 학생의 성적 관리
         ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
         1. 이름, 국,영,수 입력
         2. 총,평, 등 계산 처리
         3. 모든 학생 정보를 출력..
	    조건) 등수 처리하는 메서드를 만드세요. 
	    조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
	    조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.

		 */
	} // main


	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203

		// 5 ~ 13
		// 0 ~ 8                -5
		// 5 <=  (int)(Math.random()*9)+5 <= 13


		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');

		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}
}
