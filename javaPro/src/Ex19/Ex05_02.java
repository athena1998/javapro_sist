package Ex19;

public class Ex05_02 {
	public static void main(String[] args) {
		
		/* [1]
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		} // for i
		long end = System.nanoTime();
		System.out.println("처리시간 : " + (end-start));
		*/
		
		// [2]
		// testString();
		
		// [3]
		testStringBuffer();
		
		
	} // main

	private static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < 1000000; i++) {
			s.append("a");
		} // for i
		long end = System.nanoTime();
		System.out.println("처리시간 : " + (end-start));
		
	}

	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 1000000; i++) {
			s += "a";
		} // for i
		long end = System.nanoTime();
		System.out.println("처리시간 : " + (end-start));
		
	}

}
