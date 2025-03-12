package days27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author junginn
 * @date : 2025. 3. 12. - 오전 11:05:09
 * @subject	함수형 인터페이스 + 컬렉션 프레임워크
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		} // for i
		
		// list의 모든 요소 출력
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + "/");
//			}
//		});
		list.forEach((t)  -> System.out.print(t + "/"));
		System.out.println();
		
		// list 	2의 배수 및 3의 배수 제거
		// (t) 매개변수 한개일땐 괄호 생략가능
		list.removeIf(t -> t%2 == 0 || t%3 == 0);
		list.forEach((t)  -> System.out.print(t + "/"));
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		System.out.println();
		
//		map.forEach(new BiConsumer<String, String>() {
//
//			@Override
//			public void accept(String key, String value) {
//				System.out.println(key + " " + value);
//			}
//		});
		
		map.forEach((key, value) -> System.out.println(key + " " + value));
		
	} // main

}
