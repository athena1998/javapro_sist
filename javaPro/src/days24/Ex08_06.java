package days24;

import java.util.ArrayList;

public class Ex08_06 {
	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice); // Juice 클래스의 메모리 주소값


		FruitBox<Apple> appleBox = new FruitBox<>();
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer 
		// is not applicable for the arguments (FruitBox<Apple>)
		juice = Juicer.makeJuice(appleBox);
		System.out.println( juice ); // days24.Juice@1e643faf


	} // main
}


class Juice {

	//	@Override
	//	public String toString() {
	//		// TODO Auto-generated method stub
	//		return "Juice";
	//	}
}

class Juicer {


	// ? extends Fruit는 "Fruit 클래스를 상속하는 어떤 클래스든지 받을 수 있다"는 의미
	// Fruit, Apple, Grape와 같은 Fruit의 서브클래스를 모두 받을 수 있다
//	static Juice makeJuice(FruitBox<? extends Fruit> box) {
//		return new Juice();
//	}
	
	// 제네릭 메소드로 선언
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		return new Juice();
	}
	
	
	// 재네릭 메소드 변환예제
	// 변환 전
//	static void printAll(ArrayList<? extends Fruit> list,
//			ArrayList<? extends Fruit> list2) {
//		
//	}
	
	// 변환 후
	static <T extends Fruit> void printAll(ArrayList<T> list,
			ArrayList<T> list2) {
		
	}
	
}

class Fruit{   
	public String toString() { 
		return "Fruit";   
	}
}

class Apple extends Fruit{   
	public String toString() {
		return "Apple";   
	}
}

class Grape extends Fruit{   
	public String toString() {
		return "Grape";   
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

// T extends Fruit는 FruitBox가 Fruit 또는 그 하위 클래스만을 저장할 수 있도록 제한
// FruitBox는 Box05 클래스의 기능을 그대로 상속받아 사용하며, 
// Fruit 타입 또는 그 하위 타입 객체만을 처리
class FruitBox<T extends Fruit> extends Box05<T> {

}

class Box05<T> {
	ArrayList<T> list = new ArrayList<>();

	void add(T item) {
		this.list.add(item);
	}

	T get(int i) {
		return this.list.get(i);
	}

	int size () {
		return this.list.size();
	}

	public String toString() {
		return list.toString();
	}
}