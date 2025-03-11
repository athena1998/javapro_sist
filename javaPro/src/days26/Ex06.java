package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author junginn
 * @date : 2025. 3. 11. - 오후 2:19:57
 * @subject 직렬화
 * 			ㄴ 객체를 입출력하기 위해 스트링 문자열로 만드는 것
 * 			역직렬화
 * 			ㄴ 문자열 -> 객체
 * 
 *			객체에서는 객체를 입/출력하는 바이트 스트림 제공
 *			ObjectInputStream
 *			ObjectOutputStream
 * @content
 */
public class Ex06 {
	
	public static void main(String[] args) {
		UserInfo user1 = new UserInfo("홍길동", "1234", 20);
		UserInfo user2 = new UserInfo("김길동", "1374", 23);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(user1);
		list.add(user2);
		
		// 파일에다가 쓰기 작업
		String name = ".\\src\\days26\\userinfo.txt";
		try (FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			
			// java.io.NotSerializableException
			oos.writeObject(user1);
			oos.writeObject(user2);
			oos.writeObject(list);
			
			oos.flush();
		
			System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main

}
