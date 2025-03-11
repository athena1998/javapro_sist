package days26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex07 {
	public static void main(String[] args) {
		
		// Parent 부모클래스는 직렬화가 가능한 클래스로 선연 = implements Serializable
		// 부모가 직렬화가 가능하면 자식도 자동으로 직렬화가 됨
		// 부모 자식 필드 전부 포함
		
		// 자식이 직렬화일때 부모의 필드는 포함되지 않음
		
		
		String name = ".\\src\\days26\\Child.txt";
		try (FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			Child c = new Child();
			c.name = "홍길동";
			c.age = 20;
			
			oos.writeObject(c);
			
			oos.flush();
			System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main

}

class Parent {
	String name; // 부모의 필드는 직렬화에서 제외
	
}

class Child extends Parent implements Serializable{
	int age;
	
	// 직접 직렬화 대상에 추가 (쓰기)
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(name);
		oos.defaultWriteObject();
	}
	
	// 직접 직렬화 대상에 추가 (읽기)
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		
		name = ois.readUTF();
		ois.defaultReadObject();
	}
	
}


//class Parent implements Serializable {
//	String name;
//	
//}
//
//class Child extends Parent {
//	int age;
//}
