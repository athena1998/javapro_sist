package days16;

import java.awt.Point;
import java.io.IOException;

// 모든 클래스의 최상위 클래스는 object 클래스
/*
 * public class Ex08 extends Object{

   }
 */
public class Ex08 {
	public static void main(String[] args) throws IOException {

		Shape s = new Shape();
		//		s.draw();

		Point2D center = new Point2D(50, 100);
		int radius = 10;
		Circle c = new Circle(center, radius);
		c.draw();


		System.out.println("---------------------------------------");

		Point2D[] p = {new Point2D(1, 1), 
				new Point2D(10, 20),
				new Point2D(10, 5)};
		
		Triangle t = new Triangle(p);
		t.draw();

	} // main

}

class Shape extends Object{
	String color = "black";

	public void draw() throws IOException {
		System.out.printf("color : %s\n", color);
	}
}

// 상속 X
//class Circle {
//	int x;
//	int y;
//	int radius;
//
//	public Circle() {
//		this(0, 0, 0);
//	}
//
//	public Circle(int x, int y, int radius) {
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//}

// 원은 도형이다 =  도형(원)
// is-a 상속관계 
class Circle extends Shape {


	Point2D center;
	int radius;

	public Circle() {
		this(new Point2D(0,0), 0);
	}

	public Circle(Point2D center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// 원점 출력 			+	 원 색깔 출력
	// Point2D.dispPoint2D()	 Shape.draw()

	//	public void drawColorCenter() {
	//		System.out.printf("color : %s, center : %d\n", color);
	//		center.dispPoint2D();
	//	}

	// shape 부모클래스의 color만 출력하는 draw() 메소드를
	// 물려받은 Circle 자식클래스에서 color + 원점을 출력하는
	// 새로운 draw() 메소드를 다시 정의 (재정의)
	// 오바라이딩 = 재정의 함수
	// 오버로딩 = 중복함수
	//
	// 오버라이딩 규칙
	// 1. 메서드명은 동일하게
	// 2. 리턴자료형도 동일하게
	// 3. 매개변수도 동일하게
	// 4. 접근지정자는 같거나 범위가 넓은 접근지정자 지정
	// public > protected > default(package) > private
	// 5. 예외는 부모의 예외보다 많을 수 없다.
	// 6. 인스턴스 메서드 <-> 정적 메서드로 변경할 수 없다


	@Override
	public void draw() throws IOException {
		System.out.printf("color : %s, center (%d, %d)\n", color, this.center.getX(), this.center.getY());
	}


}


// 삼각형 클래스
class Triangle extends Shape {

	Point2D [] p = new Point2D[3];

	public Triangle (Point2D[] p) {
		this.p = p;
	}

	@Override
	public void draw() throws IOException {
		System.out.printf("x=%s, y=%s z=%s", p[0].getXY(), p[1].getXY(), p[2].getXY());
	}

}
















