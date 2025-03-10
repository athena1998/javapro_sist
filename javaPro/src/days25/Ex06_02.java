package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06_02 {
	public static void main(String[] args) {

		String name = null;
		int kor = 0, eng = 0, mat = 0;
		int tot = 0;
		double avg = 0;
		boolean gender = false;

		// 이 학생정보를 파일로 저장
		String fileName = ".\\student.txt";

		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {
			
			String line = null;
//			[1]
//			while ((line = br.readLine()) != null) {
//				String[] split = line.split(",");
//				name = split[0];
//				kor = Integer.parseInt(split[1].trim());
//				eng = Integer.parseInt(split[2].trim());
//				mat = Integer.parseInt(split[3].trim());
//				tot = Integer.parseInt(split[4].trim());
//				avg = Double.parseDouble(split[5].trim());
//				gender = Boolean.parseBoolean(split[6].trim());
//				String data = String.format("%s, %d, %d, %d, %d, %.2f, %b\n", name, kor, eng, mat, tot, avg, gender);
//				System.out.println(data);
//			} // while
			
			String pattern = "([가-힣]{2,}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([0-9.]{4,7}),(true|false)";

	         while ( (line = br.readLine()) != null  ) {

	            Pattern p = Pattern.compile(pattern);
	            Matcher m = p.matcher(line);

	            // m.matches()
	            // m.find() 
	            while ( m.find() ) {
	               name = m.group(1);
	               kor = Integer.parseInt( m.group(2) );
	               eng = Integer.parseInt( m.group(3) );
	               mat = Integer.parseInt( m.group(4) );
	               tot = Integer.parseInt( m.group(5) ); 
	               avg = Double.parseDouble( m.group(6) );
	               gender = Boolean.parseBoolean(m.group(7));
	               System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
	                     , name, kor, eng, mat, tot, avg, gender);
	            } // while
	         }// while



		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("end");

	} // main

}
