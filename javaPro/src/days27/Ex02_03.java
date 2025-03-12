package days27;

/**
 * @author junginn
 * @date : 2025. 3. 12. - 오전 10:05:49
 * @subject	함수형 인터페이스 타입을 리턴타입으로 사용
 * @content
 */
public class Ex02_03 {

	//					함수형 인터페이스를 매개변수로 사용
	static void execute(MyFunction f) {
		f.run();

	}
	
	static MyFunction getMyFunction() {
		return ()-> System.out.println("f1의 run 메소드 호출");
	}

	public static void main(String[] args) {
		MyFunction f1 = ()-> System.out.println("f1의 run 메소드 호출");
		execute(f1);
		
		// 람다식을 매개변수로 사용
		execute( () -> System.out.println("f.run..."));
		
		// 2
		MyFunction f = getMyFunction();
		f.run();


	} // main

}

//@FunctionalInterface
//interface MyFunction {
//	void run();
//}