//package days29;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.IntSummaryStatistics;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Ex03_02 {
//	public static void main(String[] args) {
//
//		// 클래스 배열 초기화
//		Student[] stuArr = {
//				new Student("이자바", 3, 300),
//				new Student("김자바", 1, 200),
//				new Student("안자바", 2, 100),
//				new Student("박자바", 2, 150),
//				new Student("소자바", 1, 200),
//				new Student("나자바", 3, 290),
//				new Student("감자바", 3, 180)   
//		};
//
//		// 1. 학생들의 이름만 뽑아서 List<String> 에 저장
//		// student[] => Stream<Student>
//		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
//		System.out.println(names);
//
//		// 2. 스트림 -> Student[]배열로 변환
//		//		Object[] objArr = Stream.of(stuArr).toArray();
//		Student[] strArr = Stream.of(stuArr).toArray(Student[]::new);
//
//		//		for (Student s : strArr) {
//		//			System.out.println(s);
//		//		}
//
//		// 3. Student[] -> Stream -> Map 변환
//		Map<String, Student> stuMap =  Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), s->s));
//
//		Set<Entry<String, Student>> entry = stuMap.entrySet();
//
//		Iterator<Entry<String, Student>> it = entry.iterator();
//
//		while (it.hasNext()) {
//			Entry<String, Student> entry2 = it.next();
//			System.out.println(entry2.getKey() + " : " + entry2.getValue());
//		}
//
//		// 1. 학생수 출력
//
//		long count = Stream.of(strArr).collect(Collectors.counting());
//		System.out.println("1. 학생수 출력 " + count);
//
//		// 2. 총 totalScore  총합 출력
//		long totalSum = Stream.of(strArr).collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
//		System.out.println("2. 총 totalScore  총합 출력 " + totalSum);
//
//		// 3. totalScore 최고점 학생 정보 출력
//		Optional<Student> max =Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
//		System.out.println("3. totalScore 최고점 학생 정보 출력 " + max.get());
//
//
//
//		// 4. 학생이름만 출력
//		List<String> nameList = Arrays.stream(stuArr).map(Student::getName).collect(Collectors.toList());
//		System.out.println("4. 학생이름만 출력 " + nameList);
////		IntSummaryStatistics stat = Stream.of(stuArr)
////				.collect(IntSummaryStatistics(Student::getTotalScore));
////		System.out.println(stat);
//
//
//
//	} // main
//
//}
//
////class Student implements Comparable<Student> {
////	String name;
////	int ban;
////	int totalScore;
////
////	Student(String name, int ban, int totalScore) { 
////		this.name =name;
////		this.ban =ban;
////		this.totalScore =totalScore;
////	}
////
////	@Override
////	public String toString() { 
////		return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
////	}
////
////	String getName() { return name;}
////	int getBan() { return ban;}
////	int getTotalScore() { return totalScore;}
////
////	public int compareTo(Student s) {
////		return s.totalScore - this.totalScore;
////	}
////}
