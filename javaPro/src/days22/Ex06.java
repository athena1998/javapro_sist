package days22;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 12:14:09
 * @subject LinkedList 컬렉션 클래스
 * 			1. 배열의 단점
 * 				ㄴ 배열 크기 동적 증가 불가
 * 				ㄴ 데이터 삽입 삭제 비효율
 * 			2. 배열의 장점
 * 				ㄴ 읽기성능이 가장 빠름
 * 
 * 			배열의 단점 -> LinkedList
 * 							특징 : 비연속적
 * 
 * 
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 15;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 20;
		node2.next = node3;

		Node node4 = new Node();
		node4.value = 25;
		node3.next = node4;
		node4.next = null;
		
		// 노드2와 노드3 사이에 노드5(100) 이 추가되는 코딩
		Node node5 = new Node();
		node5.value = 100;
		node5.next = node2.next;
		node2.next = node5;

		// 노드3 삭제
		node5.next = node4;

		Node node = node1;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		} // while
		
		
		
		
		
		
	} // main

}

// 단방향 링크드 리스트
class Node {
	
//	Node prev = null;
	int value = 0;
	Node next = null; // 뒤의 노드의 주소를 저장할 참조변수
}
















