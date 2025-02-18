package days12;

public class Ex08 {
	public static void main(String[] args) {
		
//		int[] arr = new int[8];
//		System.out.println(arr.length);
//		
//		dispM(arr);
		
		int[][] arr = new int[4][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		
		dispM(arr);
		
	} // main

	private static void dispM(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d ", i,j, arr[i][j]);
			} // for j
			System.out.println();
		} // for i
	}

	private static void dispM(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d ", i, arr[i]);
		} // for i
		System.out.println();
		
	}

}
