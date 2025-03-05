package days22;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		
		ArrayList<String> team1 = new ArrayList<String>();
		team1.add("aaa");
		team1.add("bbb");
		team1.add("ccc");
		ArrayList<String> team2 = new ArrayList<String>();
		team1.add("ddd");
		team1.add("eee");
		team1.add("fff");
		ArrayList<String> team3 = new ArrayList<String>();
		team1.add("ggg");
		team1.add("hhh");
		team1.add("iii");
		
		ArrayList<String> class5 = new ArrayList<String>(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		
		System.out.println(class5);
		
		// team1 과 team2 중에서 공통적인 요소만 남기는 메소드
		// team1.retainAll(team2);
		
		// ArrayList -> 배열
		Object[] arr = class5.toArray();
		
		// 하나의 컬렌션 요소를 전부 삭제
		class5.removeAll(team3);
		
	} // main

}
