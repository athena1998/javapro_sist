package days23;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author junginn
 * @date : 2025. 3. 6. - 오후 12:19:30
 * @subject hashSet 문제점
 * 					파악 객체를 제너릭으로 설정했을때 객체 필드 중복 허용
 * 					해결 : hashCode() 오버라이딩
 * 						   equals() 오버라이딩
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("20202211", "kim", 20));
		hs.add(new Student("20202212", "lee", 20));
		hs.add(new Student("20202211", "park", 20)); // 학번 중복됨
		hs.add(new Student("20202214", "jeong", 20));
		
		
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		
	} // main

}

class Student {
	String no; // 학번 - 고유번호 (중복불가)
	String name;
	int age;
	
	public Student() {
		super();
	}

	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no : " + no + " name : " + name + " age : "  + age +"]";
	}

	@Override
	public int hashCode() {
		// 학번에 해당하는 해시코드값 반환
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && obj != null) {
			Student s = (Student) obj;
			return this.no.equals(s.no);
		} // if
		return false;
	}
	
}