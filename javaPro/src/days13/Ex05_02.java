package days13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05_02 {
	public static void main(String[] args) {
		
		// 30개 최대 19 최소 0
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력 : ");
		int search = sc.nextInt();
		
		int[] index = sequenceSearch(m, search);
		
		if (index.length > 0 ) {

			for (int i : index) {
				System.out.printf("찾는 정수 %d는 %d 위치에 있습니다\n", search, i+1);
			}
		} else {
			System.out.println("찾는 정수가 없습니다");
		}
		
	} // main

	private static int[] sequenceSearch(int[] m, int search) {
		
		int count = 0;
		
		// 찾고자하는 숫자 개수 파악
		for (int i = 0; i < m.length; i++) {
			if (search == m[i]) {
				count++;
			} // if
		} // for j
		
		
		// 개수로 배열 생성
		int[] arr = new int[count];
		
		// 개수가 0이면 그대로 배열 반환
		if (count < 1) {
			return arr;
		} // if
		
		
		// 배열에 숫자 위치 넣음
		int index = 0;
		for (int j = 0; j < m.length; j++) {
			if (search == m[j]) {
				arr[index++] = j;
			} // if
		} // for j
		
		return arr;
	}

}
