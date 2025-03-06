package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8};
		
		// 교집합 : {4,5}
		// 합집합 : {1,2,3,4,5,6,7,8}
		
		
//		int[] sum = new int[a.length + b.length];
//		int i=0;
//		for (i = 0; i < a.length; i++) {
//			sum[i] = a[i];
//		}
//		
//		for (int j = 0; j < b.length; j++) {
//			System.out.println(Arrays.binarySearch(sum, b[j]));
//			if (Arrays.binarySearch(sum, b[j]) < 0) {
//				sum[i++] = b[j];
//			} // if
//		} // for i
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			list.add(b[i]);
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(list);
		hs.addAll(list2);
		
		for (int i = 0; i < b.length; i++) {
			
		} // for i
		
		System.out.println(hs);
		
		
	} // main

}
