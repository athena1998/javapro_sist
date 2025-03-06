package days23;

import java.util.TreeSet;

public class Ex05_03 {
	public static void main(String[] args) {
		
		int[] score = {80, 95, 65, 54,12,76,23,78,12,98};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} // for i
		
		System.out.println(ts);
		
		
		// 50 ~ 80
		System.out.println(ts.subSet(50, 80));
		
		// 75 이상
		System.out.println(ts.tailSet(75));
		
		// 75 미만
		System.out.println(ts.headSet(75));
		
		// 내림차순
		System.out.println(ts.descendingSet());
//		ts.descendingIterator();
		
		
	} // main

}
