package days18;

import days18.Ex03_02.StaticInner;
import days18.Ex03_03.InstanceInner;

public class Ex03_03 {
	
	
	
	class InstanceInner {
		
	}
	
	static class staticInner{
		
	}
	
	InstanceInner ii = new InstanceInner();
	
	static StaticInner ss = new StaticInner();
	
	void method () {
		class LocalInner { 
			
		}
		
		LocalInner li2 = new LocalInner();
		
		InstanceInner ii2 = new InstanceInner();
		staticInner si2 = new staticInner();
		
	}
	
	
	static void method2 () {
		Ex03_03 outer = new Ex03_03();
		InstanceInner ii = outer.new InstanceInner();
		
		staticInner SI = new staticInner();
		
	}
	
	
	public static void main(String[] args) {
		
	} // main

}
