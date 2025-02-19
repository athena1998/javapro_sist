package days13;

public class Ex07 {
	public static void main(String[] args) {

		int[][] m = new int[5][5];

		//		fillM01(m);

		//		fillM02(m);

		//		fillM03(m);

		fillM04(m);

		dispM(m);

	} // main

	private static void fillM04(int[][] m) {
		/*
	       		0열 1열 2열 3열 4열
		   0행 [ 5][10][15][20][25]
		   1행 [ 4][ 9][14][19][24]
		   2행 [ 3][ 8][13][18][23]
		   3행 [ 2][ 7][12][17][22]
		   4행 [ 1][ 6][11][16][21]
		 */
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) { 
				m[4-j][i] = 5*i+j+1;
			} // for j
		} // for i
		
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) { 
//				m[i][j] = (5-i)+j*5;
//			} // for j
//		} // for i

	}

	private static void fillM03(int[][] m) {
		/*
		 * 1 2 3 4 5 
		 * 10 9 8 7 6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 
		 */

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) { 
				if (i % 2 == 0) {
					m[i][j] = 5*i+j+1;
				}else {
					m[i][4-j] = 5*i+j+1;
				}
			} // for j
		} // for i

	      for (int i = 0; i < m.length; i++) {           // 행크기          
	          for (int j = 0; j < m[i].length; j++) {    // 열크기 
	             m[i][j] = i%2==0 ?5*i+j+1:5*(i+1)-j; 
	          } // for j
	       } // for i
	       


	}

	private static void fillM02(int[][] m) {
		/*
		 * i=0 j=01234
		 * i=1 j=01234
		 * i=2 j=01234
		 * i=3 j=01234
		 * i=4 j=01234
		 */
		/* [1]
	      for (int i = 0, v = 25; i < m.length; i++) {           // 행크기          
	         for (int j = 0; j < m[i].length; j++, v--) {    // 열크기
	            // m[i][j]=v;
	            m[i][j] = (m.length*m[i].length) - ( m[i].length*i + j );
	         } // for j
	      } // for i
		 */

		// [2]
		/* 0 0  4 4
		 * 0 1  4 3
		 * 0 2  4 2
		 * 0 3  4 1
		 * 0 4  4 0
		 * 
		 * 1 0  3 4
		 * 1 1  3 3
		 * 1 2  3 2
		 * 1 3  3 1
		 * 1 4  3 0 
		 * */ 
		for (int i = 0; i < m.length; i++) {           // 행크기          
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				m[4-i][4-j] = 5*i+j+1;
			} // for j
		} // for i
	}

	private static void fillM01(int[][] m) {


		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (i+j+1)+((m.length-1)*i);
			} // for j
		} // for i

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
