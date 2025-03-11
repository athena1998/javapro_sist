package days26;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 6464380009433362222L;

	String name;
	
	// transient = 일시적인
	// 				직렬화 대상에서 제외하겠다는 의미
	transient String password;
	int age;
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public UserInfo() {
		
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
	
	

}
