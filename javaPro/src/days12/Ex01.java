package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {

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
		
		// 문제 
		// 3반 30명의 학생 이름 국어 영어 수학 입력받아서 해당 학생 총점 평균 등수 정보 출력

		String name;
		int kor,mat,eng, tot, rank;
		double avg;

		final int STUDENT_COUNT = 10;

		String[] names = new String[STUDENT_COUNT];
		
		int[] kors = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];

		int cnt = 0; // 정보를 입력받은 학생 수
		char con = 'y';

		Scanner sc = new Scanner(System.in);

		do {
			int len = names.length;
			
			if (names.length == cnt) {
				String[] namesTemp = Arrays.copyOf(names, len+3);
				int[] korsTemp = Arrays.copyOf(kors, len+3);
				int[] matsTemp = Arrays.copyOf(mats, len+3);
				int[] engsTemp = Arrays.copyOf(engs, len+3);
				int[] totsTemp = Arrays.copyOf(tots, len+3);
				int[] ranksTemp = Arrays.copyOf(ranks, len+3);
				double[] avgsTemp = Arrays.copyOf(avgs, len+3);
			}
			
			// 한 학생의 정보를 입력
			System.out.printf("[%d] 학생 이름,국어,영어,수학 입력 : \n", cnt+1);
			name = getName();
			kor = getScore();
			mat = getScore();
			eng = getScore();

			tot = kor+mat+eng;
			avg = (double) tot/3;
			rank = 1;

			System.out.printf("[%d] 이름 : %s, 국어 : %d, 영어 : %d, 수학 :%d, 총점 : %d, 평균 : %f\n", 
					cnt+1, name, kor, mat, eng, tot, avg);

			// 각 배열의 요소로 추가하는 배열
			names[cnt] = name;
			kors[cnt] = kor;
			mats[cnt] = mat;
			engs[cnt] = eng;
			tots[cnt] = tot;
			avgs[cnt] = avg;

			// 입력받은 학생 수
			cnt++;

			// 입력여부진행 체크
			System.out.println();
			System.out.print("학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');

		// 등수 처리
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (tots[i] <tots[j]) {
					ranks[i]++;
				} else {

				}
			} // for j
		} // for i


		// 학생 정보 출력
		System.out.printf("입력받은 학생 수는 %d명 입니다\n", cnt);

		for (int i = 0; i < names.length; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					, i+1
					, names[i], kors[i], engs[i], mats[i], 
					tots[i], avgs[i], ranks[i]+1);
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
		return  (int)( Math.random()*101)+1;
	}
}


