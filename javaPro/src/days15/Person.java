package days15;

/**
 * @author junginn
 * @date : 2025. 2. 21. - 오후 2:24:25
 * @subject getter / setter -> alt + shift + s
 * @content
 */
public class Person {

	private String name;
	private int age;
	private boolean gender;

	public Person() {
		this("익명사용자", 1, true);
		System.out.println("Person 기본 생성자 호출");
	}

	 public Person(String name, int age, boolean gender) {
	      this(name, age);
	      // super();
	      // [ this의 첫 번째 용도 ]  멤버를 가리킬 때의 this
	      // this.name = name;
	      // The assignment to variable name has no effect
	      //this.name = name;
	      //this.age = age;
	      this.gender = gender;
	      System.out.println("> Person 3 생성자 호출됨.");
	   }


	 public Person(String name, int age) { 
	      this.name = name;
	      this.age = age; 
	      System.out.println("> Person 2 생성자 호출됨.");
	   }


	// private 필드의 값을 설정
	// private : 읽기전용 , 입력값 유효성 검증
	// 필드의 값을 가져올때도 사용
	// getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	//	public void setGender(boolean gender) {
	//		this.gender = gender;
	//	}






}
