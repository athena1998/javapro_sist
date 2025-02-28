package days19;

import days20.Parent;

public class Child extends Parent{
	
	void modiferAccessTest() {
		this.pub = 100;
//		this.def = 80; // default 같은 패키지만 가능
		this.pro = 90; // protected 같은 패키지가 아니라도 상속관계있으면 가능
	}
}
