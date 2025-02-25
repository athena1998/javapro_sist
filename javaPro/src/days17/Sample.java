package days17;

public interface Sample {
	
	// 필드 선언 불가 (변수)
	// public static final 생략가능 
	// 무조건 상수
	public static final int MAX_VALUE = 10;

	
	// 모든 메서드가 추상매소드다
	public abstract void test();
	int disp(int x, int y);
	
	// 3, jdk1 static 메소드, default 추가할수 있다.
	
}

