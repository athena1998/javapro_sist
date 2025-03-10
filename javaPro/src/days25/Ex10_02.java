package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_02 {
	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		
		File parent = new File(currentDirectory);
		
		String[] list = parent.list();
		
		File[] fileLists = parent.listFiles();
		
		for (File file : fileLists) {
			long l = file.lastModified();
			String pattern = "yyyy-‎MM-dd ‎E요일 ‏‎a hh:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			Date date = new Date(l);
			
			if (file.isFile()) {
				System.out.printf("\t[%s]\t%s\t%dKB\n", file.getName(), sdf.format(date), (int) (Math.ceil((double) file.length()/1024)));
			} else {
				System.out.println(file.getName());
			}
			
			
		}
		
	} // main
}
