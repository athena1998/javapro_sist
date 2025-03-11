package days26;

import java.io.File;

/**
 * @author junginn
 * @date : 2025. 3. 11. - 오전 10:31:37
 * @subject days25\Ex10_05.java 참고
 * @content
 */
public class Ex03 {
	/*
	 * javaPro 폴더
	 * 	ㄴ temp 폴더 생성
	 * 		ㄴ 1조 폴더 생성
	 * 		ㄴ 2조 폴더 생성
	 * 		ㄴ 3조 폴더 생성
	 * 
	 * javaPro 에 temp 폴더 삭제
	 * 		
	 */
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File root = new File(path);
		File create = new File(root, "temp");
		
		
		if (!create.exists()) {
			create.mkdirs();
			for (int i = 1; i <= 3; i++) {
				createGroup(i, create);
			} // for i
		} else {
			 File temp = new File(".\\temp"); 
		     directoryDelete(temp);

		}
		
		
		
		
		
	} // main

	private static void directoryDelete(File f) {
	      while(  !f.delete() ) {
	         // 하위 목록 
	          File[] list =    f.listFiles();
	          for (int i = 0; i < list.length; i++) {            
	             if(  list[i].delete() ) {
	                System.out.printf( "%s 삭제 완료!!!\n", list[i] );
	             }else {
	                // 하위 폴더 존재
	                directoryDelete(list[i]);
	             } 
	         }
	      }  
	   }



	private static void createGroup(int i, File parent) {
		File sub = new File(parent, i+"조");
		sub.mkdirs();
	}
	
}
