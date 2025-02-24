package days16;

/**
 * @author junginn
 * @date : 2025. 2. 24. - 오전 10:47:49
 * @subject 가변인자
 * @content JDK 1.5 메서드의 매개변수 개수가 고정이 아니라 동적으로 지정가능
 */
public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		
	} // main

	private static int sum(int a, int b, int c) {
		return a+b+c;
	}

	// 두 정수의 합을 구해서 반환하는 메소드
	private static int sum(int a, int b) {
		return a+b;
	}

	
}
