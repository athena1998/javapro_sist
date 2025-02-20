package days14;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		
		whelk(m);
		
		dispM(m);
		
	} // main

	private static void whelk(int[][] m) {
		int n = 5; // 수행하는 횟수
		int row = 0, col = -1; // 행, 열 인덱스
		int v = 1;
		int sw = 0;
		
		while (true) {
			
			// 행 고정 		열증가 +1 / 열감소 -1 	
			for (int i = 0; i < n; i++) {
				col+= sw;
				System.out.printf("가로 %d,%d\n", row, col);
				m[row][col] = v++;
			}
			n--; //  수행하는 횟수 5->4->4->3->3->2->2->1->1
			
			if (n == 0) {
				break;
			} // if
			
			// 열 고정 		행증가 +1 / 행감소 -1 	
			for (int i = 0; i < n; i++) {
				row+=sw;
				System.out.printf("세로 %d,%d\n", row, col);

				m[row][col] = v++;
			}
			
			
		} // while
		
	}

	private static void dispM(int[][] m) {
		System.out.println("\t[0열]\t[1열]\t[2열]\t[3열]\t[4열]");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d열]\t", i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%d]\t", m[i][j]);
			} // for j
			System.out.println();
		} // for i
	}
}
