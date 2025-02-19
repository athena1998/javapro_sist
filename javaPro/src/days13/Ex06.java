package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author junginn
 * @date : 2025. 2. 19. - 오후 2:41:47
 * @subject 이진검색
 * 			  - 필수 조건 : 오름차순/내림차순 정렬
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
                86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
             169, 172, 181, 184, 185, 191, 198 };

		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력 : ");
		int search = sc.nextInt();
		
//		int index = Arrays.binarySearch(m, search);
//		System.out.println(index);
		
		int index = binarySearch(m, search);
		
		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있습니다", search, index);
		} else {
			System.out.println("찾는 정수가 없습니다");
		}
		
	} // main

	private static int binarySearch(int[] m, int search) {

		int top= m.length-1;
		int bottom = 0;
		int mid;
		int count = 0;
		
		while (bottom <= top) {
			count++;
			mid = (top + bottom) / 2;
			
			if (m[mid] == search) {
				return mid;
			} 
			else if(m[mid] > search) {
				top = mid - 1;
			}else {
				bottom = mid + 1;
			}
			System.out.println(count);
		} // while
		
		return -1;
	}

}
