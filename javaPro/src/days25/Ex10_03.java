package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.util.FileUtil;

public class Ex10_03 {
	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		
		File parent = new File(currentDirectory);
		
		String[] list = parent.list();
		
		File[] fileLists = parent.listFiles();
		
		for (File file : fileLists) {
			String fileName = file.getName();
			if (file.isFile()) {
				String ext = FileUtil.getExtension(fileName);
				if (ext.equals(".dat")) {
					String pattern = "yyyy-‎MM-dd ‎E요일 ‏‎a hh:mm";
					SimpleDateFormat sdf = new SimpleDateFormat(pattern);
					Date date = new Date(file.lastModified());
					System.out.printf("[%s]\t%s\t%dKB\n", file.getName(), sdf.format(date), (int) (Math.ceil((double) file.length()/1024)));
					
				} // if
			} // if
		}
		
		System.out.println("-".repeat(50));
		
		File[] list1 = parent.listFiles((f) -> f.getName().endsWith(".dat"));
		Arrays.stream(list1).forEach((f) -> System.out.println(f.getName()));
		
	} // main
}
