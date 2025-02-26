package days18;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		
		int[] m = null;
		m = new int[1]; // 예외처리
		m[0] = 1;
		System.out.println(Arrays.toString(m));
		
		/*
		 * 예외처리 (Exception Handling)
		 * 	1. 오류 : 프로그램이 실행 중에 오작동하거나 비정상적으로 종료되는 일
		 * 	2. 오류 발생 시점에 따라서 
		 * 		컴파일 오류
		 * 		실행할때 발생하는 오류
		 * 			[1] 에러(Error) : 복구할 수 없는 심각한 오류 (스택 오류, 메모리 오류 등 컴퓨터 자체 에러)
		 * 				Error 부모 클래스
		 * 						자식 클래스
		 * 			[2] 오류(Exception) : 에러보다 덜 심각하고 고칠수 있는 것 (컴파일 오류, 런타임 오류)
		 * 				Exception 부모 클래스
		 * 						자식 클래스
		 * 			[3] 논리적 오류 : 
		 *				int i = Integer.MAX_VALUE;
		 *				i += 10;
		 *				System.out.println(i); // -2147483639 문제 발생
		 */
		
		/*
		 * Exception in thread "main" java.lang.NullPointerException 에러
		 * JVM 안에 예외처리기가 발생한 에러를 그 에러에 맞는 객체로 생성해서 
		 * 에러 내용을 알려줌
		 * 
		 * 예외처리
		 * 	- 프로그램 실행시 발생할 수 있는 예기치 못한 예외의 발생에 대한
		 * 	  대비를 코드로 작성하는 것
		 * 
		 * 예외처리 방법
		 * 	- try-catch 문 사용
		 * 	- throws 문 사용
		 */
		
	} // main

}
