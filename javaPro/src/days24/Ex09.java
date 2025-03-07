package days24;

import java.util.Arrays;

/**
 * @author junginn
 * @date : 2025. 3. 7. - 오후 4:13:38
 * @subject 열거형(enums) - 자료형
 * 			ㄴ 서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입
 * 			ㄴ 정의 : enum 열거형이름 (상수멍,상수명,,,,)
 * 			ㄴ 클래스로 컴파일됨
 * 			ㄴ 열거형 이름
 * @content
 */
public class Ex09 {

	// 중첩클래스의 의미 이 클래스 안에서만 사용
	//	enum Card {
	//		CLOVER, HEART, DIAMOND, SPADE
	//	}

	public static void main(String[] args) {

		System.out.println(Card.CLOVER);
		System.out.println(Card.CLOVER.name());
		System.out.println(Card.CLOVER.ordinal()); // 상수의 순서 0번째
		
		Card cardType = Card.valueOf(Card.CLOVER.name());
		System.out.println(cardType);
		
		// Card 열거형의 모든 상수 가져오기
		Card[] cardArr = Card.values();
		System.out.println(Arrays.toString(cardArr));

	} // main

}

// 이 패키지(days24) 안에서만 사용가능
//	enum Card {
//	CLOVER, HEART, DIAMOND, SPADE
//	}

//class Card {
//	public static final int HEART = 1;
//	public static final int CLOVER = 1;
//	public static final int DIAMOND = 1;
//	public static final int SPADE = 1;
//}