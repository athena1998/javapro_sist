package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex10_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("로또 횟수 입력 : ");
		int turn = sc.nextInt();

		fillLotto(turn);

	} // main


	private static void fillLotto(int turn) {

		Random rnd = new Random();
		for (int i = 1; i <= turn; i++) {
			HashSet<Integer> lotto = new HashSet<Integer>(6);
			while (lotto.size() < 6) {
				int num = rnd.nextInt(45)+1;
				lotto.add(num);
			} // while
			
			dispLotto(lotto, i);
		} // for i
	}

	private static void dispLotto(HashSet<Integer> lotto, int i) {
		System.out.printf("[%2d게임] : ", i);

		ArrayList<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			int printnum = (int) it.next();
			System.out.printf("[%02d] ", printnum);
		}
		
		System.out.println();
	}

}
