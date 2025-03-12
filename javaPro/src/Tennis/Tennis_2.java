package Tennis;

import java.util.Random;
import java.util.Scanner;

public class Tennis_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단식/복식 : ");
		int MATCH_TYPE = sc.nextInt();
		System.out.print("어드벤티지 세트 / 타이브레이크 세트 : ");
		int SET_TYPE = sc.nextInt();
		
		// MATCH_TYPE = 1 (단식) MATCH_TYPE = 2 (복식)
		String teamA; // 팀A  단식일때 선수변수로 사용
		String teamB; // 팀B  단식일때 선수변수로 사용
		String a1; // A팀 선수1 
		String a2; // A팀 선수2 
		String b1; // B팀 선수1 
		String b2; // B팀 선수2
		
//		if (MATCH_TYPE == 1) {
//			teamA = sc.next();
//			teamB = sc.next();
//		} else {
//			teamA = sc.next();
//			a1 = sc.next();
//			a2 = sc.next();
//			teamB = sc.next();
//			b1 = sc.next();
//			b2 = sc.next();
//		}
		
		// 세트 3판2선승제 / 5판3선승제 선택
		System.out.print("3판2선승제 / 5판3선승제 선택 : ");
		int setCount = sc.nextInt();
		String winner = null;
		
		startGame();
		
		
	} // main

	private static void startGame() {
		Random rnd = new Random();
		
		// 서브 선수 결정
		int startPlayer = rnd.nextInt(2)+1;
		
		// 포인트 획득 선수 결정
		pointWinner();
		
		
	}

	private static void pointWinner() {
		
		int[] scorePlus = {15, 15, 10, 10};
		int player1 = 0;
		int player2 = 0;
		
		int index1 = 0;
		int index2 = 0;
		Random rnd = new Random();
		while ((player1 <= 40 || player2 <= 40 ) && index1 <=3 && index2<=3) {
			
			int point = rnd.nextInt(2)+1;
			if ((Math.abs(player1-player2) >= 20) && (player1 >= 40 || player2 >= 40 )) {
				break;
			} // if
//			System.out.println("point : " + point + " index1 : " + index1 +  " index2 : "+ index2);
			if (point == 1) {
				player1 += scorePlus[index1++];
				System.out.println("player1 " + player1);
			} else {
				player2 += scorePlus[index2++];
				System.out.println("player2 " + player2);
			}
			
		} // while
		
		System.out.println();
		
	}

}
