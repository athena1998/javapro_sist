package days20;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
        
//        int index = data.indexOf("홍길동");
//        int count = 1;
//        
//        while (index != -1) {
//            System.out.printf(">%d 번째 찾은 위치 : %d\n",count, index);
//            count++;
//            index = data.indexOf("홍길동", index + 1);
//        }
        
        int wordLength = data.length();
        String search = "홍길동";
        int index = -1;
        int findIndex = 0;
        int fromIndex = 0;
        int count = 1;
        while (true) {
			index = data.indexOf(search, findIndex);
			
			if (index == -1) {
				break;
			} // if
			
			System.out.printf("%d 번째 찾은 위치 : %d\n", count++, findIndex);
			fromIndex = index +wordLength;
		} // while
        

        String updatedData = data.replaceFirst("홍길동", "이정인"); // 첫번째 홍길동 -> 이정인
        updatedData = updatedData.replaceFirst("홍길동", "이정인"); // 두번째 홍길동 -> 이정인
        updatedData = updatedData.replaceFirst("이정인", "홍길동"); // 첫번째 이정인을 다시 홍길동
        
        System.out.println("결과: " + updatedData);
    }
}

