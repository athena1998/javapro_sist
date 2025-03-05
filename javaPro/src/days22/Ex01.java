package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		
	LocalDateTime loc = LocalDateTime.now();
	String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
	System.out.println(dtf.format(loc));
	System.out.println(loc.format(dtf));
	
	
//	String str = "2023.02.28 (화)";
//	String pattern2 = "yyyy.MM.dd (E)";
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern2);
//	LocalDate lod = LocalDate.parse(str, dtf);
//	System.out.println(lod);
	
	ArrayList<String> teams = new ArrayList<String>(); 
	teams.add("kim");
	teams.add("lee");
	teams.add("park");
	
	Iterator<String> it = teams.iterator();
	
	while (it.hasNext()) {
		String member = it.next();
		System.out.println(member);
	}
	
	if (teams.indexOf("kim") != -1) {
		teams.set(teams.indexOf("kim"), "홍길동");
	} // if
	
	System.out.println(teams);
	
	LocalDateTime start = LocalDateTime.of(2025, 01, 05, 9, 0);
	LocalDateTime end = LocalDateTime.of(2025, 03, 05, 9, 0);
	LocalDateTime today = LocalDateTime.now(); // 2025-03-05 09:29
	
	today.compareTo(end);
	today.compareTo(start);
	
	if (today.isAfter(start) && today.isBefore(end)) {
		System.out.println("설문 가능");
	} else {
		System.out.println("설문 불가");
		
	}
		
	ArrayList personList = new ArrayList();
	personList.add(new Person("bbb", 20));
	personList.add(new Person("aaa", 25));
	
	personList.sort( new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {				
			return o1.name.compareTo( o2.name );
			// return o1.age -  o2.age;
		}
	} );
	
	System.out.println(personList);
	
		
	} // main
}

class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	
	
}
