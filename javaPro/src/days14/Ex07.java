package days14;

public class Ex07 {
	public static void main(String[] args) {
		
		// 클래스 복사 복제
		Tv t1 = new Tv();
		
		// 클래스 복제
		Tv t2 = new Tv();
		t2.channel = t1.channel;
		t2.power = t1.power;
		t2.color = t1.color;
		
		Tv t3 = t1;
		t1.color = "red";
		System.out.println(t1.color);
		System.out.println(t3.color);
		
		objectColor(t1);
		System.out.println(t1.color);
		
	} // main

	private static void objectColor(Tv t) {
		t.color = "blue";
		
	}

}
