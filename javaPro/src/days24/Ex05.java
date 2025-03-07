package days24;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex05 {
	public static void main(String[] args) {

		Properties p = new Properties();

		// [1] 			//드라이브 망    포트 번호
		String className = 	"oracle.jdbc.driver.OracleDriver";            
		String url = 		"jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = 		"scott";                                                                   
		String password = 	"tiger";


		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);

		/*
	    String fileName = "oracle.properties";
	    try(FileWriter fw = new FileWriter(fileName)) {
	    	String comments = "Oracle ConnectionString";
	    	p.store(fw, comments);
	
		} catch (Exception e) {
			System.out.println(e.toString());
	
		}
		 */
		String fileName = "oracle.xml";
		try(FileOutputStream fos = new FileOutputStream(fileName)) {
			String comments = "Oracle ConnectionString";
			p.storeToXML(fos, comments);

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println("end");

	} // main

}


