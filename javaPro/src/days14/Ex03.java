package days14;

public class Ex03 {
	
	public static void main(String[] args) {
		// 변수 참조변수 배열명
		int[] m;
		
		// 변수 선언 형식
		// Car : 클래스 (설계도)
		// myCar : 지역변수, 참조변수, 객체
		// 인스턴스 : new 연산자 클래스의 객채가 실제 힙 영역애 생성된 것
		Car myCar = new Car();
		myCar.name = "k9";
		myCar.dispCarInfo();
		
		System.out.println(myCar.name);
		
	} // main
	

}
