package days15;

import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {

		/*
		 * 생성자 (constructor)
		 * 1. 일종의 메소드이다
		 * 2. 리턴자료형 x
		 * 3. 반드시 메서드 명은 클래스명과 동일해야함
		 * 4. 매개변수 x 없는 생성자를 기본 생성자 (default constructor)
		 * 5. 생성자의 역할 : 필드를 초기화하는데 사용
		 * 6. 호출되는 시기 : 인위적으로 생성자를 호출할수 없음
		 * 					  객체를 생성할때만 자동으로 호출
		 * 7. 접근제한자를 사용할 수 있다. 
		 * 8. 생성자도 오버로딩이 가능하다 == 중복선언이 가능하다.
		 * 9. 생성자는 상속되지 않는다.
		 * 10. 생성자가 하나도 없는 경우에는 컴파일러가 자동으로 디폴트 생성자를 추가한다.
		 */

		// [1]
		/*
		MyPoint p1 = new MyPoint();
		// 필드 초기화
		p1.x = 10;
		p1.y = 20;
		
		p1.dispMyPoint();
		
		*/
		
		//[2]
		
		MyPoint p1 = new MyPoint(10, 20);
		p1.dispMyPoint();
		

	} // main

}
