package days18;

public class Ex02 {
	public static void main(String[] args) {

//		Ex00 obj = new Ex00();
//		obj.aaa();
//		obj.bbb();
//		obj.ccc();
		
		// 부모 인터페이스에서도 업캐스팅은 가능하다.
		IA obj = new Ex00();
		obj.aaa();

	} // main

}

interface IA {	
	void aaa();
}
interface IB {	
	void bbb();
}
interface IC extends IA, IB {	
	//	void aaa();
	//	void bbb();
	void ccc();
}

class Ex00 implements IC {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}
