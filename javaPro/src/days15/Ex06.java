package days15;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 * this 키워드 
		 * 정의 : 클래스 자기자신의 주소값을 가지는 참조변수
		 * 
		 * this의 3가지 용도
		 *   - 멤버(필드)를 가리킬 때의 this 용도
		 *   - 생성자에서 또다른 생성자를 가져올때
		 *      - 생성자 호출 시기 : 객체 생성
		 *   - 단독(홀로) 사용될 때의 this 용도
		 *      - 리턴값 
		 */
		
		Person p2 = new Person();
		System.out.println(p2.getName());
		
	} // main
}
