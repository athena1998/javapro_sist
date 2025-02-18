package days12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex05 {
	public static void main(String[] args) {

		//		[2]
		//		int[] arr = new int[100];
		//		Random rnd = new Random();
		//		arr = IntStream.generate(new IntSupplier() {
		//			
		//			@Override
		//			public int getAsInt() {
		//				return rnd.nextInt(10);
		//			}
		//		}).limit(100).toArray();

		//		[3]
		//		int[] arr1 = new int[100];
		//		Random rnd1 = new Random();
		//		arr1 = IntStream.generate(() -> rnd1.nextInt(10)).limit(100).toArray();


		int[] arr = new Random().ints(0,10).limit(100).toArray();

		System.out.println(Arrays.toString(arr));

		int[] counter = new int[10];
		int[] countArr = new int[10];

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
				counter[i] = count;
			} // for j
			System.out.printf("%d 의 갯수 : %d\n", i, counter[i]);
		} // for i

		

		System.out.println("-".repeat(30));
		
		
		
		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i]]++;
		} // for i
		System.out.println(Arrays.toString(countArr));
		
		

		System.out.println("-".repeat(30));

		
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for(int i=0; i<10; i++) {
			int count1 = Collections.frequency(list, i);
			System.out.printf("%d 의 갯수 : %d\n", i, count1);
		}




	} // main

}
