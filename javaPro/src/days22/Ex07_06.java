package days22;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 3:39:21
 * @subject	Priority[Queue] 
 * 			우선순위
 * 				ㄴ FIFO 구조
 * 				ㄴ 저장된 순서에 상관없이 우선순위가 높은것부터 꺼내는 구조
 * 				ㄴ NULL 저장 불가 
 * @content
 */
public class Ex07_06 {
	public static void main(String[] args) {
		
		Queue pq = new PriorityQueue();
		
		pq.offer(3);
		pq.offer(1);
		pq.offer(2);
		pq.offer(5);
		pq.offer(4);
		
		System.out.println(pq);
		
		// 숫자는 작은숫자 일수록 우선순위가 높다
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		} // while
		
		
		
	} // main

}
