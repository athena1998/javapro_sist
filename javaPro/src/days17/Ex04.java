package days17;

import days16.Employee;
import days16.Regular;
import days16.Salesman;
import days16.Temp;

public class Ex04 {
	public static void main(String[] args) {
		
//		Employee emp1 = new Employee("kim", "서울시 강남구", "010-1123-1231", "2020.01.01");
//		Regular emp2 = new Regular("lee", "서울시 강남구", "010-5445-2322", "2023.12.14", 3000);
//		Salesman emp3 = new Salesman("park", "서울 중구", "010-3434-4343", "2023-05-23", 3000, 5, 10);
//		Temp emp4 = new Temp("jeong", "서울 강북", "010-3232-1322", "2022-03-21", 15, 20);
		
		Employee[] emps = {
				// new Employee("kim", "서울시 강남구", "010-1123-1231", "2020.01.01"),
				new Regular("lee", "서울시 강남구", "010-5445-2322", "2023.12.14", 3000),
				new Salesman("park", "서울 중구", "010-3434-4343", "2023-05-23", 3000, 5, 10),
				new Temp("jeong", "서울 강북", "010-3232-1322", "2022-03-21", 15, 20)
		};
		
		for (int i = 0; i < emps.length; i++) {
			dispEmpInfo(emps[i]);
			
		} // for i
		
		dispEmpInfo(emps[2]); // SalesMan
		
		/*
		 * 다형성  
		 * 1. 다양한 성질
		 * 2. 여러가지 형태를 가질 수 있는 능력
		 * 3. 업캐스팅 - 자식 객체를 생성해서 부모 클래스 타입으로 참조할 수 있는 것
		 * 4. 상속 관계
		 * 
		 */
		
		
	} // main

	private static void dispEmpInfo(Employee emp) { // 매개변수의 다형성 
		// 매개변수 Employee emp = 실제 reg / temp / sales 객체들 업캐스팅 되어져서 전달
		// 연산자 instanceOf 주의할점
		// if - else 구문을 사용해서 자식부터 -> 부모 순서로 판별
		// 만족하면 그 즉시 if 문 빠져나가기
		if (emp instanceof Salesman) {
			// 다운 캐스팅
			Salesman s1 = (Salesman) emp;
			System.out.println(s1.getPay());
			System.out.println("타입이 Salesman 이다");
		}else if (emp instanceof Regular) {
			System.out.println("타입이 Regular 이다");
		}else if (emp instanceof Temp) {
			System.out.println("타입이 Temp 이다");
		} else if (emp instanceof Employee) { // true/false
			System.out.println("타입이 employee 이다");
		}
		
		emp.dispEmpInfo();
	}
//
//	private static void dispEmpInfo(Salesman emp3) {
//		emp3.dispEmpInfo();
//		
//	}
//
//	private static void dispEmpInfo(Regular emp2) {
//		emp2.dispEmpInfo();
//		
//	}
//
//	private static void dispEmpInfo(Employee emp1) {
//		emp1.dispEmpInfo();
//		
//	}

}
