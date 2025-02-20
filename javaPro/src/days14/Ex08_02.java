package days14;

public class Ex08_02 {
	public static void main(String[] args) {

		// 클래스 배열 선언
		Person[] pArr = new Person[5];
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		} // for i
		
		// 5명의 사람
		pArr[0].name = "kim";
		pArr[1].name = "lee";
		pArr[2].name = "park";
		pArr[3].name = "kwon";
		pArr[4].name = "jeong";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		} // for i
		
		
	} // main

}
