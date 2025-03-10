package days25;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오후 2:10:51
 * @subject	PipedReader / PipedWriter
 * 			ㄴ스레드 간에 데이터를 주고벋을때 사용하는 스트림
 * 			RandomAccessFile
 * 			ㄴ파일의 어느위치에서나 읽기도 가능하고 쓰기도 가능한 장점이 있는 스트림
 * 			ㄴ 내부적으로는 DataInput, DataOutput 인터페이스를 구현
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		
//		String s = "I love normal java";
//		String p = "javabook";
//		
//		// 1. 테스트 
//		String name = "test.txt";
//		String node = "rw";
//		
//		try(RandomAccessFile raf = new RandomAccessFile(name, node)) {
//			
//			// 파일포인터 위치
//			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
//			raf.writeInt(100);
//			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
//			raf.writeLong(100);
//			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
//			raf.seek(4);
//			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		String s = "I love normal java";
		String p = "javabook";
		
		String name = "random.txt";
		String mode = "rw";
		
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			
			raf.seek(2);
			String limp = raf.readLine();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} 
		catch (Exception e) {
			// TODO: handle exception
		} 
		
	} // main

}
