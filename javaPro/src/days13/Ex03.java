package days13;

/**
 * @author junginn
 * @date : 2025. 2. 19. - 오전 11:13:15
 * @subject 가변배열 
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		int[][] m = new int[3][];
		
		m[0] = new int[15];
		m[1] = new int[15];
		m[2] = new int[15];
		
		dispM(m);
		
	} // main
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d] = %d ", i, j, m[i][j]);
			} // for j
			System.out.println();
		} // for i
	}	

}
