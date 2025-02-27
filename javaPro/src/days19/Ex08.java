package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author junginn
 * @date : 2025. 2. 27. - 오후 4:27:43
 * @subject java.util.package
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		int[] arr = {3,5,1,4,2};
		
		// int[] -> Integer[]
		IntStream is = Arrays.stream(arr);
		Integer[] n = is.boxed().toArray(Integer[]::new);
//		Arrays.sort(n, Collections.reverseOrder());

		Arrays.sort(n, (o1, o2) -> o2.compareTo(o1));
		
		System.out.println(Arrays.toString(n));
		
		Integer m[] = null;
		Arrays.copyOf(n, n.length+3);
		m = Arrays.copyOfRange(n, 0, n.length);
		
		System.out.println(Arrays.toString(m));
		
		
	} // main

}
