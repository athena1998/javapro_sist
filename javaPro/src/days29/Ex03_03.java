package days29;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class Ex03_03 {

	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("나자바", true,  1, 1, 300),   
				new Student("김지미", false, 1, 1, 250),   
				new Student("김자바", true,  1, 1, 200),   
				new Student("이지미", false, 1, 2, 150),   
				new Student("남자바", true,  1, 2, 100),   
				new Student("안지미", false, 1, 2,  50),   
				new Student("황지미", false, 1, 3, 100),   
				new Student("강지미", false, 1, 3, 150),   
				new Student("이자바", true,  1, 3, 200),   

				new Student("나자바", true,  2, 1, 300),   
				new Student("김지미", false, 2, 1, 250),   
				new Student("김자바", true,  2, 1, 200),   
				new Student("이지미", false, 2, 2, 150),   
				new Student("남자바", true,  2, 2, 100),   
				new Student("안지미", false, 2, 2,  50),   
				new Student("황지미", false, 2, 3, 100),   
				new Student("강지미", false, 2, 3, 150),   
				new Student("이자바", true,  2, 3, 200)   
		};

		Map<Boolean, List<Student>> map = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale));
		List<Student> manList = map.get(true);
		List<Student> womanList = map.get(false);

		System.out.println(manList);
		System.out.println(womanList);

		// 각각 항목의 인원 파악
		Map<Boolean, Long> map2 = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));
		System.out.println(map2.get(true));
		System.out.println(map2.get(false));

		// 각각 항목의 최대 점수 파악
		Map<Boolean, Optional<Student>> map3 = Stream.of(stuArr).collect(Collectors.partitioningBy
				(Student::isMale, 
						Collectors.maxBy(Comparator.comparing(Student::getScore))));

		List<Student> maleMax = map.get(true);
		List<Student> femeleMax = map.get(false);


		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
				.collect(partitioningBy(Student::isMale, 
						collectingAndThen(
								maxBy(comparingInt(Student::getScore)), Optional::get
								)
						));
		System.out.println("남학생 1등 :"+ topScoreBySex2.get(true));
		System.out.println("여학생 1등 :"+ topScoreBySex2.get(false));

		System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

		Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = 
				Stream.of(stuArr).
				collect(partitioningBy(
						Student::isMale, 
						partitioningBy(s -> s.getScore() <= 100))
						); 
		
		List<Student> failedMaleStu   = failedStuBySex.get(true).get(true);
		List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

		for(Student s : failedMaleStu)   System.out.println(s);
		for(Student s : failedFemaleStu) System.out.println(s);


	} // main



}


class Student {
	String name;
	boolean isMale; // 성별
	int hak;          // 학년
	int ban;          // 반
	int score;

	Student(String name, boolean isMale, int hak, int ban, int score) { 
		this.name   = name;
		this.isMale   = isMale;
		this.hak   = hak;
		this.ban   = ban;
		this.score  = score;
	}
	String   getName()  { return name;}
	boolean isMale()    { return isMale;}
	int      getHak()   { return hak;}
	int      getBan()   { return ban;}
	int      getScore() { return score;}

	public String toString() { 
		return String.format("[%s, %s, %d학년 %d반, %3d점]",
				name, isMale ? "남":"여", hak, ban, score); 
	}
	// groupingBy()에서 사용
	enum Level { HIGH, MID, LOW }  // 성적을 상, 중, 하 세 단계로 분류
}
