package days13;

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
		int kor,mat,eng, tot, rank, wRank;
		double avg;

		final int CLASS = 3;
		final int STUDENT_COUNT = 30;


		String[][] names = new String[3][STUDENT_COUNT];

		int[][] kors = new int[CLASS][STUDENT_COUNT];
		int[][] mats = new int[CLASS][STUDENT_COUNT];
		int[][] engs = new int[CLASS][STUDENT_COUNT];
		int[][] tots = new int[CLASS][STUDENT_COUNT];
		int[][] ranks = new int[CLASS][STUDENT_COUNT];
		int[][] wRanks = new int[CLASS][STUDENT_COUNT];
		double[][] avgs = new double[CLASS][STUDENT_COUNT];

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
			names[ban-1][cnts[ban-1]] = name;
			kors[ban-1][cnts[ban-1]] = kor;
			mats[ban-1][cnts[ban-1]] = mat;
			engs[ban-1][cnts[ban-1]] = eng;
			tots[ban-1][cnts[ban-1]] = tot;
			avgs[ban-1][cnts[ban-1]] = avg;
			ranks[ban-1][cnts[ban-1]] = rank;
			wRanks[ban-1][cnts[ban-1]] = wRank;

			// 입력받은 학생 수
			cnts[ban-1]++;

			// 입력여부진행 체크
			System.out.println();
			System.out.print("학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');

		// 등수 처리
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				wRanks[i][j]=ranks[i][j] = 1;            
	            //  tots[i][j] 등수처리할 학생의 총점
	            //  ranks[i][j] 등수처리할 학생의 반등수
	            //  wranks[i][j] 등수처리할 학생의 전교등
				for (int k = 0; k < cnts.length; k++) {
					for (int z = 0; z < cnts[k]; z++) {

					//  tots[k][z] 비교할 학생의 총점
						if(tots[i][j]<tots[k][z]) {
							wRanks[i][j]++;
							if (i == k) {
								ranks[i][j]++;
							} // if

						}
					}
				} 
			} 
		}


		// 학생 정보 출력

		int totalCnt = cnts[0]+cnts[1]+cnts[2];
		System.out.printf("전체 학생 수 : %d\n", totalCnt);

		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("%d반의 입력받은 학생 수는 %d명 입니다\n", i+1, cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("\t[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						, j+1
						, names[i][j], kors[i][j], engs[i][j], mats[i][j], 
						tots[i][j], avgs[i][j], ranks[i][j], wRanks[i][j]);
			} // for j
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


