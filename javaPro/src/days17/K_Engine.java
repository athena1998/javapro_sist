package days17;

public class K_Engine implements Engine{
	
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.15;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.21;
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
