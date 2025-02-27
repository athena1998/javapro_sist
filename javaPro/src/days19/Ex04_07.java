package days19;

import java.util.Arrays;

public class Ex04_07 {
	public static void main(String[] args) {
		
		String message = "TODO Auto-generated method stub";
		
		// string -> byte[]
		byte[] messageArr = message.getBytes();
		System.out.println(Arrays.toString(messageArr));
		
		// byte[] -> String
		message = new String(messageArr);
		System.out.println(message);
		
	} // main


}
