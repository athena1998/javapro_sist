package days16;

// 임시직 사원 클래스
public class Temp extends Employee{

	// Employee 클래스 필드 사용가능 
	// 필드 : name, addr, tel, hiredate, basePay
	private int days;		// 근무일 수
	private int dayOfDay;	// 하루 일당

	public Temp() {
		System.out.println("Temp 기본 생성자 호출");
	}

	public Temp(String name, String addr, String tel, String hiredate, int days, int dayOfDay) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.dayOfDay = dayOfDay;

		System.out.println("Temp 생성자 호출");
	}

	@Override
	public void dispEmpInfo() {
		// TODO Auto-generated method stub
		super.dispEmpInfo();
		System.out.printf(" 출근일수 : %d, 일당 : %d만원\n", this.days, this.dayOfDay); 
	}

	// Employee 에는 없는 급여계산하는 메소드
	public int getPay() {
		return this.days * this.dayOfDay; // 임시직은 일당지급제
	}
	
	
	


}
