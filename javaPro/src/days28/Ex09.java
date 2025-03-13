package days28;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09 {
	public static void main(String[] args) {
		
		// [flatMap]
		// ㄴ 스트림의 요소가 배열인 경우 스트림에 타입이 
		// Stream<[]> -> flatMap() -> Stream<T>
		
		String [] lineArr = {
	            "Belive or not It is true", 
	            "Do or do not There is no try"
	      };
		
		//String[] -> Stream 
		Stream<String> lineSt = Arrays.stream(lineArr);
		
//		Stream<Stream<String>> ss1 = lineSt.map(line->Stream.of(line.split(" +")));
		Stream<String> ss2 = lineSt.flatMap(line->Stream.of(line.split(" +")));
		
	} // main

}
