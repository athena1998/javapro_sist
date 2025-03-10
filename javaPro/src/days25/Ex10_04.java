package days25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Ex10_04 {
	public static void main(String[] args) {

		String path = ".\\src\\days24";
		File f = new File(path);
		File[] lists = f.listFiles();
		String str;

		for (File file : lists) {
			if (file.isFile()) {
				try(FileReader reader = new FileReader(file);
						BufferedReader br = new BufferedReader(reader)) {
					int index = 1;
					while ((str = br.readLine()) != null ) {
						if(str.contains("HashMap")) {
							System.out.println(str.trim());
							System.out.printf("파일 명 : %s, 라인번호 : %d\n", file.getName(), index++);
						}

					} // while

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} // if
		}
	} // main

}
