package days16;

public class Ex07 {
	public static void main(String[] args) {
		
		// is-a 상속관계
		/* 1. 상속 (inheritance)
		 *  	부모 -> 자식 (재산)
		 *  	부모 -> 자식 (코드)
		 *  	기존의 클래스를 재사용하여 새로운 클래스를 작성 (선언)하는 것
		 *  상속 장점
		 *  	코드 재사용 -> 코딩량이 적다
		 *  	생산성 향상, 유지보수 용이
		 *  자바에서 상속 구현 방법
		 *  	class 새로운 클래스명 extends 기존 클래스 { }
		 *  
		 *  기존 클래스		부모 클래스		base 클래스				[super] 클래스	상위 클래스
		 *  새로운 클래스	자식 클래스		파생(derived) 클래스 	sub 클래스 		하위 클래스 
		 */
		
		Point2D p = new Point2D(10,20);
		p.dispPoint2D();
		
	} // main

}
