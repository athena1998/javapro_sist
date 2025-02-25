package days16;

// 영업직 - 최종 클래스 
// 자식 클래스를 가질 수 없는 클래스
public class Salesman extends Regular{

	// 필드 : name, addr, tel, hiredate, basePay
	
	// getPay()
	// dispEmpInfo()
	
	private int sales;
	private int comm;
	
	
	public Salesman() {
		System.out.println("Salesman 기본 생성자 호출"); 
	}


	public Salesman(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		// 부모의 필드 초기화 x -> super() 로 부모의 생성자 호출
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("Salesman 생성자 호출");
	}

	@Override
	public int getPay() {
		return super.getPay() * this.sales * this.comm;
	}

	@Override
	public void dispEmpInfo() {
		System.out.printf(
	            "사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d"
	                  + " 판매량=%d, 커미션=%d\n"
	                  ,this.getName(), this.getAddr(), this.getTel()
	                  , this.getHiredate(), this.getBasePay()
	                  , this.sales, this.comm);
	}

}

// public class Salesman extends Regular
// 여기에 final 있으면 최종 클래스라는 의미이기 때문에
// 자식을 상속할 수 없다.
class SalesMan2 extends Salesman {
	
}










