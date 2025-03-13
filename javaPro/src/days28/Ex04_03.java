package days28;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex04_03 {
	public static void main(String[] args) {
		
		// 특정 범위의 정수를 스트링으로
//		IntStream is1 = IntStream.range(1, 5);
//		IntStream IS2 = IntStream.rangeClosed(1, 5);
		
		// 임의의 수 생성 - Random
		IntStream is2 = new Random().ints();
		LongStream is3 = new Random().longs();
		DoubleStream is4 = new Random().doubles();
		
		IntStream lotto = new Random().ints(1,45).distinct().limit(6);
//		lotto.forEach(System.out::println);
		
		// intStream -> 스트림
		Stream<String> slotto = lotto.sorted().mapToObj(i -> i + "/");
		slotto.forEach(System.out::print);
		
		
	} // main

}
