package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		
		// 배열 -> ArrayList
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		
//		ArrayList<String> list = new ArrayList<String>();
//		for (int i = 0; i < names.length; i++) {
//			list.add(names[i]);
//		}
		
		// String[] -> list
		List list = Arrays.asList(names);
		System.out.println(list);
		
		// list -> ArrayList
		ArrayList<String> lists = new ArrayList<String>(list); // 매개변수 다형성
		System.out.println(lists);
		
		
		String[] strArr = new String[lists.size()];
		// ArrayList -> String[]
		
		// [1]
//		for (int i = 0; i < lists.size(); i++) {
//			strArr[i] = lists.get(i);
//		} // for i
		
		
//		Object[] arr = lists.toArray();
//		for (Object obj : arr) {
//			String name = (String) obj;
//		}
		
//		String[] sArr = (String[]) lists.toArray();
		
//		String[] sArr = (String[]) lists.toArray(new String[lists.size()]);
//		System.out.println(Arrays.toString(sArr));
		String[] sArr = (String[]) lists.toArray(String[]::new);
		System.out.println(Arrays.toString(sArr));
		
		
		
	} // main

}
