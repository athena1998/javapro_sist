package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.util.FileUtil;

public class Ex04 {
	public static void main(String[] args) {

		String parent = ".\\src\\days26";
		String child = "시간표.pdf";

		File f = new File(parent, child);
		System.out.println("파일 크기 : " + f.length() + " (bytes)");
		final int VOLUME = 1024*50; // 50KB
		
		// 시간표.pdf
		// 시간표_1.pdf
		
		// 파일명 = 순수 파일명 / 확장자 분리
		
		String baseName = FileUtil.getBaseName(child);
		String ext = FileUtil.getExtension(child);
		
		// 바이트 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int code = 0;
		int i=0;
		int index = 0; // 시간표-1/2/3/4.pdf
		
		try(FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis); ) {
			
			while ((code = bis.read()) != -1) {
				
				if (i % VOLUME == 0) {
					if (i != 0) {
						bos.close(); // 처음은 닫을 필요 없음
					} // if
					
					child = String.format("%s-%d%s", baseName, ++index, ext);
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				} // if
				
				bos.write(code);
				i++;
				
			} // while
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("end");
		
	} // main

}
