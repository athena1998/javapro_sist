package days14;

public class Ex01_02_01 {
	public static void main(String[] args) throws InterruptedException {

		int[][] m = new int[5][5];

		magicSquare(m);

		dispM(m);

	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {

		// 1 숫자의 위치
		m[0][2] = 1;
		int index = 1;
		int nextRow, nextCol;
		int row = 0; // 첫 번째 행
		int col = m[0].length/2; // 가운 데 열
		m[row][col] = index++;

		while (index <= m.length*m[0].length) {

			//	Thread.sleep(500);


			// 1. 열 증가 , 행 감소
			nextCol = col + 1;
			nextRow = row - 1;

			// 2. 행 벗어난 경우  row=0   감소  row=-1
			if (nextRow == -1) {
				nextRow = m.length-1;
			}

			// 3. 열 벗어난 경우
			if (nextCol== m[0].length) {
				nextCol = 0;
			}

			// 4. 그 다음 위치에 값이 있는 경우
			if (m[nextRow][nextCol] != 0) {
				nextRow = row+1;
				nextCol = col;
			}

			System.out.println("index  " + index);

			System.out.printf("가로 : %d, 세로 : %d\n" , nextRow, nextCol);
			System.out.println();

			col = nextCol;
			row = nextRow;

			m[row][col] = index;

			index++;

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
