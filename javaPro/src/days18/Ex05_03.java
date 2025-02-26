package days18;

import java.util.Random;

/**
 * @author junginn
 * @date : 2025. 2. 26. - 오후 2:09:26
 * @subject try-catch
 * @content
 */
public class Ex05_03 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		int[] m = new int[5];
		
		for (int i = 0; i < 10; i++) {
			
			try {
				n = rnd.nextInt(5);
				// java.lang.ArithmeticException: / by zero
				result = number / n;
				
//				try {
//					m[i] = result;
//					System.out.println(result);				
//					
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("배열 크기 부족으로 저장 안함");
//				}
				
				
				//  멀티캐치블럭
			} catch (ArithmeticException e) {
				i--;
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
			}catch (Exception e) {
				e.printStackTrace();
			} 
			finally {
				
			}
			
		} // for i
		
	} // main

}
