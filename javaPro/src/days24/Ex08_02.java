package days24;

import java.util.ArrayList;

public class Ex08_02 {
	public static void main(String[] args) {
		
		// 모든 자료형 타입을 object로 선언했을때
//		Box box = new Box();
//		box.setItem(10);
//		int item = (int) box.getItem();
//		System.out.println(item);
//
//		Box box3 = new Box();
//		box3.setItem("box");
//		String item1 = (String) box3.getItem();
//		System.out.println(item1);
		
		
		Box<Integer> box1 = new Box<>();
		box1.setItem(10);
		int item = box1.getItem();
		System.out.println(item);
		
		Box<String> box2 = new Box<>();
		box2.setItem("aaa");
		String item2 = box2.getItem();
		System.out.println(item2);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
 		
		
	} // main

}

// 제네릭 클래스
// ㄴ 클래스 명 뒤에 <T>를 붙이면 된다
// ㄴ T를 타입변수 또는 타입 매개변수
//		Type = 자료형
//		Key
//		Value
//		Element 등등
//	ㄴ Box

class Box<T> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}

// 오브젝트 클래스
//class Box {
//	
//	private Object item;
//
//	public Object getItem() {
//		return item;
//	}
//
//	public void setItem(Object item) {
//		this.item = item;
//	}
//}

//class Box {
//	
//	private int item;
//
//	public Box(int item) {
//		super();
//		this.item = item;
//	}
//
//	public Box() {
//		super();
//	}
//
//	public int getItem() {
//		return item;
//	}
//
//	public void setItem(int item) {
//		this.item = item;
//	}
//}
//
//class Box2 {
//	
//	private double item2;
//
//	public Box2(double item2) {
//		super();
//		this.item2 = item2;
//	}
//
//	public Box2() {
//		super();
//	}
//
//	public double getItem2() {
//		return item2;
//	}
//
//	public void setItem2(double item2) {
//		this.item2 = item2;
//	}
//	
//}
//
//class Box3 {
//	
//	private String item3;
//
//	public Box3(String item3) {
//		super();
//		this.item3 = item3;
//	}
//
//	public Box3() {
//		super();
//	}
//
//	public String getItem3() {
//		return item3;
//	}
//
//	public void setItem3(String item3) {
//		this.item3 = item3;
//	}
//	
//}