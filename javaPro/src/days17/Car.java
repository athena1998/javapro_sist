package days17;

// 자동차 클래스
public class Car {
	String name;
	String gearType;
	int door;
	
	//has-a 관계 : car-engine
	private Engine engine;
	
	// 명시적 초기화
	// 결합력이 높은 코딩 - 비추천 결합력은 낮을수록 좋다
//	private Engine engine = new Engine(0);
	
	public Car() {
		
	}
	
	Car(Engine engine) { // 매개변수 다형성
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
	
	
	

}
