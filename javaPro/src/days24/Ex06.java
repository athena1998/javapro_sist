package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex06 {
	public static void main(String[] args) {

		/*
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		 */
		
		Properties p = System.getProperties();
		
		// 모든 키값 Enumeration 열거자로 반환
		Enumeration<String> e = (Enumeration<String>) p.propertyNames();
		
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n", key, value);
		}

	} // main

}
