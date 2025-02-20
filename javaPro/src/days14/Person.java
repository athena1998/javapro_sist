package days14;


// (default 생략가능) : 같은 패키지 내부에서만 참조 가능
// public : 패키지가 달라도 참조가능
public class Person {
	
	public String name;
	public int age;
	
	public void work() {
		System.out.println(name + "이 일한다");
	}
	public void run() {
		System.out.println(name + "이 달린다");
	}

}
