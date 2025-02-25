package days17;


// 엔진 인터페이스
public interface Engine {

	public abstract void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();
}
