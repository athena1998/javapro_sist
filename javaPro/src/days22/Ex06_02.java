package days22;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex06_02 {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("jeong");
		
		System.out.println(list);
		
		list.addFirst("kkk");
		list.addLast("ccc");
		
		list.add(3, "bbb");

		System.out.println(list);
		
		int index = list.indexOf("park");
		list.remove(index);
		
		System.out.println(list);
		
		System.out.println("-".repeat(50));
		
		// 내림차순으로 반복자 
		Iterator it = list.descendingIterator();
		
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		
		System.out.println("-".repeat(50));
		
		// 첫번째로 일치하는거 찾기
		list.removeFirstOccurrence("홍길동");
		
	} // main

}
