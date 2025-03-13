package days28;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex08 {
	public static void main(String[] args) {

		Student[] stuArr = {
				new Student("이자바",3,300),
				new Student("김자바",1, 200),
				new Student("안자바",2, 100),
				new Student("박자바",2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
		};
		
		// 총점으로 정렬
//		st.sorted().forEach(System.out::println);

		// 반별 -> 성적순 오름차순 정렬
		
		Stream<Student> st = Stream.of(stuArr);
		st.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		
		st = Stream.of(stuArr);;
		
		// 1. 학생수
		System.out.println("1. 학생수 : " + st.count());
		// 2. 정수와 총합
		// 총점만을 ㄱ지고 있는 스트림을 따로 생성
		// ㄴ IntStream  기본형 스트림 생성
		
		// Stream<Student> st -> IntStream<int, totalScore>
		// 1) mapToInt(), mapToLong(), mapToDouble() 기본형 스트림 생성
		// 	  map() 메서드 : Stream<T>
		st = Stream.of(stuArr);;
		IntStream stot = st.mapToInt((Student::getTotalScore));
//		System.out.println(stot.sum());
		
		
		// 3. 점수와 평균
		// 4. 점수의 최고, 최저
		// 		최종 연산에 의해서 메번 1,2,3,4 스트림 객체 생성 
		IntSummaryStatistics iss = stot.summaryStatistics();
		System.out.println("점수의 최고, 최저 " + iss.getMax() + " " + iss.getMin());
		System.out.println("점수와 평균 " + iss.getSum() + " " +  iss.getAverage());

	} // main

//class Student implements Comparable<Student>{
//
//	String name;
//	int ban;
//	int totalScore;
//
//	Student(){}
//
//	public Student(String name, int ban, int totalScore) { 
//		this.name = name;
//		this.ban = ban;
//		this.totalScore = totalScore;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getBan() {
//		return ban;
//	}
//
//	public int getTotalScore() {
//		return totalScore;
//	}
//
//	@Override
//	public int compareTo(Student o) {      
//		return  Integer.compare(o.totalScore, this.totalScore);
//	}




} // class
