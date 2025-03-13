package Tennis;

enum Score {
	   LOVE(0), FIFTEEN(15), THIRTY(30), FOURTY(40), AD(41);

	    private final int point;

	    Score(int point) {
	        this.point = point;
	    }

	    public int getPoint() {
	        return point;
	    }
	    
	    public static String getPointNameByPoint(int point) {
	        for (Score score : Score.values()) {
	            if (score.getPoint() == point) {
	                return score.name(); // 존재하면 enum 이름 반환
	            }
	        }
	        return ""; // 없으면 빈 문자열 반환
	    }
	}

	interface IRun{
	   boolean pointWinner(int p);
	   void dispScoreBoard();
	}

	class Status implements IRun{
	   Score pointName;// = Score.getPointNameByPoint(0);;
	   
	   String playerName1;
	   String playerName2;
	   String temName1;
	   String temName2;
	   

	   int serve = 1;
	   
	   int player1Point;
	   int player2Point;
	   
	   int player1DuecePoint = 0;
	   int player2DuecePoint = 0;
	   
	   int player1Game;
	   int player2Game;
	   
	   int player1Set;
	   int player2Set;
	   
	   boolean bDual = false;
	   boolean bDuece = false;
	   
	   boolean isAdvantagePlayer1 = false;  // 어드밴티지 상태 설정
	   boolean isAdvantagePlayer2 = false;

	   public Status(String Name1, String Name2, boolean bDual, int ...args) {
	      super();
	      
	      this.bDual = bDual;      
	      
	      if(!bDual)
	      {
	         playerName1 = Name1;
	         playerName2 = Name2;
	         temName1 = "";
	         temName2 = "";
	      }
	      else
	      {
	         playerName1 = "";
	         playerName2 = "";
	         temName1 = Name1;
	         temName2 = Name2;
	      }
	      this.player1Point = args.length > 0 ? args[0] : 0;
	      this.player2Point = args.length > 1 ? args[1] : 0;
	      this.player1Game = args.length > 2 ? args[2] : 0;
	      this.player2Game = args.length > 3 ? args[3] : 0;
	      this.player1Set = args.length > 4 ? args[4] : 0;
	      this.player2Set = args.length > 5 ? args[5] : 0;
	      this.player1DuecePoint = args.length > 6 ? args[6] : 0;
	      this.player2DuecePoint = args.length > 7 ? args[8] : 0;
	   }   
	   
	   public int getServe() {
	      return serve;
	   }
	   public void setServe(int serve) {
	      this.serve = serve;
	   }

	   public int getPlayer1Point() {
	      return player1Point;
	   }
	   public void setPlayer1Point(int player1Point) {
	      this.player1Point = player1Point;
	   }

	   public int getPlayer2Point() {
	      return player2Point;
	   }
	   public void setPlayer2Point(int player2Point) {
	      this.player2Point = player2Point;
	   }

	   public int getPlayer1Game() {
	      return player1Game;
	   }

	   public void setPlayer1Game(int player1Game) {
	      this.player1Game = player1Game;
	   }

	   public int getPlayer2Game() {
	      return player2Game;
	   }
	   public void setPlayer2Game(int player2Game) {
	      this.player2Game = player2Game;
	   }

	   public int getPlayer1Set() {
	      return player1Set;
	   }
	   public void setPlayer1Set(int player1Set) {
	      this.player1Set = player1Set;
	   }

	   public int getPlayer2Set() {
	      return player2Set;
	   }

	   public void setPlayer2Set(int player2Set) {
	      this.player2Set = player2Set;
	   }

	   
	   @Override
	   public boolean pointWinner(int p) {
	      // TODO Auto-generated method stub
	      return false;
	   }

	   @Override
	   public void dispScoreBoard() {
	      String sMsg;
	      
	      /*
	       * 한 플레이어가 2점차 이상으로 40에 도달하면 승리
	       * 듀스상태에서 한 플레이어가 2점차 이상이면 승리
	       * ......................
	       */
	      
	      
	      sMsg = "\nPlayer\t\tServe\tSet\tGame\tPoint\n";
	      sMsg += "-".repeat(60) + "\n";         
	      sMsg += String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName1, (serve == 1 ? "Serve" : ""), player1Set, player1Game, (!bDuece ? player1Point : Score.getPointNameByPoint(player1Point)));
	      sMsg += String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName2, (serve == 2 ? "Serve" : ""), player2Set, player2Game, (!bDuece ? player2Point : Score.getPointNameByPoint(player2Point)));
	      
	      if(bDuece)
	      {
	         String AdvPlayer1 = (player1Point == 41 ? playerName1 : "") + "   ";
	         String AdvPlayer2 = (player2Point == 41 ? playerName2 : "") + "   ";

	         sMsg += String.format("\nSpeak > %s\n", (serve == 1 ? AdvPlayer1 + Score.getPointNameByPoint(player1Point) + "  " + AdvPlayer2 + Score.getPointNameByPoint(player2Point) 
	         : AdvPlayer2 + Score.getPointNameByPoint(player2Point) + "  " + AdvPlayer1 + Score.getPointNameByPoint(player1Point)));
	      }
	      else {
	         if(player1Point != 40 || player2Point != 40) {         
	            sMsg += String.format("\nSpeak > %s\n", (serve == 1 ? Score.getPointNameByPoint(player1Point) + "  " + Score.getPointNameByPoint(player2Point) 
	            : Score.getPointNameByPoint(player2Point) + "  " + Score.getPointNameByPoint(player1Point)));
	         }
	         else {//Duece
	            sMsg += String.format("\nSpeak > %s\n", "Duece");
	            bDuece = true;
	         }         
	         sMsg += "=".repeat(60);
	      }      
	      
	      System.out.println(sMsg);
	      
	   }   
	}