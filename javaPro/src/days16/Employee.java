package days16;


// 사원이라면 공통적으로 가지고 있는 멤버들을 선언한 클래스
// 추상 클래스 : 객체를 생성할 수 없는 (불완전) 클래스 new Employee() 불가
// 미완성된 == abstruct
public abstract class Employee {
	
	private String name;
	private String addr;
	private String tel;
	private String hiredate;
	
	
	public Employee() {
		System.out.println("Employee 기본 생성자 호출");
	}


	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("Employee 생성자 호출");
	}
	
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 주소 : %s, 연락처 : %s, 입사일자 : %s\n", 
				this.name, this.addr, this.tel, this.hiredate);
	}
	
	// 가상 메소드 - 오버라이드 할때 틀만 되는 메소드
	// 몸체가 업슨 함수 원형 (prototype)만 있는 메소드
	// This method requires a body instead of a semicolon
	// 불완전한 메소드 : 추상메소드
	// The abstract method getPay in type Employee can only be defined by an abstract class
	public abstract int getPay();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
}
