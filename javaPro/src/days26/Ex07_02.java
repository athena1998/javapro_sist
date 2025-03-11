package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex07_02 {
	
	public static void main(String[] args) {

		// 파일에다가 읽기 작업
		String name = ".\\src\\days26\\Child.txt";
		try (FileInputStream fis = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(fis);){
			
			Child t = (Child) ois.readObject();
			
			System.out.println(t.name);
			System.out.println(t.age);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main

}
