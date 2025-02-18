package days12;

/**
 * @author junginn
 * @date : 2025. 2. 18. - 오전 11:15:37
 * @subject 버블/선택/삽입 정렬
 * @content
 */

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] arr = {3,5,1,4,2};
		
//		bubbleSort(arr);
		
		System.out.println("-".repeat(30));
		
//		selectionSort(arr);
		
		System.out.println("-".repeat(30));
		
//		selectionSort2(arr);
		
		System.out.println("-".repeat(30));
		
		insertSort(arr);
		
		Arrays.sort(arr);
		
	} // main

	private static void insertSort(int[] arr) {
		
		int index = 0;
		for (int i = 1, j; i < arr.length; i++) {
			System.out.printf("%d - ", i);
			index = arr[i];
			for (j = i-1; j >= 0; j--) {
				System.out.printf("(%d,%d) ", i, j);
				if (arr[j] <= index) {
					break;
				} // if
				arr[j+1] = arr[j];
			} // for j
			arr[++j] = index;
			System.out.println(Arrays.toString(arr));
		} // for i
		
		
	}

	private static void selectionSort2(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				System.out.printf("(%d,%d) ", i, j);
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
				System.out.println(Arrays.toString(arr));
			} // for j
			if (i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			} // if
			System.out.println();
		}
		
	}

	private static void selectionSort(int[] arr) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j <= 4; j++) {
				System.out.printf("(%d,%d) ", i, j);
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // if
				System.out.println(Arrays.toString(arr));
			} // for j
			System.out.println();
		} // for i
		
	}

	private static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.printf("(%d,%d) ", j, j+1);
				if (arr[j] > arr[j+1]) {
					System.out.print(" *** ");
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} // if
				System.out.println(Arrays.toString(arr));
			} // for j
			System.out.println();
		} // for i
		
		
		
	}

}
