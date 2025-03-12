package days27;

/**
 * @author junginn
 * @date : 2025. 3. 12. - 오전 9:01:56
 */
public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * 1. 람다식
		 * 		자바 = 객체지향 프로그래밍 언어인 동시에 함수형 언어
		 * 				함수형언어 : 독립적인 함수
		 * 2. 람다식 : 메서드를 하나의 식으로 표현한것
		 * 				() -> System.out.println
		 * 				람다식을 익명함수라고 부르기도 한다
		 * 3. 메서드보다 코딩이 간결하고 이해가 넓다 -> 코드의 간결성
		 * 		객체지향 언어가 블편한 점 
		 * 		ㄴ 메소드를 사용하려면 항상 클래스의 객체를 생성한 후에
		 * 			객체명 메소드명() 호출 해야됨
		 * 4. 람다식을 사용해서 메서드를 변수처럼 다룰 수 있다.
		 * 5. 람다식 선언 형식
		 * 		ㄴ 메서드의 이름과 반환타입을 제거하고 매개변수 선언부와 몸체 () 사이에 화살표
		 * 			연산자를 추가하면 된다.
		 * 
		 * 		메소드 
		 * 		반환타입 메소드이름(매개변수 ... 
		 * 			명령코딩,
		 * 		)
		 * 
		 * 		람다식
		 * 		(매개변수 ... )  ->  {
		 * 								명령코딩 
		 * 							 }
		 * 		첫번째 방식
		 * 		(int a, int b) -> { return a>b ? a : b; }
		 * 
		 * 		두번째 방식
		 * 		  ㄴ 반환값이 있는 메서드인 경우 return문 대신 수식으로 대신할 수 있다.
		 * 		  ㄴ 이 수식의 결과가 자동적으로 반환값이 된다
		 * 		  ㄴ 세미콜론은 붙이지 않는다
		 * 		(int a, int b) -> a>b ? a : b
		 * 
		 * 		세번째 방식
		 * 		  ㄴ 매개변수의 타입을 추측할 수 있는 경우에는 생략 가능하다 근데 하나만 생략하는건 안됨
		 * 		(O) (a, b) -> a>b ? a : b
		 * 		(X) (int a, b) -> a>b ? a : b
		 * 
		 * 		만약에 매개변수가 하나일 경우에는 () 괄호 생략 가능
		 * 		(a) -> a*a
		 * 		 a -> a*a
		 * 
		 * 		네번째 
		 * 		(String name, int age) -> {
		 * 			System.out.println(name);
		 * 			System.out.println(age);
		 * 		}
		 * 
		 * 		실행코딩이 한줄이라면 { } 생략 가능
		 * 		(String name, int age) -> {
		 * 			System.out.println(name + " " + age);
		 * 		}
		 * 		= (String name, int age) -> System.out.println(name + " " + age)
		 * 
		 *		(int a, int b) -> { return a>b ? a : b } 
		 *		ㄴ 세미콜론 없어서 잘못된 코딩
		 *		ㄴ 세미콜론을 추가하거나 return을 삭제
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	} // main

}
