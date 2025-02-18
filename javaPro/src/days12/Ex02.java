package days12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {


		int[] n = {3,5,2,4,1};

		// 1. 배열 맨 뒤에 6추가
		n = Arrays.copyOf(n, n.length+1);

		System.out.println(Arrays.toString(n));

		// 2. 2 뒤에 100 삽입
		int index = -1;
		for(int i=0; i<n.length-1; i++) {
			if (n[i] == 2) {
				index = i;
			} // if
		}

		System.out.printf("index : %d\n", index);

		List<Integer> list = List.of(3,5,2,4,1);
		int index1 = list.indexOf(2);

		System.out.printf("index : %d\n", index1);

		int index2 = Arrays.stream(n)
				.boxed() // 기본형 int[] -> 래퍼클래스 Integer[] 로 변환
				.collect(Collectors.toList())
				.indexOf(2);

		System.out.printf("index : %d\n", index2);

		//		for (int i = n.length-2; i >= index; i--) {
		//			n[i+1] = n[i];
		//		} // for i
		//		
		//		n[index] = 100;
		//		
		//		System.out.println(Arrays.toString(n));

		int[] temp = new int[n.length+1];
		System.arraycopy(n, 0, temp, 0, index);
		System.arraycopy(n, index, temp, index+1, n.length-index);
		System.out.println(Arrays.toString(n));
		n = temp;
		n[index] = 100;


		// [문제]  다시 100 삭제
		// [3, 5, 2, 4, 1, 6]
		index = 2 ;  // 위치가 2인 100정수를 삭제 
		temp = new int[n.length-1];
		System.arraycopy(n, 0, temp, 0, index);
		System.arraycopy(n, index+1, temp, index, n.length-1- index);
		// System.arraycopy(m, index+1, temp, index, temp.length - index);
		n = temp;
		System.out.println( Arrays.toString(n) );



	} // main

}
