package days25;

import java.io.File;

public class Ex10_05 {
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days25";
		File parent = new File(fileName);
		
		File upload = new File(parent, "upload");
		
		if (!upload.exists()) {
			// upload 폴더 생성
//			upload.mkdir();
			
			// 폴더를 만들때 그 폴더의 부모폴더도 같이 생성
			// 부모폴더도 없는데 mkdir 쓰면 오류남
			upload.mkdirs();
			
		} else {
			// 폴더 삭제
			upload.delete();
		}
		
	} // main

}
