package days17;

import days16.Employee;
import days16.Salesman;
import days16.Temp;

public class Ex03 {
	public static void main(String[] args) {

		//		Employee emp3 = new Salesman("park", "서울 중구", "010-3434-4343", "2023-05-23", 3000, 5, 10);
		//		// 업캐스팅을 해도 실제 영업직 사원 객체의 사원 정보를 출력하는 dispEmpInfo 라는 메소드가 호출
		//		emp3.dispEmpInfo();
		//		// emp3.getPay() -> 접근불가
		
		// 임시직 객체 생성
		Employee emp4 = new Temp("jeong", "서울 강북", "010-3232-1322", "2022-03-21", 15, 20);
		emp4.dispEmpInfo();

	} // main

}
