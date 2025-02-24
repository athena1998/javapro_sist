package days16;

public class Member {
	String name = "홍길동"; // 명시적 초기화
	int age;
	int count;
	int serialNumber;
	static double rate;
	
	// 명시적초기화 > 생성자초기화 
	// 생성자가 오버로딩되어 있을때 중복 코드가 있다면 초기화 블록 사용
	// (인스턴스 초기화 블럭)
	
	{
		count++;
		serialNumber = count;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	// 클래스 초기화 블럭
	static {
		System.out.println("클래스 초기화 블럭");
		
	}
	
	// 생성자 초기화
	public Member () {
		count++;
		serialNumber = count;
		name = "무명";
		System.out.println("기본 생성자가 호출됨");
	}

	public Member(String string) {
		count++;
		serialNumber = count;
		this.name = name;
		System.out.println("m2 생성자가 호출됨");
		
	}
	

}
