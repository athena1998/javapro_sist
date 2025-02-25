package days17;

public class Ex11 {
	public static void main(String[] args) {
		
		/*
		 * 인터페이스 장점
		 * 1. 개발시간 단축
		 * 2. 표준화 가능
		 * 3. 서로 관련없는 클래스들에게 관계를 맺어줄 수 있다.
		 * 4. 독립적인 프로그래밍 가능
		 */
		
		// 다형성
		// 인터페이스 참조 (업캐스팅 가능)
		IDBConn conn = new OracleDriver();
		conn.open();
		
		conn.select();
		conn.insert();
		
	} // main

}
