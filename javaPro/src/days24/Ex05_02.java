package days24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Properties;

public class Ex05_02 {
	public static void main(String[] args) {

		Properties p = new Properties();

		// [1] 			//드라이브 망    포트 번호
		String className;            
		String url;                  
		String user;                                                                   
		String password;


		/*
		String fileName = "oracle.properties";
		    try(FileReader reader = new FileReader(fileName);) {

		    	p.load(reader);
		    	System.out.println(p.getProperty("className"));
		    	System.out.println(p.getProperty("url"));
		    	System.out.println(p.getProperty("user"));
		    	System.out.println(p.getProperty("password"));

			} catch (Exception e) {
				System.out.println(e.toString());

			}
		 */
		
		String fileName = "oracle.xml";

		try(FileInputStream fis = new FileInputStream(fileName)) {

			p.loadFromXML(fis);
			System.out.println(p.getProperty("className"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

}