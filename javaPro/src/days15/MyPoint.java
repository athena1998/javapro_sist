package days15;

public class MyPoint {
	
	
	// 필드 초기화 안하면 int 기본값 0
	public int x;
	public int y;
	
	// 기본 생성자
	public MyPoint () {
		System.out.println("My Point 기본 생성자 호출");
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 								   p2
	public MyPoint plusMyPoint(MyPoint p) { // 클래스 복사
		//  p1
		this.x = x+p.x;
		this.y = y+p.y;
		
		return this; // this의 세번째용도
	}
	
	
	

	// 좌표값 출력 메서드
	public void dispMyPoint() {
		// 호출한 객체의 x, 호출한 객체의 y
		System.out.printf("x = %d, y = %d\n", x, y);
	}
//
//	public void offsetPoint(int i) { // 매개변수 기본형 (int)
//		x += i;
//		y += i;
//	}

	// x = 객체로 호출한 값
	// p1.offsetPoint(p2) == p1의 x값
	public void offsetPoint(MyPoint p) { // 매개변수 참조형 (p2) -> 클래스 복사
		x = x + p.x;
		y = y + p.y;
		
	}

	public int offsetPointX(int i) {
		return x+10;
		
	}

}
