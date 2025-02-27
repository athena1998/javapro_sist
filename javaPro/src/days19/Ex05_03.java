package days19;

import java.util.Scanner;

public class Ex05_03 {
	public static void main(String[] args) {
		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
	      , solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	      */
	      
		// [1] 
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 입력 : ");
		int len = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<len; i++) {
			if (i%2 == 0) {
				sb.append("수");
			} else {
				sb.append("박");
			}
		}
		
		System.out.println(sb);
		*/
		
		// [2]
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 입력 : ");
		int len = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int share = len/2;
		for(int i=0; i<share; i++) {
			sb.append("수박");
		}
		if (share % 2 == 1) {
			sb.append("수");
		} // if
		
		System.out.println(sb);
		
		
	} // main

}
