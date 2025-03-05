package days22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_05 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // queue의 최대개수 다섯개
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
		
		while (true) {
			System.out.print(">>");
			
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if ("".equals(input)) {
					continue;
				} // if
				if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q - 프로그램을 종료합니다");
					System.out.println("history - 최근에 입력한 명령어를" 
					+ MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					
					// Scanner 로 입력받은 명령어 저장 
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					// 지금까지 입력받은 명령어 출력
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
					
					save(input);
				} else {
					// 빈 문자열이 아니라면 명령어 저장
					save(input);
					System.out.println(input);
				} 
			} catch (Exception e) {
				System.out.println("입력오류입니다");
			}
		} // while
		
	} // main

	private static void save(String input) {
		
		// q 에 명령어를 저장함
		if (!"".equals(input)) {
			q.offer(input); // 큐의 끝에 요소를 추가하는 메서드
		} // if
		
		// q 사이스가 다섯개가 넘으면 가장 먼저 입력된걸 삭제
		if (q.size() > MAX_SIZE) {
			q.remove();
		} // if
		
	}

}
