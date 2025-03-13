package Tennis;

import java.util.Random;
import java.util.Scanner;

public class Tennis_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단식/복식 : ");
		final int MATCH_TYPE = sc.nextInt();
		System.out.print("어드벤티지 세트 / 타이브레이크 세트 : ");
		final int SET_TYPE = sc.nextInt();

		// MATCH_TYPE = 1 (단식) MATCH_TYPE = 2 (복식)
		String teamA; // 팀A  단식일때 선수변수로 사용
		String teamB; // 팀B  단식일때 선수변수로 사용
		String a1; // A팀 선수1 
		String a2; // A팀 선수2 
		String b1; // B팀 선수1 
		String b2; // B팀 선수2

		Player play = new Player();

		if (MATCH_TYPE == 1) {
			System.out.print("첫번째 선수 입력 : ");
			play.player1 = sc.next();
			System.out.print("두번째 선수 입력 : ");
			play.player2 = sc.next();

		} else {
			System.out.print("첫번째 팀 입력 : ");
			play.player1 =  sc.next();
			System.out.print("  " + "첫번째 선수 입력 : ");
			a1 = sc.next();
			System.out.print("  " + "두번째 선수 입력 : ");
			a2 = sc.next();
			System.out.print("두번째 팀 입력 : ");
			play.player2 = sc.next();
			System.out.print("  " + "첫번째 선수 입력 : ");
			b1 = sc.next();
			System.out.print("  " + "두번째 선수 입력 : ");
			b2 = sc.next();
		}

		// 세트 3판2선승제 / 5판3선승제 선택
		System.out.print("3판2선승제 / 5판3선승제 선택 : ");
		int setCount = sc.nextInt();
		String winner = null;

		startGame(setCount, play.getPlayer1(), play.getPlayer2());

	} // main

	private static void startGame(int setCount, String p1, String p2) {
		Random rnd = new Random();

		// 서브 선수 결정
		int startPlayer = rnd.nextInt(2)+1;

		// 포인트 획득 선수 결정
		pointWinner(startPlayer, p1, p2);

	}

	private static void pointWinner(int startPlayer, String p1, String p2) {
		
		Status status = new Status(p1, p2, false, 		0, 			0, 			0, 			0, 					0, 				0);
		
		int[] scorePlus = {0, 15, 30, 40};
		Random rnd = new Random();

		int gameScore1 = 0;
		int gameScore2 = 0;

		int currentServer = startPlayer;

		System.out.println("-".repeat(60));

		while (gameScore1 <= 6 && gameScore2 <= 6 ) {
			int player1Point = 0;
			int player2Point = 0;

			boolean isDeuce = false;
			boolean isAdvantagePlayer1 = false;  // 어드밴티지 상태 설정
			boolean isAdvantagePlayer2 = false;


			while (true) {
				// 1 또는 2로 포인트를 랜덤하게 할당
				int point = rnd.nextInt(2) + 1;
				int adventagePoint = rnd.nextInt(2) + 1;
				
				// 듀스가 아닐때만 점수 출력
				if (!isDeuce) {
//					System.out.printf("%s Point %d : %s Point %d\n", p1, player1Point, p2, player2Point);
					 status.bDuece = false;
					 status.player1Point = player1Point;
				     status.player2Point = player2Point;
				}
				
				status.dispScoreBoard();

				// 듀스 상태가 아닐때 게임 진행 현황
				if (player1Point == 40 && point == 1 && player2Point != 40 ) {
					System.out.printf("Speak > %s win \n", p1);
					gameScore1++;
					break;
				} else if (player2Point == 40 && point == 2 && player1Point != 40 ) {
					System.out.printf("Speak > %s win \n", p2);
					gameScore2++;
					break;
				} else if (player1Point == 40 && player2Point == 40) { // 듀스 시작
					status.bDuece = true;
					if (!isDeuce) {
						isDeuce = true;
					}
				}

				// 듀스 상태에서 어드밴티지 처리
				if (isDeuce) {
					
					if (adventagePoint == 1) {
						if (!isAdvantagePlayer1) {
							// 어드밴티지로 설정
							status.player1Point += 1;
							
							isAdvantagePlayer1 = true;
							isAdvantagePlayer2 = false;
							
						} else {
							// 어드밴티지 상태에서 첫 번째 점수를 이기면 게임 승리
							System.out.printf("Speak > %s win \n", p1);
							gameScore1++;
							break;
						}
					} else {
						if (!isAdvantagePlayer2) {
							status.player2Point += 1;
							isAdvantagePlayer1 = false;
							isAdvantagePlayer2 = true;
						} else {
							System.out.printf("Speak > %s win \n", p2);
							gameScore2++;
							break;
						}
					}
					status.dispScoreBoard();
				} else {
					// 듀스 상태가 아니라면 점수를 15, 30, 40으로 증가
					if (point == 1) {
						player1Point = plusPoint(player1Point, scorePlus);
					} else {
						player2Point = plusPoint(player2Point, scorePlus);
					}
				}
			}
//			
			status.player1Game = gameScore1;
			status.player2Game = gameScore2;
			
			// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
			currentServer = (currentServer == 2) ? 1 : 2;

			status.serve = currentServer;

			System.out.println("=".repeat(60));
		}
		System.out.printf("\n[Total Game Score]\n%s %d : %s %d\n", p1, gameScore1, p2, gameScore2);
	}

	private static int plusPoint(int playerPoint, int[] scorePlus) {
		if (playerPoint == 0) {
			playerPoint = scorePlus[1];
		} else if (playerPoint == scorePlus[1]){
			playerPoint = scorePlus[2];
		}else {
			playerPoint = scorePlus[3];
		}
		return playerPoint;
		
	}
}

class Player{
	String player1;
	String player2;

	public Player() {
		super();
	}

	public Player(String player1, String player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public String getPlayer1() {
		return player1;
	}
	public String getPlayer2() {
		return player2;
	}
}
