package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오전 10:40:26
 * @subject 메모리 스트림
 * 			주로 다른 곳에 입 출력 하기전에 메모리 상의 데이터를 
 * 			임시로 저장해서 사용할 목적인 스트림
 * 
 * 			byte - ByteArrayInputStream (input)  / ByteArrayOutputStream (output)
 * 			char - CharArray (read)  / (write)
 * 			String - StringReader (read)  / StringWriter (write)
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		byte[] buf = {1,43,5,2,5,7,4,2,5,7,8};
		
		try(ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
			int b;
			while ( ( b = bais.read()) != -1) {
//				System.out.println(b);
//				System.out.println(String.format("%08d", Integer.parseInt(Integer.toBinaryString(b))));
				
				baos.write(b);
				
			} // while
			
			byte[] outBuf = baos.toByteArray();
			System.out.println(Arrays.toString(outBuf));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	} // main

}
