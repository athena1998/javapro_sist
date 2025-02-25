package days17;

public class Ex12 {
	public static void main(String[] args) {
		
		// has-a 소속관계
		// engine 클래스 -> 인터페이스 변경
		// 1. 엔진 생산
		// 2. 엔징 
		
		Car car1 = new Car(new K_Engine());
		car1.setEngine(new H_Engine());
		
		Car car20000 = new Car(new K_Engine());
		
		Car myCar1 = new Car(new H_Engine());
		Car myCar30000 = new Car(new H_Engine());
		
		Car c = new Car(new X_Engine());
		
		
	} // main

}
