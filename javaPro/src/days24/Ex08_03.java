package days24;

public class Ex08_03 {
	public static void main(String[] args) {
		
		/*
		 * 제네릭의 제한
		 * 객체별로 다른 타입으로 저장해서 동작하도록 만든 기능이기
		 * 떼문에 static 필드는 선언할 수 없다.
		 * static 메서드의 매개변수 타입으로도 T를 사용할 수 없다
		 * T 타입의 배열은 선언할 수 있다.
		 */
		
	} // main

}


class Box2<T> {
	// Cannot make a static reference to the non-static type T
//	static int compare(T o1, T o2) {
//		return T;
//	}
	
}