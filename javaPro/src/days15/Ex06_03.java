package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 3:34:17
 * @subject 
 * @content
 *       3) 단독(홀로) 사용될 때의 this 용도
 *      - 매개변수  Ex06_02.java 
 */
public class Ex06_03 {

	public static void main(String[] args) {

		MyPoint p1 = new MyPoint(1, 2);
		MyPoint p2 = new MyPoint(100, 200);
		
		
		MyPoint p3 = p1.plusMyPoint(p2);
		p1.plusMyPoint(p2).dispMyPoint();
		p1.dispMyPoint();

	}
}
