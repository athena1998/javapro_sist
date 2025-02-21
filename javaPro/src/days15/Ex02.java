package days15;

public class Ex02 {
	public static void main(String[] args) {
		
		// JVM 의 메모리 구조 
		// 응용프로그램을 실행하면 jvm이 os로부터 프로그램을 실행하는데 
		// 필요한 메모리를 할당받는다
		// jvm 은 용도에 따라서 여러 영역으로 나눠 관리
		
		// 1) Method Area
		//    ㄴ 프로그램 실행 시 클랴스 파일 읽어서 클래스에 대한 정보를  Method Area에 저장
		//	  ㄴ 클래스 변수
		// 2) Call Stack - 호출 스택
		// 	  메서드가 호출될때 메서드에서 사용될 저장 공간
		//    ㄴ 지역변수
		// 3) heap
		//    ㄴ new 라고 하는 연산자에 의해서 저장공간이 지정됨
		//       new int[4], new Person()
		//    ㄴ 인스턴스 변수는 힙 영역에 잡힘
		
	} // main

}
