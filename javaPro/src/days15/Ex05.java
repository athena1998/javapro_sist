package days15;

import java.util.Scanner;

/**
 * @author junginn
 * @date : 2025. 2. 21. - 오후 2:02:42
 * @subject private 로 필드를 선언한 후 필드에 접근하는 방법
 * 			getter, setter
 * 			
 * @content
 */
public class Ex05 {
	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person();
		p1.setAge(20);
		
		// 나이를 키보드로부터 얻어와서 설정
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int age =  sc.nextInt();
		
		p1.setAge(age);
		
		System.out.println(p1.getAge());
		
		
		
	} // main

}
