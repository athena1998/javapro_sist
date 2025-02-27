package Ex19;

/**
 * @author junginn
 * @date : 2025. 2. 27. - 오전 10:07:12
 * @subject 어떤 객체로부터 클래스 정보를 얻어오는 3가지 방법
 * 							(Class 객체 얻어오기)
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);

		// [1] getClass
		// Class cls = c1.getClass();
		// String fullName = cls.getName();
		// System.out.println(fullName);

		// [2] - 모든 클래스 static 필드 : class
		// cls 를 이용해서 실제 Card 객체(인스턴스) 생성
		//							 	new Card();
		//  Class cls = Card.class;
		//	try {
		//		Card c2 = (Card) cls.newInstance();
		//		System.out.println(c2);
		//	} catch (InstantiationException | IllegalAccessException e) {
		//		e.printStackTrace();
		//	}
		
		// [3] Class.forName()
		String className = "days19.Card";
		try {
			Class c3 = Class.forName(className); // JDBC
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	} // main

}

// 최종 클래스
// final class 	: 최종 클래스
// final method : 재정의할 수 없다
// final field : 상수
// final local variable : 상수
final class Card {

	String kind; // 카드 종류
	int num; // 카드 번호

	public Card() {
		this("SPACE", 1);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return String.format("%s : %d", this.kind, this.num);
	}



}
