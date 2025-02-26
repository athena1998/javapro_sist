package days17;

import days16.Employee;
import days16.Regular;

public class Ex02 {
	public static void main(String[] args) {
		
		Employee emp1 = new Regular("kim", "서울시 강남구", "010-1123-1231", "2020.01.01", 3000);
		emp1.dispEmpInfo();
		
		// Type mismatch: cannot convert from Employee to Regular
		// 부모객체에서 자식 객체를 참조시키면 다운캐스팅이 되서 강제 클래스 형변환을 해야한다
		// 자식객체에서 부모객체를 참조시키는 업캐스팅은 자동으로 된다.
		// (변환하고자 하는 자료형) cast 연산자로 강제 형변환
		// 반드시 자식객체로 업케스팅을 한 객체만이 다운캐스팅을 할 수 있다.
		Regular emp2 = (Regular) emp1;
		emp2.getPay();
		
	} // main

}
