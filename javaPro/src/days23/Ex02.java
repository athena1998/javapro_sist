package days23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {

		int [][] bingo = new int[5][5];

		// 중복 허용 X : 순서 유지 O : 컬렉션 클래스 => LinkedHashSet
		// 1 - 25 정수를 채워넣기

		// hashSet -> bingo 옮기는 작업

		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 1; i <=25; i++) {
			al.add(i);
		} // for i
		
		System.out.println(al);
		
		Random rnd = new Random();
		while (!al.isEmpty()) {
			int index = rnd.nextInt(al.size());
			int n = al.remove(index);
			bingo[index/5][index%5] = n;
			System.out.print(bingo[index/5][index%5] + " ");

		} // while
		
		
		// hashSet 의 사이즈가 클수록 while 문을 몇번 돌려야할지 몰라 시간이 비효율적으로 오래걸릴수 있다.
//		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
//		while (hashSet.size() < 25) {
//			hashSet.add(rnd.nextInt(25)+1);
//		} // while

//		Iterator<Integer> it = al.iterator();
//		
//		while (it.hasNext()) {
//			for (int i = 0; i < bingo.length; i++) {
//				for (int j = 0; j < bingo[i].length; j++) {
//					bingo[i][j] = (int) it.next();
//					System.out.print(bingo[i][j] + "\t");
//				} // for j
//				System.out.println();
//			} // for i
//		}

	} // main

}
