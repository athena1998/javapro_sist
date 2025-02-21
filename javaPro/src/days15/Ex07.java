package days15;

/**
 * @author junginn
 * @date : 2025. 2. 21. - 오후 4:33:48
 * @subject static 키워드
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {




		//		Save s1 = new Save("kim", 10000, 0.04);
		//		Save s2 = new Save("lee", 11000, 0.04);
		//		Save s3 = new Save("park", 12000, 0.04);
		//		Save s4 = new Save("jeong", 13000, 0.04);
		//		Save s5 = new Save("kwon", 14000, 0.04);
		//		
		//		s1.printSave();
		//		s2.printSave();
		//		s3.printSave();
		//		s4.printSave();
		//		s5.printSave();

		// 클래스 배열 생성
		//		Save[] sArr = new Save[5];
		//		sArr[0] = new Save("kim", 10000, 0.04);   
		//		sArr[1] = new Save("lee", 11000, 0.04);   
		//		sArr[2] = new Save("park", 12000, 0.04);  
		//		sArr[3] = new Save("jeong", 13000, 0.04); 
		//		sArr[4] = new Save("kwon", 14000, 0.04);  
		//		
		//		for (int i = 0; i < sArr.length; i++) {
		//			sArr[i].printSave();
		//		} // for i

		// 클래스 배열 초기화
		Save[] sArr = {new Save("kim", 10000, 0.04), 
				new Save("lee", 11000, 0.04), 
				new Save("park", 12000, 0.04),
				new Save("jeong", 13000, 0.04), 
				new Save("kwon", 14000, 0.04)};


		// The field Save.rate is not visible
		sArr[0].setRate(0.06);
		System.out.println(Save.getRate());

		for (Save save : sArr) {
			save.printSave();
		}


	} // main

}
