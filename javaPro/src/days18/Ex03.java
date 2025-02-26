package days18;

public class Ex03 {
	public static void main(String[] args) {
		
		/*
		 * [내부 클래스 (inner)]
		 * 1. 사용빈도가 거의 없다. 개념정도만 이해
		 * 2. 중첩클래스
		 * 3. awt, swing 과 같은 GUI 어플리케이션에서 이벤트 처리할 목적으로 사용한다
		 * 4. 내부 클래스의 종류와 특징 (선언 위치)
		 * 	  	1) 인스턴스 클래스 : 외부 클래스의 필드 위치에 선언
		 * 		2) 정적 클래스 : 외부 클래스의 필드 위치에 선언
		 * 		3) 지역(local) 클래스 : 외부 클래스의 메소드 안이나 초기화 블럭 안에 선언
		 * 		4) 익명클래스 (Anonymous)
		 * 			클레스의 선언 - 객체 생성 합쳐진 이름없는 클래스
		 * 			일화용
		 * 		
		 */
		
	} // main
}


class Outer {
	int iv = 0;  // 인스턴스 변수
	static int ic = 0; // 클래스 변수

	class InstanceClass { // 인스턴스 클래스
		// 주로 outer의 인스턴스 멤버들이랑만 관련된 작업을 더 용이하게 하는 목적
		
	}
	
	static class StaticClass { // 정적 클래스
		// 주로 outer의 인스턴스 멤버들이랑만 관련된 작업을 더 용이하게 하는 목적
		
	}
	
	{
		// 인스턴스 초기화 블럭
		class LocalClass {
			// 지역변수처럼
			// 해당 지역 안에서만 사용하는 클래스
		}
	}
	
	void disp () {
		class LocalClass {
			// 지역변수처럼
			// 해당 지역 안에서만 사용하는 클래스
		}
	}
	
}