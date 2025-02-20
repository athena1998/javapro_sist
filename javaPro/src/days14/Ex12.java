package days14;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오후 5:07:14
 * @subject 
 * @content  한 반에 30명 학생의 성적 관리
 *            ( 이름, 국어, 영어, 수학, 총점 , 평균, 등수 )
 *           1. 입력 정보 - 이름, 국어, 영어, 수학
 *           2. 총점, 평균, 등수 계산 처리
 *           3. 모든 학생 정보 출력...... 
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		Student[] studentsArr = new Student[STUDENT_COUNT];
		
		int cnt = 0; // 입력받은 학생 수
		char con = 'y';

		Scanner scanner = new Scanner(System.in);
		
		do {
			// 한 학생의 정보를 입력
			System.out.printf("[%d번] 학생 이름,국어,영어,수학 입력 ? ", cnt+1);
			name = getName(); // scanner.next();
			kor = getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			// Student 객체 생성
			Student stu = new Student();
			
			// 객체의 필드값에 각각의 데이터 입력
			stu.no = cnt+1;
			stu.name = name;
			stu.kor = kor;
			stu.eng = eng;
			stu.mat = mat;
			stu.tot = tot;
			stu.avg = avg;
			stu.rank = rank;
			
			
			// studentsArr 에 stu에 입력한 정보 입력
			studentsArr[cnt] = stu;
			
			// 입력받은 학생수 1증가
			cnt++;
			
			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10
		} while ( Character.toUpperCase(con) == 'Y' );
		
		// 등수처리.
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (studentsArr[i].tot < studentsArr[j].tot ) {
					studentsArr[i].rank++;
				} // if
			} // for j
		} // for i
		
		// 학생정보출력.
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.print(studentsArr[i].getInfo());
		} // for i
		
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

} // class








