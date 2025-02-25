package days17;

public class Ex01 {
	public static void main(String[] args) {

		

	} // main

}

class FinalTest {
	
	// The blank final field PI may not have been initialized
	// 단 한번만 초기화 가능
	public final double PI; // 명시적 초기화

	{
		// The blank final field PI may not have been initialized
//		PI = 3.141592; // 인스턴스 초기화 블럭
	}
	
	public FinalTest() {
		PI = 3.141;
	}
	
	public FinalTest(double pi) {
		PI = pi;
	}
	
	public void plus(final int value) {
		// 지역변수 (상수)
		final int MAX_VALUE = value;
	}
}










