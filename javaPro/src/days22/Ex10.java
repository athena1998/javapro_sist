package days22;

import java.util.HashSet;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 4:12:45
 * @subject	Set : hashSet 컬렉션 클래스
 * @content
 */
public class Ex10 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(25);
		hs.add(null);
		
		// [1, 9, 25, 15]
		// 중복 불가 순서 유지 X
		System.out.println(hs);
		
	} // main

}
