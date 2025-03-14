package Tennis;

import java.util.Random;
import java.util.Scanner;

public class Tennis_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단식/복식 : ");
		int match_type = sc.nextInt();
		sc.nextLine();
		System.out.print("어드벤티지 세트 / 타이브레이크 세트 : ");
		int set_type = sc.nextInt();
		sc.nextLine();
		System.out.print("> 마지막 세트 타입 입력 (어드밴티지 세트: 1, 타이브레이크 세트: 2) : ");
		String lastSet = sc.nextLine().trim();



		// MATCH_TYPE = 1 (단식) MATCH_TYPE = 2 (복식)
		String teamA; // 팀A  단식일때 선수변수로 사용
		String teamB; // 팀B  단식일때 선수변수로 사용
		String a1; // A팀 선수1 
		String a2; // A팀 선수2 
		String b1; // B팀 선수1 
		String b2; // B팀 선수2

		Player play = new Player();

		if (match_type == 1) {
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

		startGame(match_type, play.getPlayer1(), play.getPlayer2(), set_type , setCount, lastSet);

	} // main

	private static void startGame(int match_type, String p1, String p2, int set_type, int setCount, String lastSet) {
		Random rnd = new Random();

		// 서브 선수 결정
		int startPlayer = rnd.nextInt(2)+1;

		// 포인트 획득 선수 결정
		pointWinner(startPlayer, p1, p2, set_type, setCount, lastSet);

	}

	private static void pointWinner(int startPlayer, String p1, String p2, int set_type, int setCount, String lastSet) {

		Status status = new Status(p1, p2, false,0,0,0,0,0,0);

		int[] scorePlus = {0, 15, 30, 40};
		Random rnd = new Random();

		int gameScore1 = 0;
		int gameScore2 = 0;
		int setScore1 = 0;
		int setScore2 = 0;

		int currentServer = startPlayer;

		while (true) {

			System.out.println("=".repeat(60));

			if (setCount == 3) {
				if (setScore1 > 1 || setScore2 > 1) {
					System.out.printf("\n[Match Win] %s \n", (setScore1 > setScore2) ? p1 : p2);
					break;
				} 
			} else if(setCount == 5) {
				if (setScore1 > 2 || setScore2 > 2) {
					System.out.printf("\n[Match Win] %s \n", (setScore1 > setScore2) ? p1 : p2);
					break;
				} 
			}

			while (true) {
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
						// System.out.printf("%s Point %d : %s Point %d\n", p1, player1Point, p2, player2Point);
						status.bDuece = false;
						status.player1Point = player1Point;
						status.player2Point = player2Point;

						status.dispScoreBoard();

						// 듀스 상태가 아닐때 게임 진행 현황
						if (player1Point == 40 && point == 1 && player2Point != 40 ) {
							System.out.printf("[Speak > GAME OVER WINNER : %s ] \n", p1);
							gameScore1++;
							break;
						} else if (player2Point == 40 && point == 2 && player1Point != 40 ) {
							System.out.printf("[Speak > GAME OVER WINNER : %s ] \n", p2);
							gameScore2++;
							break;
						} else if (player1Point == 40 && player2Point == 40) { // 듀스 시작
							status.bDuece = true;
							if (!isDeuce) {
								isDeuce = true;
							}
						}

						// 듀스 상태가 아니라면 점수를 15, 30, 40으로 증가
						if (point == 1) {
							player1Point = plusPoint(player1Point, scorePlus);
						} else {
							player2Point = plusPoint(player2Point, scorePlus);
						}
					}

					// 듀스 상태에서 어드밴티지 처리
					else {

						if (adventagePoint == 1) {
							if (!isAdvantagePlayer1) {
								// 어드밴티지로 설정
								isAdvantagePlayer1 = true;
								isAdvantagePlayer2 = false;
								status.isAdvantagePlayer1 = true;
								status.isAdvantagePlayer2 = false;
								status.dispScoreBoard();
							} else {
								// 어드밴티지 상태에서 첫 번째 점수를 이기면 게임 승리
								status.dispScoreBoard();
								System.out.printf("[Speak > GAME OVER WINNER : %s ] \n", p1);
								gameScore1++;
								break;
							}
						} else {
							if (!isAdvantagePlayer2) {
								isAdvantagePlayer1 = false;
								isAdvantagePlayer2 = true;
								status.isAdvantagePlayer1 = false;
								status.isAdvantagePlayer2 = true;
								status.dispScoreBoard();
							} else {
								status.dispScoreBoard();
								System.out.printf("[Speak > GAME OVER WINNER : %s ] \n", p2);
								gameScore2++;
								break;
							}
						}
					} 
				} // 게임 종료

				status.player1Game = gameScore1;
				status.player2Game = gameScore2;

				// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
				currentServer = (currentServer == 2) ? 1 : 2;

				status.serve = currentServer;

				System.out.println("=".repeat(60));

				// 게임 스코어가 2점 차이 이상 날때 세트 종료
				if(gameScore1 > 6 || gameScore2 > 6 && Math.abs(gameScore1-gameScore2) >= 2 ) {
					System.out.printf("\n[Total Game Score]\n%s %d : %s %d\n", p1, gameScore1, p2, gameScore2);


					if (gameScore1 > gameScore2) {
						setScore1++;
						status.player1Set = setScore1;
					} else {
						setScore2++;
						status.player2Set = setScore2;
					}

					System.out.printf("\n[Set Win] %s %d : %s %d\n", p1 , setScore1, p2, setScore2 );

					// 한 세트 끝날때마다 게임 점수 초기화
					gameScore1 = 0;
					gameScore2 = 0;
					status.player1Game = gameScore1;
					status.player2Game = gameScore2;

					break;

					// 게임 스코어가 동률이고 set_type 이 타이브레이크일때
				}else if ((gameScore1 == 6 && gameScore2 == 6) && set_type == 2) {
					tiebreakSet(currentServer, p1, p2, gameScore1, gameScore2, setScore1, setScore2);

					break;
				}

				if (set_type == 2 && (setCount == 5  && setScore1 == 2 && setScore2 == 2)) {
					System.out.println("마지막 세트 타입 : " + (lastSet == "1" ? "어드밴티지" : "타이브레이크"));
				} // if

			} // 세트 종료

		} // 경기종료

	}

	private static void tiebreakSet(int currentServer, String p1, String p2, 
			int gameScore1, int gameScore2, int setScore1, int setScore2 ) {

		Status status = new Status(p1, p2, false,setScore1,setScore2,gameScore1,gameScore2,0,0);
		status.isTieBreak = true;
		currentServer = (currentServer == 1) ? 2 : 1;

		Random rnd = new Random();
		int tieBreakPoint1 = 0;
		int tieBreakPoint2 = 0;
		int totalPoints = 0;

		System.out.println();

		status.player1Game = gameScore1;
		status.player2Game = gameScore2;

		while (true) {

			int point = rnd.nextInt(2) + 1;

			if (point == 1) {
				tieBreakPoint1++;
				status.tieBreakPoint1 = tieBreakPoint1;

			} else {
				tieBreakPoint2++;
				status.tieBreakPoint2 = tieBreakPoint2;
			}

			totalPoints++;

			// 서브는 득점 여부와 관계없이 2포인트마다 교체
			if (totalPoints % 2 != 0) {
				currentServer = (currentServer == 1) ? 2 : 1;
				status.serve = currentServer;
			}

			if ((tieBreakPoint1 > 6 || tieBreakPoint2 > 6) && Math.abs(tieBreakPoint1-tieBreakPoint2) >= 2) {

				System.out.printf("\n[Tiebreak Score]\n%s %d : %s %d\n", p1, tieBreakPoint1, p2, tieBreakPoint2);
				if (tieBreakPoint1 > tieBreakPoint2) {
					setScore1++;
					status.player1Set = setScore1;
				} else {
					setScore2++;
					status.player2Set = setScore2;
				}
				System.out.printf("\n[Set Win] %s %d : %d \n", (tieBreakPoint1 > tieBreakPoint2) ? p1 : p2, setScore1, setScore2 );

				// 한 세트 끝날때마다 게임 점수 초기화
				gameScore1 = 0;
				gameScore2 = 0;
				status.player1Game = gameScore1;
				status.player2Game = gameScore2;

				break;
			} 
			status.dispScoreBoard();
		}
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
