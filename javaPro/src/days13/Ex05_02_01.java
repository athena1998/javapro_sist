package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 12:15:52
 * @subject  검색(Search)                          -> 수정, 삭제, 보기 등등
 * @content   ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것.
 *            1) 순차 검색( Sequence Search )
 *            2) 이진 검색( Binary Search )
 *            
 *           문제) 찾고자 하는 정수의 모든 위치값을 출력... 
 */
public class Ex05_02_01 {

   public static void main(String[] args) {
      // 30개      0~20 정수
      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("> 배열에서 찾을 정수 입력 ? ");
      int n = scanner.nextInt(); // 12
       
      int [] indexArr = sequenceSearch(m, n);
      
      System.out.println( Arrays.toString(indexArr) ); 

   } // main
   
   // [4] *** 
   private static int[] sequenceSearch(int[] m, int n) {
      int [] temp = new int[m.length]; // 30   
      Arrays.fill(temp, -1); 
      int index = 0; 
      for (int i = 0; i < m.length; i++) {
         if( m[i] == n ) {
            temp[index++] = i;
         }
      } // for i 
      
      return  Arrays.copyOf(temp, index);
   }
   
    

} // class
