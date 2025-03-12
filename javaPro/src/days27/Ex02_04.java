package days27;

/**
 * @author junginn
 * @date : 2025. 3. 12. - 오전 10:18:01
 * @subject	반드시 함수형 인터페이스로만 형변환을 할 수 있다	
 * @content
 */
public class Ex02_04 {
	public static void main(String[] args) {
		
		//							 익명객체						
		MyFunction f = (MyFunction) (() -> {});
		
		Object obj = (Object) ((MyFunction) (() -> {}));

		String str = ((Object) ((MyFunction) (() -> {}))).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
	} // main

}


@FunctionalInterface
interface MyFunction {
	void run();
}