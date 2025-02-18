package days12;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {

		int[] arr = {3,5,1,4,2};

		bubbleSort(arr);

	} // main


	private static void bubbleSort(int[] m) {
		int key; // 삽입할 값
	      for (int i = 1, j; i < m.length; i++) {
	         System.out.printf("%d - ", i);
	         key = m[i];
	         for (j = i-1; j >= 0 ; j--) {
	            if(m[j] <= key) {
	            	break;
	            }
	            m[j+1] = m[j];
	         } // for j
	         m[++j] = key;
	         System.out.println(Arrays.toString(m));
	      } // for i

	}

}
