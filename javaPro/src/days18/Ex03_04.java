package days18;

public class Ex03_04 {

	private int outerly = 5;
	static int outerCV = 0;

	public static void main(String[] args) {
		
	} // main
	
	
	class InstanceInner {

		// 외부클래스의 멤버를 마치 자기 자신 멤버처럼 사용 가능
		int a  = outerly;
		int b = outerCV;
	}

	static class staticInner{

		// Cannot make a static reference to the non-static field outerly
		// static 클래스에서 외부클래스의 인스턴스 멤버에 접근할 수 없다
		// int a  = outerly;
		// 정적 멤버는 접근 가능
		int b = outerCV;

	}

	void method01() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int c  = outerly;
			int d = outerCV;

			// lv는 변경되지 않는 값이어야만 내부 클래스에서 사용할 수 있음
			// lv = 100;
			int x = LV;
		}
	}

}










