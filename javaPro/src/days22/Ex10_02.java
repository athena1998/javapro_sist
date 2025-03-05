package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.SortedSet;

public class Ex10_02 {
	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		
		fillLotto(lotto);
		dispLotto(lotto);
		
	} // main

	private static void dispLotto(HashSet lotto) {
		
		// set -> List 변환
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list);
		
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			int num = (int) it.next();
			System.out.printf("[%02d]", num);
		}
		
		
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n = 0;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while
	}

}
