package days24;

import java.util.ArrayList;

public class Ex08_04 {
	public static void main(String[] args) {

//		Box03<Fruit> fruitBox = new Box03<Fruit>();
//		/*
//		 * T 가 전부 Fruit 으로 변경됨
//		 * ArrayList<T> list = new ArrayList<>();
//			void add(T item) { this.list.add(item); }
//			T get(int i) { return this.list.get(i); }
//		 */
//		Box03<Apple> appleBox = new Box03<Apple>();
//		Box03<Grape> grapeBox = new Box03<Grape>();
//		Box03<Toy> toyBox = new Box03<Toy>();
//		
//		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
//		// Box03<Apple> appleBox2 = new Box03<Grape>();
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
		
		// The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy)
		// Toy는 Fruit 객체의 자식 아님 별개의 객체
		// fruitBox.add(new Toy());
		// toyBox.add(new Grape());


	} // main

}


// Fruit
// 	ㄴ Apple
//	ㄴ Grape
// Toy


//class Fruit {
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//class Apple extends Fruit {
//	public String toString() {
//		return "Apple";
//	}
//}
//
//
//class Grape extends Fruit {
//	public String toString() {
//		return "Grape";
//	}
//}
//
//class Toy {
//	public String toString() {
//		return "Toy";
//	}
//}
//
//// 제너릭 클래스 선언
//class Box03<T> {
//	ArrayList<T> list = new ArrayList<>();
//	void add(T item) {
//		this.list.add(item);
//	}
//
//	T get(int i) {
//		return this.list.get(i);
//	}
//
//	int size () {
//		return this.list.size();
//	}
//
//	public String toString() {
//		return list.toString();
//	}
//}




