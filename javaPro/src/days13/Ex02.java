package days13;

public class Ex02 {
	public static void main(String[] args) {
		
//		int[] m = new int[3];
//		m[0] = 1;
//		m[1] = 2;
//		m[2] = 3;
		
//		int[] m = new int[] {1,2,3};
		int[] m = {1,2,3};
		
		dispM(m);
		
	} // main

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		} // for i
	}

}
