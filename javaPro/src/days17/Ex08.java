package days17;

/**
 * @author junginn
 * @date : 2025. 2. 25. - 오후 12:41:46
 * @subject 추상화
 * 				ㄴ abstract 키워드
 * 				ㄴ 추상 메소드, 추상 클래스
 * 				추상 클래스
 * 					ㄴ 공통적인 부분(멤버)만을 미리 선언한 클래스 
 * 					ㄴ getPay() 메소드 처럼 오버라이딩 -> 추상 클래스 선언
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		// 추상 클래스도 일종의 클래스
		// 추상클래스에 업캐스팅 가능
		Player p = new cdPlayer();
		p.play(0);
		p.stop();
		
	} // main
}

// 공통으로 쓰는 리모컨
abstract class Player {
	
	boolean pause; // 작동 중지
	int currentPos; // 현재 위치
	
	public Player() {
		super();
	}
	
	abstract void play(int pos);
	abstract void stop();
	
}

class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("추상 메소드를 오버라이딩");
		
	}

	@Override
	void stop() {
		System.out.println("추상 메소드를 오버라이딩");
		
	}
	
}

class cdPlayer extends AudioPlayer{
	
}