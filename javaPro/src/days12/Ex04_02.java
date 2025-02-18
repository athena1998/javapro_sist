package days12;

import java.util.Arrays;

/**
 * @author junginn
 * @date : 2025. 2. 18. - 오후 2:05:00
 * @subject 병합 정렬
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		
		int[] arr = {1,3,6,12,14};
		int[] arr2 = {2,4,7};
		
		int[] arr3 = MergeSort(arr, arr2);
		
	} // main

	private static int[] MergeSort(int[] arr, int[] arr2) {
		int[] arr3 = new int[arr.length + arr2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < arr.length && j< arr2.length) {
			arr3[k++] = arr[i] > arr2[j] ? arr2[j++] : arr[i++];
		} // while
		
		if (i == arr.length) { // 남은 배열 n
	         System.arraycopy(arr2, j, arr3, k, arr2.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(arr, i, arr3, k, arr.length-i);
	      } // if

		
		System.out.println(Arrays.toString(arr3));

		return arr3;
	}

}
