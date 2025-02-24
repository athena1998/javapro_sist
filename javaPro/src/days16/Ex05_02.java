package days16;

/**
 * @author junginn
 * @date : 2025. 2. 24. - 오전 11:28:45
 * @subject 클래스 변수 초기화 순서 - 기본값 -> 명시적 초기화 -> 클래스 초기화
 * 인스턴스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자 초기화
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		
		// 공장에서 제품을 생산할때 제품마다 생산일련변호를 부여 
		// 인스턴스 마다 고유한 일련번호를 부여
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서1.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
		
		
		
	} // main

}

class Document {
	String fileName;
	static int count = 1;
	
	// 인스턴스 초기화 블럭
	// 객체가 실행될때마다 실행되서 public Document (String fileName) 로 들어가도 count기 1 증가된다
//	{
//		count++;
//	}
	
	public Document () {
		this(String.format("noname%d.txt", count));
		count++;
	}
	
	public Document (String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\" 가 생성되었습니다.\n", this.fileName);
		
	}
}















