package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		
		String file = System.getProperty("user.dir") +  "\\src\\days18\\학생명단.txt";
		
		try (FileReader reader = new FileReader(file);) {
			int one;
			int lineNumber = 1;
			System.out.printf("[%d] ", lineNumber++);
			while ((one = reader.read()) != -1) {
				System.out.print((char) one);
				
				if(one == 10) {
					System.out.printf("[%d] ", lineNumber++);
				}
			} // while
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	} // main

}
