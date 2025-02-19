package days13;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// 30개 최대 19 최소 0
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력 : ");
		int search = sc.nextInt();
		
		int index = sequenceSearch(m, search);
		
		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있습니다", search, index);
		} else {
			System.out.println("찾는 정수가 없습니다");
		}
		
	} // main

	private static int sequenceSearch(int[] m, int search) {
		int index = -1;
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] == search) {
				index = m[i];
				break;
			} // if
		} // for i
		
		return index;
	}

}
