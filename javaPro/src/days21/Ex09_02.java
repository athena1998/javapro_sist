package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex09_02 {
	public static void main(String[] args) {

		// List ArrayList 컬렉션 클래스
		//		ㄴ 순서유지 가능, 중복 가능

		ArrayList list= new ArrayList();
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("park");
		list.add("jeong");

		// 모든 요소 출력
		// 1. for 문

		// 2. Iterator 사용 -> 반복자 객체
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}


	} // main

}
