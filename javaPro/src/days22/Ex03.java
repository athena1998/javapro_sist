package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오전 10:49:50
 * @subject days10\Ex05.java
 * 			days14\Ex11.java
 * @content
 */
public class Ex03 {
	public static void main(String[] args) throws IOException {

		String name;
		int kor,mat,eng, tot, rank, wRank;
		double avg;

		final int STUDENT_COUNT = 30;

		ArrayList<Object> list = new ArrayList<>(STUDENT_COUNT);


		//		int cnt1 = 0, cnt2 = 0, cnt3 = 0; // 정보를 입력받은 학생 수
		int[] cnts = new int[3];
		char con = 'y';

		Scanner sc = new Scanner(System.in);

		int ban;
		do {

			// 1. 입력하는 학생의 반 정보 입력
			System.out.print("1. 반 입력 : ");
			ban = sc.nextInt();

			// 한 학생의 정보를 입력
			System.out.printf("%d반의 [%d번] 학생 이름,국어,영어,수학 입력 : \n", ban, cnts[ban-1]+1);
			name = getName();
			kor = getScore();
			mat = getScore();
			eng = getScore();

			tot = kor+mat+eng;
			avg = (double) tot/3;
			rank = 1;
			wRank = 1;


			System.out.printf("%d반 [%d] 이름 : %s, 국어 : %d, 영어 : %d, 수학 :%d, 총점 : %d, 평균 : %f\n", 
					ban, cnts[ban-1]+1, name, kor, mat, eng, tot, avg);

			// 각 배열의 요소로 추가하는 배열

			ArrayList<Object> student = new ArrayList<>();

			student.add(name);
			student.add(kor);
			student.add(mat);
			student.add(eng);
			student.add(tot);
			student.add(avg);
			student.add(rank);
			student.add(wRank);

			list.add(student);

			// 입력받은 학생 수
			cnts[ban-1]++;

			// 입력여부진행 체크
			System.out.println();
			System.out.print("학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');


		// 학생정보출력.
		System.out.printf("> 입력받은 학생수 : %d명\n", list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("[%d]\t%s\n", i+1, list.get(i));
		} // for i

	}
	// main

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
		return  (int)( Math.random()*101)+1;
	}

}
