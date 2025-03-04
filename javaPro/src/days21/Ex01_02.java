package days21;

public class Ex01_02 {
	public static void main(String[] args) {
		
		String s = "이름:홍길동, 나이:20살 성별:여자";
		
		String name = s.substring(3,6);
		String regex = "[^0-9]";
		int age = Integer.parseInt(s.replaceAll(regex,""));
		String[] split = s.split(":");
		String gen = split[split.length-1];
		boolean gender = (gen.equals("여자") ? true : false);
		
		System.out.printf("이름: %s 나이: %d살 성별: %b", name, age, gender);
		
	} // main

}
