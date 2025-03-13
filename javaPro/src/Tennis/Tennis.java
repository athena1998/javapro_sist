package Tennis;

public class Tennis {
	public static void main(String[] args) {
		
		// 							선수1	 선수2 	   복식/단식  	세트번호	게임번호	포인트??	듀스 포인트??		??		??
        Status status = new Status("홍길동", "강아지", false, 		0, 			0, 			0, 			0, 					0, 		0);
        
        status.player1Point = 15;
        status.dispScoreBoard();
        status.player2Point = 15;
        status.dispScoreBoard();
        status.player2Point = 30;
        status.dispScoreBoard();
        status.player1Point = 40;
        status.dispScoreBoard();
        status.player2Point = 40;
        status.dispScoreBoard();
        
        status.player2Point = 41; //p2 Advantage
        status.player1Point = 50; //p1 ""
        status.dispScoreBoard();
        
        status.player1Point = 41; //p1 Advantage
        status.player2Point = 50; //p2 ""
        
        status.dispScoreBoard();
    }

}
