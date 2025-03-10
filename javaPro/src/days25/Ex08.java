package days25;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author junginn
 * @date : 2025. 3. 10. - 오후 2:01:19
 * @subject	Sequence inputStream 순차적인 바이트 스트림
 * 				ㄴ 여러개의 스트림을 연속적으로 연결해서 하나의 스트림으로
 * 					처리할 수 있는 바이트 스트림
 * @content
 */
public class Ex08 {
	public static void main(String[] args) throws IOException {
		
		byte[] n = {1,2,3};
		byte[] m = {4,5,6};
		byte[] l = {7,8,9};
		
		// 각각의 byte -> 메모리 스트림 3개로 생성
		// 일ㄺ -> SequenceStream
		
		ByteArrayInputStream bais1 = new ByteArrayInputStream(n);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(m);
		ByteArrayInputStream bais3 = new ByteArrayInputStream(l);
		
//		SequenceInputStream seq = new SequenceInputStream(bais1, bais2);
//		SequenceInputStream seq2 = new SequenceInputStream(seq, bais3);
		
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(bais1);
		v.add(bais2);
		v.add(bais3);
		
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int b;
		while((b = sis.read()) != -1) {
			System.out.println(b);
		}
	
		
		
	} // main

}
