package days13;

public class Ex09 {
	public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		
		/*
		 * [0][0]	[0][1]	[0][2]	[0][3]	[0][4]
		 * [1][0]							[1][4]
		 * [2][0]							[2][4]
		 * [3][0]							[3][4]
		 * [4][0]	[4][1]	[4][2]	[4][3]	[4][4]
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i*j][j] = 5*i+j+1;
				System.out.println(i + " " +j + i*j);
			} // for j
		} // for i
		
		dispM(m);
		
	} // main
	
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
