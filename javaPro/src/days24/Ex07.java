package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author junginn
 * @date : 2025. 3. 7. - 오후 2:01:12
 * @subject Collections
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		// 오른쪽 두 칸씩 이동
//		Collections.rotate(list, 2);
//		System.out.println(list);
		
		// 0번째 오소 두번째 요소 자리 교환
//		Collections.swap(list, 0, 2);
//		System.out.println(list);
		
		// 배열요소 랜덤으로섞기
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 3);
		System.out.println(index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 0);
		System.out.println(list);
		
		Collections.replaceAll(list, 0, 100);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.copy(list, list2);
		System.out.println(list2);
		
		
	} // main

}
