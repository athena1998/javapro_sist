package days14;

public class Ex06 {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		t1.power();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		System.out.println("end");
		
	} // main

}

// The public type Tv must be defined in its own file
// Ex06.java 자바파일을 생성하면 자바파일 안에는 반드시 하나의 
// public 선언된 클래스 파일이 있어야한다 
// public이 두개 이상이면 안됨
class Tv {
	
	// 지역변수는 접근지정자를 붙일 수 없다.
	public String color;
	boolean power = false;
	public int channel = 11;
		
	public void power() {
		power = power;
	}

	public void channelUp () {
		channel++;
	}
	
	public void channelDown () {
		channel--;
	}
	
	
	
} // tv
