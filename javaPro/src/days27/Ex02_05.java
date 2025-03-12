package days27;

public class Ex02_05 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
		
	} // main

}

class Outer {
	int a = 10; // 외부변수 1
	
	class Inner {
		int b = 20; // 외부변수 2
		void method(int i) { // 외부변수 4 final int i
			int c = 30; // 외부변수 3 final int c
			
//			i = 200;
//			c = 100;
//			MyFunction2 f = (i) -> { // 에러, method(int i) 이름 중복
			MyFunction2 f = () -> { 
				// 외부변수를 참조하는 람다식
				// 람다식에서 i와 c라고 하는 변수를 참조하면 그 순간 그 변수들은 final을 붙이지 않아도 
				// 상수로 간주된다.
				// Local variable i defined in an enclosing scope must be final or effectively final
				System.out.println("i : " + i);
				System.out.println("c : " + c);
				
				// 상수아님 값 변경 가능
				Outer.this.a = 1000;
				this.b = 100;
				System.out.println("b : " + this.b);
				System.out.println("a : " + Outer.this.a);
			};
			f.myMethod();
		}
	}
}


@FunctionalInterface
interface MyFunction2 {
	void myMethod();
}