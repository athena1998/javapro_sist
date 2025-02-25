package days17;

import java.util.Arrays;

/**
 * @author junginn
 * @date : 2025. 2. 25. - 오후 4:09:26
 * @subject 인터페이스
 * 			ㄴ 상수, 추상메서드
 * 			ㄴ jdk 1.8 이후부터는 default, static 메소드 추가	
 * @content
 */
public class Ex13 {
	public static void main(String[] args) {
		// html 문서를 구문분석하여 내가 원하는 내용을 얻어오기
		// xml 문서를 구문분석하여 내가 원하는 내용 읽어오기
		String fileName = "sample.xml";
		
		// 부모가 parseable 이라는 인터페이스로 되어있기때문에 하위의 html든 pdf든 모든 객체를 리턴할 수 있음
		// 업캐스팅
		// 다형성
		Parseable parser = ParserManager.getParse(fileName);
		parser.parse(fileName);
		parser.print();
		
		
	} // main
}


// 2000년도에 A 개발자
interface Parseable {
	
	// 구문 분석을 하는 추상 메소드 선언
	void parse(String fileName);
	
	static void test () {
		System.out.println("추가 기능 메소드 추가 ");
	}
	
	// 접근지정자의 default 아님
	// static 과 같은 기타제어자 
	// default 메소드
	default void print() {
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}
	
}


interface ParseablePlus extends Parseable {
	
	// 인쇄하는 추상메서드 선언
	void print();
	
	
}

// html 문서를 파싱하는 클래스 선언
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 구문분석 메소드 호출");
	}
}

// XML 문서를 파싱하는 클래스 선언
class XMLParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("XML 구문분석 메소드 호출");
	}
}

// PDF 문서를 파싱하는 클래스 선언
class PDFParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("PDF 구문분석 메소드 호출");
	}
}

// WORD 문서를 파싱하는 클래스 선언
class WORDParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("WORD 구문분석 메소드 호출");
	}
	
	// Cannot reduce the visibility of the inherited method from Parseable
	public void print() {
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}
}

// parse 4개 -> 1개의 파서를 찾아서 사용할 수 있도록 관리하는 클래스
class ParserManager{
	
	public static Parseable getParse(String docType) {
		Parseable parser = null;
		
		String[] split = docType.split("\\.");
		
		docType = split[split.length-1];
		
		switch (docType) {
		case "xml":
			parser = new XMLParser();
			break;
		case "html":
			parser = new HTMLParser();
			break;
		case "pdf":
			parser = new PDFParser();
			break;
		case "word":
			parser = new WORDParser();
			break;
		default:
			parser = null;
			break;
		} // switch
		
		return parser;
	}
}














