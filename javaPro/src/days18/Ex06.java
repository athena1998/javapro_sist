package days18;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("1");
		
		try {
			System.out.println("2");
			System.out.println(300/0);
			System.out.println("3");
			
		} catch (ArithmeticException E) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		}finally { // try 블럭의 유무에 상관없이 실행할 코딩을 진행하는 영역
			System.out.println("6");
		}
		System.out.println("/");
		
	} // main

}
