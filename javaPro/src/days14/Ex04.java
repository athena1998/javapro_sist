package days14;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		 ** [클래스 선언 시 앞에 붙는 접근 지정자]
		 * 1. public : 패키지 내/외부 사용가능
		 * 2. protected : 같은 패키지 내 에서만 상속되면 다른 패키지에서도 접근 가능
		 * 3. default : 패키지 내부에서만 사용
		 * 4. private : 같은 파일 내 에서만
		 * 
		 ** [필드 메소드 선언 시 앞에 붙는 접근 지정자]
		 * 1. public : 패키지 내/외부 사용가능
		 * 2. protected : 같은 패키지 내 에서만 상속되면 다른 패키지에서도 접근 가능
		 * 3. default : 패키지 내부에서만 사용
		 * 4. private : 같은 클래스 내 에서만
		 */

		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 5;
		p1.run();
		
		p1.age = 31;
		p1.run();
		
		
		
		
	} // main

}
