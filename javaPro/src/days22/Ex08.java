package days22;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 3:45:51
 * @subject	Enumeration 열거자
 * 			Iterator 반복자
 * 			ListIterator 반복자
 * 			= 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
 * 			Iterator에 기능이 향상된게 ListIterator 이다
 * 			  ㄴ 양방향 조회기능이 추가
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list);
		ListIterator lt = list.listIterator();
		
		while (lt.hasNext()) {
			String str = (String) lt.next();
			System.out.println(str);
		}
		
		System.out.println("-".repeat(50));
		
		while (lt.hasPrevious()) {
			String prevStr = (String) lt.previous();
			System.out.println(prevStr);
		}
		System.out.println("-".repeat(50));
		
	} // main

}
