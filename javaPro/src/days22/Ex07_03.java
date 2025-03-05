package days22;

import java.util.Deque;
import java.util.LinkedList;

public class Ex07_03 {
	public static void main(String[] args) {
		
		// Deque  인터페이스
		// Double Enabled quene
		// 양쪽으로 가능한 큐
		
		Deque dq = new LinkedList();
		dq.offerFirst("a");
		dq.offerLast("b");
		
		System.out.println(dq);
		
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		
		
	} // main

}
