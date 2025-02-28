package days20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\Ex10.java";
		try(FileReader reader = new FileReader(fileName);) {
			int count;
			int[] countArr = new int[123];

			while ((count = reader.read()) != -1) {
				if ((count >= '0' && count <= '9') 
						|| (count >= 'a' && count <= 'z') 
						|| (count >= 'A' && count <= 'Z')) {
					int index = (int) count;
					countArr[index]++;
				} 
			} // while

			for (int i = 48; i < countArr.length; i++) {
				if ((i >= '0' && i <= '9')|| (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
					System.out.printf("%c (%d) : %s\n", (char) i, countArr[i], "#".repeat(countArr[i]));
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	} // main

}
