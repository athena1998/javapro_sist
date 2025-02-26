package days18;

public class Ex03_02 {
	// 1. 인스턴스 클래스
	class InstanceClass{
		int ivinstance = 0; // 인스턴스 변수 선언 가능
		// The field iv cannot be declared static in a non-static inner type, 
		// unless initialized with a constant expression
//		static int iv = 100; // 클래스 변수 선언 불가
		final static int iv = 100; // 상수 선언 가능
	}
	
	static class StaticInner {
		int ivinstance = 0; // 인스턴스 변수 선언 가능
		static int iv = 100; // 클래스 변수 선언 가능
		final static int ivFinal = 100; // 상수 선언 가능
	}
	
	void method() {
		class LocalTClass {
			int ivinstance = 0; // 인스턴스 변수 선언 가능
			// static int iv = 100; // 클래스 변수 선언 붕가
			final static int ivFinal = 100; // 상수 선언 가능
		}
	}
	
	public static void main(String[] args) {
		
		int ivinstance = 0; // 인스턴스 변수 선언 가능
//		static int iv = 100; // 클래스 변수 선언 불가
//		final static int ivFinal = 100; // 상수 선언 불가
		
		
	} // main

}
