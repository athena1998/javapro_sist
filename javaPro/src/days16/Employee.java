package days16;


// 사원이라면 공통적으로 가지고 있는 멤버들을 선언한 클래스
public class Employee {
	
	private String name;
	private String addr;
	private String tel;
	private String hiredate;
	
	
	public Employee() {
		System.out.println("기본 생성자 호출");
	}


	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("Employee 생성자 호출");
	}
	
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 주소 : %s, 연락처 : %s, 입사일자 : %s", 
				this.name, this.addr, this.tel, this.hiredate);
	}


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
