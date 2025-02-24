package days16;

/**
 * @author junginn
 * @date : 2025. 2. 24. - 오전 10:47:49
 * @subject 가변인자
 * @content JDK 1.5 메서드의 매개변수 개수가 고정이 아니라 동적으로 지정가능
 */
public class Ex03_03 {
	public static void main(String[] args) {


		String[] names = {"홍길동", "홍길동", "홍길동", "홍길동", "홍길동"};
		
		System.out.println(joinNames(names[0], args));

	} // main
	
	public static String joinNames(String delimeter, String...args) {
		return String.join(delimeter, args);
	}
}
