package days22;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author junginn
 * @date : 2025. 3. 5. - 오후 3:38:13
 * @subject 스택 활용 - 수식 계산 웹브라우저 뒤로 앞으로
 * 			큐 활용 - 최근 순서 확인
 * @content
 */
public class Ex07_04 {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		} // if
		
		Stack<String> st = new Stack<>();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch=='(') {
					st.push(ch+"");
				} else if(ch==')') {
					st.pop();
				}
				
			}
			
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다");
			} else {
				System.out.println("괄호가 일치하지 않습니다");
			}
			
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다..");
		}
		
	} // main

}
