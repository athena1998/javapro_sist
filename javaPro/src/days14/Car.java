package days14;

// 신형 자동차 클래스 선언
class Car {
	
	String name;
	int speed;
	int wheelcount;
	
	// 메소드 (method)
	public void dispCarInfo() {
		System.out.printf("차 명 : %s, 속도 : %d, 바퀴 수 : %d\n", name, speed, wheelcount);
	}
	
}
