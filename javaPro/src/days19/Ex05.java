package days19;

/**
 * @author junginn
 * @date : 2025. 2. 27. - 오후 2:16:20
 * @subject 1. StringBuffer
 * 			2. StringBuilder
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		
		String s = "TODO Auto-generated method stub";
		// StringBuffer sb = new StringBuffer(s); // 멀티스레드 o -> 동기화 되어있음
		
		int index = s.indexOf("Auto");
		int len = "auto".length();
		System.out.println(s.substring(0, index+len) + "[hi]" + s.substring(index+len));
		
		index = s.indexOf("method");
		len = "method".length();
		System.out.println(s.substring(0, index) + s.substring(index+len));
		
		
		StringBuilder sb = new StringBuilder(s); // 멀티스레드 x
		sb.insert(index+len, "[hi]");
		sb.delete(index, index+len);
		
		sb.replace(index, index+len-2, "METHOD");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		//Auto
		
	} // main

}
