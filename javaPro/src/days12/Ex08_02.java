package days12;

public class Ex08_02 {
	public static void main(String[] args) {
		
		int[][][] arr3 = new int[2][3][4];
		dispM(arr3);
		
	} // main

	private static void dispM(int[][][] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("[%d]면\n", i);
			for (int j = 0; j < arr3[i].length; j++) {
				for (int k = 0; k < arr3[i][j].length; k++) {
					System.out.printf("arr3[%d][%d][%d] = %d ", i,j,k, arr3[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
		
	}

}
