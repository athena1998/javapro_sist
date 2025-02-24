package days16;

/**
 * @author junginn
 * @date : 2025. 2. 24. - 오전 10:47:49
 * @subject 가변인자
 * @content JDK 1.5 메서드의 매개변수 개수가 고정이 아니라 동적으로 지정가능
 */
public class Ex03_02 {
	public static void main(String[] args) {

		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));

		int[] m = {1,2,3,4,5};



	} // main

	//가변인자를 가진 sum 메서드를 선언해서 사용하면 편리
	// int...arg
	//가변인자는 내부적으로 배열을 사용
	// 오버로딩을 사용하지 않는게 좋음
	// 비 효율적이기때문에 꼭 필요한 곳에서만 사용
	// 제일 마지막에 가변인자를 선언함
	private static int sum(int...arg) {
		int result = 0;
		for (int i : arg) {
			result += i;
		}
		return result;
	}





}
