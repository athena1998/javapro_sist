package days16;

public class Ex11 {
	/*
	 [ 상속 계층도 ]

                 Object            모든 클래스의 최상위 부모 클래스이다. 
                   ↑                
                Employee           
           ↑                  ↑
         Regular             Temp
           ↑
        SalesMan   
        
        1. 상속성 정리
        2. 다형성 / 인터페이스
        3. 업캐스팅 / 다운캐스팅
        4. 오버로딩 / 오버라이딩
        5. 추상화 (추상메소드, 추상클래스)
        6. this, super 키워드 설명
        7. final 키워드 설명
        
	 */
	
	public static void main(String[] args) {
		
		// 1. 사원 객체 생성 후 사원정보 출력 메소드 호출
//		Employee emp1 = new Employee("kim", "서울시 강남구", "010-1123-1231", "2020.01.01");
//		emp1.dispEmpInfo();
		
		// 2. 정규직 사원 객체 생성 + 호출
//		Regular emp2 = new Regular("lee", "서울시 강남구", "010-5445-2322", "2023.12.14", 3000);
//		System.out.printf("급여 : %d만원\n", emp2.getPay()); 
//		emp2.dispEmpInfo();
		
		// [클래스들 간의 형변환]
		// 자동 업캐스팅 (upcasting) : 자식객체 생성->부모클래스에 참조
		// Regular -> 자동 Employee 클래스 간에 행변환
		Employee emp2 = new Regular("lee", "서울시 강남구", "010-5445-2322", "2023.12.14", 3000);
		
		// 자식객체 reqular의 dispEmpInfo 호출
		emp2.dispEmpInfo();
		
		
		
		
		
		
		
		
		
		
		
	} // main
	
	
}
