package days28;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex04_02 {
	public static void main(String[] args) {
		
		int[] arr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		
		// 배열 -> 스트림
		// 1) stream.of(..[args].stream.of(T[] args))
		// 2) Arrays.stream(T[] args), Arrays
		IntStream is = IntStream.of(arr);
		int sum = is.sum();
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
//		IntStream filterls = is.filter((t) -> t>50);
//		filterls.forEach(System.out::println);
		
		
		IntStream is2 = IntStream.of(arr);
		OptionalInt ox = is2.max();
		System.out.println(ox.getAsInt());
		
		String[] strArr = {"as", "bb", "cc"};
		
		
		
	} // main

}
