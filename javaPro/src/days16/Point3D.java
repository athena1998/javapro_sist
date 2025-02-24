package days16;

// 상속 개념
// Point2D 기존에 존재하는 클래스를 재사용해서 새로운 Point3D 클래스
public class Point3D extends Point2D {

	// The field Point2D.x is not visible - 접근지정자 오류
//	 private int x;
//	 private int y;
	private int z;

	// 생성자는 상속되지 않는다
	public Point3D () {
		System.out.println("기본 생성자 실행");
	}

	public Point3D(int x) {
		super(x);
//		this.setX(x);
		this.setY(x);
		System.out.println("Point3D 1 생성자 호출됨");
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D 2 생성자 호출됨");
	}
	
	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void Point3D () {
		System.out.printf("x=%d, y=%d, z=%d", this.getX(), this.getY(), this.z);
	}
	
	public Point3D offsetPoint(int i) {
		this.setX(getX() + i);
		this.setY(getY() + i);
		z += i;
		return this; // this의 세번째 용도
	}
	
	public void offsetPoint(Point3D p) {
		// 부모 생성자를 임의적으로 호출 X
		// super(p.getX(), p.getY())
		this.setX(this.getX() + this.getX());
		this.setY(this.getY() + this.getY());
		z += p.z;
	}

	public Point3D plus(Point3D p) {
		int xValue = this.getX()+p.getX();
		int yValue = this.getY()+p.getY();
		int zValue = z+p.z;
		
		Point3D newp = new Point3D(xValue, yValue, zValue);
		
		return newp;
	}
	


}
