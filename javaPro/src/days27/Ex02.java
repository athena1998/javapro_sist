package days27;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 함수형 인터페이스
		 * 	  ㄴ 자바에서 모든 메서드는 클래스 내에 선언된다
		 * 	  ㄴ 람다식 == 메서드 -> 어떤 클래스에 선언
		 * 		 람다식				 익명 클래스에 객체
		 * 	  ㄴ 	객체명.메서드명() 호출
		 * 	  ㄴ	타입	?	변수	=	람다식		호출
		 * 			참조타입 : 클래스, 인터페이스
		 * 
		 * 		interface MyFunction {
		 * 			int max(int a, int b);
		 * 		}
		 * 
		 * 		// 익명클래스
		 * 		MyFunction f = new MyFunction {
		 * 			@Override
		 * 			int max(int a, int b) {
		 * 				return a>b ? a:b;
		 * 			}
		 * 		}
		 * 
		 * 		MyFunction f = (a,b) -> a>b ? a:b
		 * 		int p = f.max(1,2) // 익명객체 메서드 호출
		 * 
		 * 		ㄴ 하나의 메서드만 선언된 엔터페이스들을 정의해서
		 * 			람다식을 다를수 있도록 규칙
		 * 			람다식을 다루는 1개만의 메서드를 가진 인터페이스를 함수형 인터페이스라 부른다
		 * 		
		 * 		@FunctionalInterface 어노테이션을 붙인다
		 * 
		 * 		ㄴ Static, default 메소드는 개수와 상관없아 정의 가능하다
		 * 		ㄴ 함수형 인터페이스 타입을 리턴타입으로 사용한다
		 * 		ㄴ Ex02_03.java
		 * 
		 * 		ㄴ 람다식의 타입과 형 변환
		 * 			1) 람다식을 함수형 인터페이스에 참조할 수 있다
		 * 			MyFunction f1 = ()-> Sysn("f1의 run 메소드 호출");
		 * 			2) 람다식의 타입이 함수형 인터페이스 타입과 일치하지 않음
		 * 				익명타입 (객체)
		 * 			3) 람다식의 타입이 함수형 인터페이스의 타입으로 형변환
		 * 				ㄴ Object obj = (Object) (()-> Sysn("f1의 run 메소드 호출")) 불가능
		 * 				ㄴ 반드시 함수형 인터페이스로만 형변환을 할 수 있다
		 * 				ㄴ Ex02_04.java
		 * 
		 * 		ㄴ 외부 변수를 참조하는 람다식
		 * 			1) 람다식 == 익명객체 (익명클래스의 인스턴스)
		 * 			2) 외부에 선언된 변수에 접근 하는 규칙
		 * 				Ex02_05.java
		 * 			class Outer{
		 * 
		 * 				// 내부 클래스
		 * 				// 람다식도 익명객체 (내부클래스)
		 * 				class Inner {
		 * 				}
		 * 			}
		 * 
		 * 
		 * 
		 */
		
	} // main

}
