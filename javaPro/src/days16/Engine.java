package days16;


// 엔진 클래스
public class Engine {
	
	int speed;
	
	public Engine(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void moreFuel(int fuel) {
		this.speed *= fuel * 0.05;
	}
	
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void stop() {
		this.speed = 0;
	}
}
