package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		
		// 상대경로
		String pathName = ".\\src\\days25\\Ex01.java";
		File f = new File(pathName);
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length() + " (Bytes)");
		
		System.out.println(File.separator); // 경로의 구분자 "\"
		System.out.println(File.pathSeparator);
		
		String fileName = f.getName();
		System.out.println(fileName);
		
		int pos = fileName.indexOf(".");
		
		// 절대경로
		String baseFileName = fileName.substring(0, pos);
		System.out.println(baseFileName);
		
		String ext = fileName.substring(pos);
		System.out.println(ext);
		
		System.out.println("-".repeat(40));
		
		System.out.println(fileName = FileUtil.getFileName(f));
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));

		System.out.println("-".repeat(40));
		
		String pathName2 = "C:\\Class\\JavaClass\\javaPro\\src\\days25\\Ex01.java";
		File f2 = new File(pathName2);
		
		System.out.println(f.getPath());			// 경로
		System.out.println(f.getAbsolutePath());	// 절대 경로
		System.out.println(f.getCanonicalPath());	// 표준 경로
		
		System.out.println("-".repeat(40));
		
		System.out.println(f2.getPath());			// 경로
		System.out.println(f2.getAbsolutePath());	// 절대 경로
		System.out.println(f2.getCanonicalPath());	// 표준 경로
		
		System.out.println("-".repeat(40));
		
		File pf = f.getParentFile();
		System.out.println(pf);
		
		System.out.println(f.getParent());
		
		
		
	} // main
}
