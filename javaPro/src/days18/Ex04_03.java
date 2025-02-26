package days18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ex04_03 {
	public static void main(String[] args) {

		String[] s = {"kbs", "sbs", "mbc", "jtbc"};
		// 문자열 배열을 내림차순 정렬...      

		// [1]
		// Arrays.sort(s, Collections.reverseOrder());


		// [2]
		// StringCompartor c = new StringCompartor();
		// Arrays.sort(s, c);


		// [3]
		//	Arrays.sort(s, new Comparator<String>() {
		//		@Override
		//		public int compare(String o1, String o2) {
		//			return o2.compareTo(o1);
		//		}
		//	});

		// [4] 람다식 사용
		Arrays.sort(s, (o1, o2) ->  {
			return o2.compareTo(o1);
		});

		System.out.println(Arrays.toString(s));

		//		String a = "abC";
		//		String b = "abD";

		//		System.out.println(a.equals(b));
		//		System.out.println(a.equalsIgnoreCase(b));

		//		System.out.println(a.compareTo(b));
		//		System.out.println(b.compareTo(a));


	} // main

}

class StringCompartor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;


		return s2.compareTo(s1);
	}

}










