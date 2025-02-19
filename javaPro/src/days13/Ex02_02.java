package days13;

public class Ex02_02 {
	public static void main(String[] args) {

		int[][][] m = new int[2][3][4];

		dispM(m);

	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d면]\n", i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf(" [%d행][%d열]\n", i, j);
				for (int z = 0; z < m[i][j].length; z++) {
					System.out.printf("  [%d][%d][%d]", i,j,z);
				} // for z
				System.out.println();
			} // for j
			System.out.println();
		} // for i
	}

}
