package days16;

public class Regular extends Employee {
	
	private int basePay;
	
	

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	public Regular() {
		System.out.println("Regular 기본 생성자 호출"); 
	}


	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		// 부모의 필드 초기화 x -> super() 로 부모의 생성자 호출
		super(name, addr, tel, hiredate);
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.hiredate = hiredate;
		this.basePay = basePay;
		System.out.println("Regular 생성자 호출");
	}

	// Employee 에는 없는 급여계산하는 메소드 추가
	 public int getPay() {
		 return this.basePay; // 정규직은 기본 급여
	 }

	// 오버라이딩하여 dispEmpInfo 에 급여정보까지 출력
	@Override
	public void dispEmpInfo() {
		// TODO Auto-generated method stub
		super.dispEmpInfo();
		System.out.printf(" 급여 : %,d만원\n", this.basePay); 
	}
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
