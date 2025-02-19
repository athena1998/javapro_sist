package days13;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		
		int[] m = {1,2,3,4,5,6,7,8};
		
		// 1차원->2차원
		int[][] n = new int[2][5];
		
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				if(i>0) {
//					n[i][j] = m[j+4];
//				}else {
//					n[i][j] = m[j];
//				}
//			} // for j
//		} // for i
		
		int comLength = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/comLength][i%comLength] = m[i];
		} // for i
		

		for (int[] arr : n) {
			System.out.println(Arrays.toString(arr));
		}
		
		int[] n2 = new int[n.length*n[0].length];
		int comLength2 = n[0].length;;
		
		for (int i = 0; i < n2.length; i++) {
			n2[i] = n[i/comLength2][i%comLength2];
		} // for i
		
		System.out.println(Arrays.toString(n2));
		
	} // main

}
