package days13;

import java.util.Scanner;

public class Ex05_04 {

	public static void main(String[] args) {

		// 30개 최대 19 최소 0
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력 : ");
		int search = sc.nextInt();

		int fromIndex = 0 ;
		int index = -1;
		while (  ( index = sequenceSearch(m, search, fromIndex) ) != -1     ) {
			System.out.println(index);
			fromIndex = index + 1;
		} // while

	} // main

	private static int sequenceSearch(int[] m, int search, int fromIndex) {
		int index = -1; 
		for (int i = fromIndex; i < m.length; i++) {
			if( m[i] == search ) {
				return i;         
			}
		} // for i      
		return  index;
	} 


}
