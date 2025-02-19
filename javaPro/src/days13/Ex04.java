package days13;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("로또 횟수 입력 : ");
		int turn = sc.nextInt();

		int[][] lotto = new int[turn][6];

		fillLotto(lotto, turn);

//		dispLotto(lotto);

	} // main

	private static void fillLotto(int[][] lotto, int turn) {

		// 중복처리를 한 여섯개의 숫자 람다식은 무조건 distinct() 륾 먼저 수행해서
		// 중복처리를 하고 난 후에 limit()로 숫자 여섯개를 출력해야됨
		// 순서 중요
		for (int i = 0; i < turn; i++) {
			lotto[i] = new Random().ints(1, 46)
					.distinct()
					.limit(6) 
					.toArray();
			dispLotto(lotto[i], i);
		} // for i

	}

	private static void dispLotto(int[] lotto, int turn) {
		System.out.printf("[%d 게임] : ", turn+1);
		for (int j = 0; j < lotto.length; j++) {
			System.out.printf("[%d] ",lotto[j]);
		} // for j
		System.out.println();

	}

	private static void dispLotto(int[][] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d 게임] : ", i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d] ",lotto[i][j]);
			} // for j
			System.out.println();
		} // for i
	}
}
