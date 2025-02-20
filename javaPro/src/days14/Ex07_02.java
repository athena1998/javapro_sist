package days14;

public class Ex07_02 {
	public static void main(String[] args) {

		int x = 10, y = 20;

		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;

		System.out.printf("> 1 x=%d, y=%d\n", p1.x, p1.y);
		swap( p1 ); // Call By Reference
		System.out.printf("> 2 x=%d, y=%d\n", p1.x, p1.y);

	} // main

	private static void swap(Point p1) {
		System.out.printf("> 3 x=%d, y=%d\n", p1.x, p1.y);
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
		System.out.printf("> 4 x=%d, y=%d\n", p1.x, p1.y);
	}



	private static void swap(int[] m) {
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
		int temp = m[0];  
		m[0] = m[1];         
		m[1] = temp;     
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
	}

	private static void swap(int x, int y) {
		System.out.printf("> swap x=%d, y=%d\n", x, y);
		int temp = x;  
		x = y;         
		y = temp;        
		System.out.printf("> swap x=%d, y=%d\n", x, y);
	}

} // class

class Point {
	int x;
	int y;



}
















