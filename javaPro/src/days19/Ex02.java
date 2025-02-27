package Ex19;

public class Ex02 {
	public static void main(String[] args) {
		
		// Object - equals
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		// Object - clone
		try {
			
			// Point p3 = (Point) p1.clone();
			Point p3 = p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} // main

}

class Point extends Object implements Cloneable{
	int x;
	int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		} // if
		
		return false;
	}

	/*
	 * Object 클래스의 clone 메소드가 오브젝트를 복제하기 위해 호출되었지만 
	 * 오브젝트의 클래스가 Cloneable 인터페이스를 구현하지 않음을 표시하기 위해 발생합니다. 
	 * clone 메서드를 재정의하는 응용 프로그램은 이 예외를 발생시켜 개체를 복제 할 수 없거나 복제 할 수 없음을 나타냅니다.
	 */
//	@Override
//	protected Object clone() throws CloneNotSupportedException  {
//		Object obj = null;
//		obj = super.clone();
//		return obj;
//	}
	
	// 공변 반환 타입
	// 오버라이딩 주의할점 - 부모의 리턴자료형, 매개변수, 예외 등등
	// 부모 리턴자로 형변환 -> 자식 리턴 자료형으로 변경
	@Override
	protected Point clone() throws CloneNotSupportedException  {
		Point obj = null;
		obj = (Point) super.clone();
		return obj;
	}

	@Override
	public String toString() {
		return String.format("x=%d, y=%d", this.x, this.y);
	}
	
	
	
	
	
	
	
	
	
	
	
}