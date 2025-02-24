package days16;


// 부모 클래스
public class Point2D {

	private int x;
	private int y;

	// 생성자는 상속되지 않는다
	public Point2D () {
		System.out.println("기본 생성자 실행");
	}

	public Point2D(int x) {
		this.x = x;
		this.y = x;
		System.out.println("Point2D 1 생성자 호출됨");
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D 2 생성자 호출됨");
	}

	// getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void dispPoint2D () {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
	}
	
	public String getXY() {
		return String.format("{%d, %d}", this.x, this.y);
	}
	
	public Point2D offsetPoint(int i) {
		x += i;
		y +=i;
		return this; // this의 세번째 용도
	}
	
	public void offsetPoint(Point2D p) {
		x += p.x;
		y += p.y;
	}
	
	public Point2D plus(Point2D p) {
		int xValue = x+p.x;
		int yValue = y+p.y;
		
		Point2D newp = new Point2D();
		newp.x = xValue;
		newp.y = yValue;
		
		return newp;
	}
	
	






}
