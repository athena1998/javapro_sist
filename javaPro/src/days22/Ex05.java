package days22;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오전 11:38:51
 * @subject	Vector 컬렉션 클래스
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity()); // 용량
		System.out.println(v.size()); // 요소 개수
		
		v.addElement("kim");
		v.add("lee");
		
		System.out.println(v.size());
		
		v.trimToSize();
		System.out.println(v.capacity());
		
		v.add("park");
		System.out.println(v.capacity()); // 용량
		System.out.println(v.size()); // 요소 개수
		
//		v.ensureCapacity(10);
//		System.out.println(v.capacity());
		
		// 첫번째 요소 가져오기
		System.out.println(v.get(0));
		System.out.println(v.elementAt(0)); // 동기화 처리
		
		System.out.println("-".repeat(50));
		
		// 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String str = (String) en.nextElement();
			System.out.println(str);
		}
		
		// 열거자/반복자의 차이점
		// 반복자 : 반복적으로 요소를 처리 중에 요소거 수정삭제추가
		//			예외 발생시킴
		
		// 첫번째 요소
		v.firstElement();
		v.get(0);
		v.elementAt(0);
		
		// 마지막 요소
		v.lastElement();
		v.get(v.size()-1);
		
		v.trimToSize();
		
		
		
	} // main

}
