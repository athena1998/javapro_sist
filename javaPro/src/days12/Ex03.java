package days12;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		} // for i
		
		System.out.println(Arrays.toString(arr));

		// 배열 요소 섞기
		shuffle(arr);
		
		System.out.println(Arrays.toString(arr));
		

	} // main

	private static void shuffle(int[] arr) {

		// 랜덤한 위치를 두개 발생
		// 해당 위치에 존재하는 값을 맞 바꾸기
		
		int idx1 = 0;
		int idx2 = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int[] random1 = new Random().ints(0,10).distinct().limit(2).toArray();

			idx1 = random1[0];
			idx2 = random1[1];

			temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
		}
		
//		  int idx1 = 0, idx2;
//	      Random rnd = new Random();
//	      for (int i = 0, temp1; i < 10; i++) { 
//	         idx2 = rnd.nextInt(arr.length-1)+1; // 1~9         
//	         System.out.printf("%d - %d \n", idx1, idx2);
//	         temp1 = arr[idx1];
//	         arr[idx1] = arr[idx2];
//	         arr[idx2] = temp1;
//	      } // for i
		

	}

}
