package days24;

import java.util.ArrayList;

/**
 * @author junginn
 * @date : 2025. 3. 7. - 오후 3:21:23
 * @subject 제한된 제네릭 클래스
 * 			ㄴ T라는 타입 매개변수에 지정할 수 있는 타입 종류를 제한
 * @content
 */
public class Ex08_05 {
	public static void main(String[] args) {
		
		// // T는 모든 타입(T) 를 담을 수 있는 상자가 됨
//		Box04<Fruit> fruitBox = new Box04<Fruit>();
//		Box04<Apple> appleBox = new Box04<Apple>();
//		Box04<Grape> grapeBox = new Box04<Grape>();
//		Box04<Toy> toyBox = new Box04<Toy>();
		
//	Fruit<Grape> grapeBox = new  FruitBox(grape());
//	ArrayList<E>
		
	} // main

}

//interface Eatable {
//	
//}
//
//
//class Fruit implements Eatable {
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
//// T는 모든 타입(T) 를 담을 수 있는 상자가 됨
//class Box04<T> {
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
//
//
//// 제네릭 클래스 선언
//// 모든 타입이 아니라 과일들만 담을 수 있는 클래스 선언
//// 제한된 제너릭 클래스 선언
//class FruitBox<T> extends Fruit {
//	
//}
//
//// 먹을 수 있는 모튼 타입들의 담음
//class EatBox<T extends Eatable>{
//	
//}
