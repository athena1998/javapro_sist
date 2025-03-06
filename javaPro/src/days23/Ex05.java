package days23;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		
		/* TreeSet
		 * 1. 중복 허용 X 순서 유지 X
		 * 2. 이진 검색 트리 (binary Search Tree) 라는 자료구조로 
		 * 		데이터 저장하는 컬렉션 클래스
		 * 3. 이진 검색 트리 (binary Search Tree) - 정보, 검색, 범위 검색에 높은 성능 (정렬, 검색, 부분검색)
		 * 4. 링크드리스트 처럼 노드가 서로 연결된 구조이다
		 * 5.					최상위노드	-	루트노드
		 * 	노드들 간 관계		부모노드	- 	자식노드
		 * 						형제노드
		 * 6. 노드 구조
		 * class TreeNode() {
		 * 	TreeNode 왼쪽 자식노드
		 * 	int value;
		 * 	TreeNode 오른쪽 자식노드
		 * 
		 * 7. 이진검색트리 노드
		 * 		부모노드의 왼쪽에는 부모노드값보다 작은 자식 노드가 배치
		 * 		오른쪽에는 부모노드값보다 큰 값의 자식 노드가 배치
		 */
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts);
		
		ts.add(5);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println(ss);
		
		System.out.println(ts.higher(1));
		System.out.println(ts.lower(1));
		
		System.out.println(ts.floor(3));
		System.out.println(ts.ceiling(3));
		

		
		
	} // main

}
