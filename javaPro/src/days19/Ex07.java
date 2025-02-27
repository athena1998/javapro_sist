package Ex19;

public class Ex07 {
	public static void main(String[] args) {

		// Wrapper class 래퍼클래스
		// - 제네릭을 사용할때의 타입은 기본형을 사용하지 않고 래퍼클래스를 사용한다

		// Auto-Boxing / Auto-UnBoxing
//		int i = 100;
//		System.out.println(i);
//		Integer j = new Integer("100");
//		Integer j =Integer.valueOf(i);
//		// int k = j.intValue();
		
		int i = 100;
		Integer j = i; // Auto-Boxing 기본형이 래퍼클래스로 변경되는거 
		
		int k = j; // Auto-UnBoxing 래퍼클래스에서 기본형으로 변경되는거
		
		disp(i);
		
		
	} // main

	private static void disp(Object obj) {
		// int -> Integer -> Object
		// object 는 모든 타입을 다 받을 수 있음
		// 모든 타입의 부모이기 때문에 모든 타입을 업캐스팅 할 수 있음
		System.out.println(obj);
	}
}
