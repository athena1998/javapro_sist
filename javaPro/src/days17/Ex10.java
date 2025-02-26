package days17;

import java.util.ArrayList;

public class Ex10 {
	public static void main(String[] args) {

		/*
		 * 인터페이스 (interface)
		 * 1. 자바의 참조형 자료형
		 * 2. 일종의 추상 클래스 이다.
		 * 		ㄴ 100% 추상메서드
		 * 		ㄴ 일반적인 메서드는 존재하지않음
		 * 		ㄴ 상수만 선언이 가능 그외의 필드는 선언 불가
		 * 3. 인터페이스는 그 자체만으로 사용되자않고 다른 클래스를 작성
		 * 		선언을 하는데 도움을 줄 목적을 하는 클래스
		 * 4. 인터페이스를 선언하는 형식
		 * 		[접근지정자] interface 이름 { }
		 * 		ㄴ 클래스의 일종이기에 인터페이스명은 대문자로 시작
		 * 5. 
		 */
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

	} // main

}

//(군사)부대, 한 사람, 단일체
class Unit{
	// [필드]
	// 유닛의 위치
	int x;
	int y;
	int currentHP;  // 현재 유닛의 체력
}

//하늘 유닛
//땅 유닛
//바다 유닛 생략~ 
class AirUnit extends Unit{
	// 필드, 메서드 구현
}

class GroundUnit extends Unit{
	// 필드, 메서드 구현   
}

interface Movable{
	// 상수, 추상메소드 + jdk1.8  default, static 메소드
	void move(int x, int y); // public abstract 키워드 생략.
}

interface Attackable{
	void attack(Unit unit);
}

//인터페이스끼리 상속이 가능하고 키워드는 extends 사용한다. 
//인터페이스는 다중상속이 가능하다. 
interface Fightable extends Movable, Attackable {

}

//어떤 클래스가 인터페이스를 구현하면 추상메소드를 오버라이딩 해야 한다. 
class Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		//  구현됨
	}

	@Override
	public void attack(Unit unit) {
		// 구현됨
	}

}

// 유닛 - 탱크 (수리가능) 해병대원, 수송선 (수리가능)
// 수리 유닛 - scv

class Marine extends GroundUnit implements Fightable {

	@Override
	public void move(int x, int y) {

	}

	@Override
	public void attack(Unit unit) {

	}


}

class Tank extends Unit implements Fightable, Refairable{

	@Override
	public void move(int x, int y) {

	}

	@Override
	public void attack(Unit unit) {

	}

}

class DropShip extends AirUnit implements Fightable, Refairable {

	@Override
	public void move(int x, int y) {

	}

	@Override
	public void attack(Unit unit) {

	}

}

interface Refairable {
	// 상수, 추상메서드 X
	
	
}


class SCV extends GroundUnit implements Refairable{

	// 수리 기능
	// 인터페이스도 클래스의 일종이라 매개변수 가능
	void repair(Refairable target) { // 매개변수 다형성
		if (target instanceof Unit) {

		} else {

		}
	}
	
	//	void repair(Tank tank) {
	//		// tank 수리
	//	}
	//	void repair(DropShip dropShip) {
	//		// dropShip 수리
	//	}
	//	void repair(SCV scv) {
	//		// scv 수리
	//	}


}







