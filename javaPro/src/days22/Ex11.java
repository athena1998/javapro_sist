package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ex11 {
	public static void main(String[] args) {
		
		// set 인터페이스 특징
		// 중복허용 x, 순서유지 x
		
		// <> 제네릭은 참조형만 사용가능
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(20);
		set.add(15);
		set.add(30);
		set.add(40);
		
		System.out.println(set);
		
	} // main

}
