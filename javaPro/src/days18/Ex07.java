package days18;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		
		// Unhandled exception type IOException
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 1. UnChecked 예외
		 *    RuntimeException 및 자식 예외클래스들은
		 * 	  컴파일러가 예외처리를 확인하지 않은 예외이다.
		 *    public class ArithmeticException extends RuntimeException
		 *    
		 * 2. Checked 예외
		 *    그 외 모든 exception 클래스들은 컴파일러가 
		 * 	  예외처리를 확인하는 예외이다.
		 *    class IOException extends Exception
		 */
		
	} // main

}
