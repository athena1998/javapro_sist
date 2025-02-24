package days15;

// 저축과 관련된 클래스
public class Save {

	// 인스턴스 변수
	private String name; // 예금주
	private int money; // 예금액

	// static(클래스) 변수 == 공유변수 == 정적변수
	// 프로그램 시작하자마자 메모리에 올라감
	private static double rate = 0.04; // 이자율

	public Save() {
		//		super();

	}

	// 3개 생성자
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	

	// 인스턴스 메소드 -> 객체가 생성되야 사용가능
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		// Cannot use this in a static context
		// this.rate = rate;
		Save.rate = rate;
	}


}
