package days14;

public class Ex01_02 {
	public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		
		magicSquare(m);
		
		dispM(m);
		
	} // main
	
	private static void magicSquare(int[][] m) {
		m[0][2] = 1;
		int index = 1;
		int row = 0;
		int col = 2;
		
		while (true) {
			
			col += 1;
			row -= 1;
			
			if ( col < 0 ) {
				col += m.length;
				System.out.print("col+++");
			} else if(col >= m.length ) {
				col -= m.length;
				System.out.print("col---");
			}
			
			if ( row < 0) {
				row += m.length;
				System.out.print("row+++");
			} else if(row >= m.length) {
				row -= m.length;
				System.out.print("row---");
			}
			
			if (m[row][col] > 0) {
				row += 1;
			} // if
			
			index++; 
			m[row][col] = index;
			
			System.out.println("index  " + index);
			
			System.out.printf("가로 : %d, 세로 : %d\n" , row, col);
			System.out.println();
			
			if (index >= 25) {
				break;
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
