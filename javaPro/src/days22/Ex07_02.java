package days22;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex07_02 {
	public static void main(String[] args) {

		// 큐 (quene)
		// 인터페이스
		// FIFO 구조

		Queue q = new LinkedBlockingDeque();
		q.offer("kim");
		q.offer("lee");
		q.offer("park");

		System.out.println(q);



	} // main

}
