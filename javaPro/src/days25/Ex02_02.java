package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오전 10:26:56
 * @subject	바이트 스트림 사용- 파일(.exe) 복사
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {

		String fileName = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFileName = ".\\copyBandizip.exe";

		fileCopy_byteStream(fileName, copyFileName);


	} // main

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();
		int code;

		final int BUFFER_SIZE = 1024;

		try(FileInputStream reader = new FileInputStream(source);
				FileOutputStream writer = new FileOutputStream(target);
				BufferedInputStream br = new BufferedInputStream(reader, BUFFER_SIZE);
				BufferedOutputStream bw = new BufferedOutputStream(writer, BUFFER_SIZE)) { // BufferedWriter 보조스트림

			// 버퍼 크기 만큼 읽기 = 1024
			// 읽어온 값 저장
			byte [] bbuf = new byte[BUFFER_SIZE];

			// 실제 읽어온 문자 수
			int n = -1;

			while ((n = br.read(bbuf)) != -1  ) {
				bw.write(bbuf, 0, n);
			} // while

			bw.flush();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();

		// 처리시간 : 642800
		System.out.println("처리시간 : " + (end-start));

	}
}
