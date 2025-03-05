package days22;

import java.util.Stack;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 2:02:18
 * @subject	ArrayList : 읽기 빠르다
 * 			LinkedList
 * 
 * 			1. 순차적으로 추가삭제 : ArrayList 가 빠름
 * 			2. 중간 추가 삽입삭제 : LinkedList 가 빠름
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		
		// 스택(stack) 큐 (quene)
		
		/*
		 * 스택
		 * 1. java.util 패키지
		 * 2. LIFO 자료구조 (후입선출)
		 * 3. push() 요소추가
		 * 	  pop() 요소 가져오기
		 * 	  peek()
		 *    isEmpty()
		 *    index Search() 검색
		 */
		
		Stack s = new Stack(); 
		s.push("kim");
		s.push("lee");
		s.push("park");
		s.push("kjeong");
		
		while (s.isEmpty()) {
			
			
		}
		
		
	} // main

}
