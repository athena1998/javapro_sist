package days16;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 * 클래스들간의 두가지 관계
		 * 1. has-a	소속 관계
		 * 		예) 자동차 클래스
		 * 			ㄴ엔진(1) 클래스
		 * 			
		 * 
		 * 2. is-a	상속 관계
		 */
		
		
		// 생성자를 통한 의존성 주입 (DI)
		Engine k  = new Engine(10);
		Car car1 = new Car(k);
		car1.speedUp(10);

		// setter를 사용해서 의존성 주입
		Engine t = new Engine(20);
		car1.setEngine(t);
		
		int speed = car1.getEngine().speed;
		System.out.println("현재 속도 : " + speed);
		
		
	} // main

}
