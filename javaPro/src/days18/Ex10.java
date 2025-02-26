package days18;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 4:35:23
 * @subject Object class
 * @content   ㄴ 모든 클래스의 최상위 부모 클래스
 */
public class Ex10 {
	public static void main(String[] args) {

		/* [1]
		Value v1 = new Value(10);
		int hashcode = v1.hashCode(); // 객체 자신의 고유값 
		System.out.println(hashcode);

		Value v2 = new Value(10);
		hashcode = v2.hashCode();
		System.out.println(hashcode);

		Value v3 = v1;
		hashcode = v3.hashCode();
		System.out.println(hashcode);
		 */

		/* [2]
		Value v1 = new Value(10);
		Class cls = v1.getClass(); // 객체의 클래스 정보를 (Class) 반환
		String fullname = cls.getName();
		System.out.println(fullname);
		// 메서드, 생성자, 필드 등 모든 클래스 정보를 얻어올때 사용하는 메서드
		v1.toString(); // 객체 자신의 정보를 문자열로 반환

		[3]
		System.out.println(v1.toString());
		System.out.println(v1); // toString 생략가능
		System.out.printf("%s@%x", cls.getName(), v1.hashCode());
		 */

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// v1 == v2 ?
		System.out.println(v1==v2);
		Value v3 = v1; // 객체 복사
		System.out.println(v3==v1);
		
		// Object.equals() 메서드를 오버라이딩 하지 않으면 == 연산자와 동일한 기능
		// 오버라이딩 int value 필드 : 필드값이 같으면 같은 객체다
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		
		System.out.println(v1);
		System.out.println(v1.toString());


	} // main

}

// class Value (extends Object) { }
class Value {

	int value;

	public Value() {

	}

	public Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value && obj != null) {
			Value v = (Value) obj;
			return v.value == this.value;
		} // if
		return false;
		
		
	}
	
	@Override
	public String toString() {
		return String.format("value=%d", this.value);
	}
}
