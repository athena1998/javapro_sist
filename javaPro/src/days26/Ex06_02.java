package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex06_02 {
	
	public static void main(String[] args) {

		// 파일에다가 읽기 작업
		String name = ".\\src\\days26\\userinfo.txt";
		try (FileInputStream fis = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(fis);){
			
			UserInfo u1 = (UserInfo) ois.readObject();		
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main

}
