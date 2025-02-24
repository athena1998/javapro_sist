package days16;

import java.util.Arrays;
import java.util.Collections;

public class Ex02 {
	public static void main(String[] args) {

		String n = "keNik";   
		String m = "kKnie";    

//		char [] nArr = n.toCharArray();
//		Arrays.sort(nArr);
//		for (int i = 0; i < nArr.length / 2; i++) {
//			char temp = nArr[i];
//			nArr[i] = nArr[nArr.length - 1 - i];
//			nArr[nArr.length - 1 - i] = temp;
//		}
//		
//		System.out.println(Arrays.toString(nArr));
		
		String[] nArr = n.split("");
		Arrays.sort(nArr, Collections.reverseOrder());
		n = String.join("", nArr);
		
		System.out.println(n);
		
		
		


	} // main

}
