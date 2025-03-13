package days28;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex02 {
	public static void main(String[] args) {
		
//		Function<String, Integer> f = s -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt; // 메서드 참조
		
		/*
		 * 메소드 참조 3가지
		 * 1) static 메서드 참조
		 * 2) 인스턴스 메서드 참조
		 * 3) 특정 객체 인스턴스 메서드 참조
		 */
		
		MyClass obj = new MyClass();
		Function<String, Boolean> f1 = obj::equals;
		
		// 동일구조
//		Supplier<MyClass> s = () -> new MyClass();
		Supplier<MyClass> s = MyClass::new;
		
		BiFunction<Integer, String, MyClass> s2 = (i,s1) -> new MyClass(i,s1);
		
	} // main

}

class MyClass {

	public MyClass(Integer i, String s2) {
		// TODO Auto-generated constructor stub
	}
	
	public MyClass() {
		
	}
	
}