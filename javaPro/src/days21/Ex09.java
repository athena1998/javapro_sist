package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Ex09 {
	public static void main(String[] args) {
		
		// List ArrayList 컬렉션 클래스
		//		ㄴ 순서유지 가능, 중복 가능
		
		ArrayList list= new ArrayList();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("park");
		list.add("jeong");
		System.out.println(list.size());

		System.out.println(list);
		
		list.add(2, "kkk");
		System.out.println(list);
		
		list.set(2, "ccc");	
		System.out.println(list);		
		
		list.trimToSize(); // 남은 공간 제거
		
//		int index = list.indexOf("lee");
//		System.out.println(index); // 없으면 -1 반환
		
		// 리스트에 park 삭제
//		int index = list.indexOf("park");
//		boolean isValid = list.contains("park");
//
//		if (isValid) {
//			System.out.println(list.remove(index));
//		} // if
//		
//		System.out.println(list);
		
//		int index = list.indexOf("park");
//		
//		while (index != -1) {
//			list.remove(index);
//			index = list.indexOf("park");
//		} // while
//
//		System.out.println(list);
//		
//		while (list.contains("park")) {
//			list.remove("park");
//		} // while
//		
//		System.out.println(list);
//
//		ArrayList removeList = new ArrayList();
//		removeList.add("park");
//		list.removeAll(removeList);
//		
//		System.out.println(list);
		
		// 람다와 스트림
//		Predicate<String> isNameCheck = (n) -> n.equals("park");
//		list.removeIf(isNameCheck);
		
//		list.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				// TODO Auto-generated method stub
//				return t.equals("park");
//			}
//			
//		});
//		
//		System.out.println(list);

//		list.removeIf((t) -> t.equals("park"));
//		System.out.println(list);

//		// 이름에 k로 시작하는 요소 삭제
//		list.removeIf((t) -> ((String) t).startsWith("k"));
//		System.out.println(list);
//		
//		// 이름에 k 들어있는 요소 삭제
//		list.removeIf((t) -> ((String) t).contains("k"));
//		System.out.println(list);
		
		
		// 이름 오름차순 / 내림차순
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("--------------------------");
		
		list.sort((o1, o2) -> ((String) o2).compareTo((String)o1) );
		System.out.println(list);
		
		List l = list.subList(0, 4);
		System.out.println(l);
		
		
		
		
	} // main

}
