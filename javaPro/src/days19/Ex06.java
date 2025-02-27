package days19;

import static java.lang.Math.*;
public class Ex06 {
	public static void main(String[] args) {
		
		/*
		System.out.println(PI); // 파이값
		System.out.println(E); // 자연상수
		
		System.out.println(ceil(45.175)); // 올림 반올림 말고 소수점에 숫자만 있으면 올림
		System.out.println(floor(45.975)); // 소수점에 숫자만 있으면 내림
		
		System.out.println(round(54.555));
		*/
		
		double b = 3.141592;
		
		System.out.println(round(b*100)/100.0);
		System.out.println(String.format("%.2f", b));
		
		
	} // main
}
