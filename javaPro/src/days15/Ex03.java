package days15;

/**
 * @author junginn
 * @date : 2025. 2. 21. - 오전 11:12:59
 * @subject 기본형 매개변수와 참조형 매개변수
 *          MyPoint 클래스 - 좌표를 관리하기 위한 클래스
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		p1.dispMyPoint();
		
		MyPoint p2 = new MyPoint();
		p2.x = 20;
		p2.y = 10;
		
//		p2.dispMyPoint();
		
		// 매개변수로 입력한 값만큼 좌표값 이동
		p2.dispMyPoint();
		
		p1.offsetPoint(p2);
		p2.dispMyPoint();
		
		p1.offsetPointX(10);
		
	} // main

}
