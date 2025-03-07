package days24;

public enum Direction {
	
	// The constructor Direction(int, String) is undefined
	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400,"↑");

	// final 은 값을 수정 못하기 때문에 setter 를 못 만듦
	private final int value;
	private final String symbol;
	
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name() + " : " + this.symbol + " ";
	}
	
	
	
}
