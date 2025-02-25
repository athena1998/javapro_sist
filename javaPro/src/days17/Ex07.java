package days17;

/**
 * @author junginn
 * @date : 2025. 2. 25. - 오전 11:48:25
 * @subject 싱글톤(Singleton) 패턴
 * @content 
 */
public class Ex07 {
	public static void main(String[] args) {

		//BoardDAO dao = new BoardDAO();
		BoardDAO dao1 = BoardDAO.getInstance();
		BoardDAO dao2 = BoardDAO.getInstance();
		BoardDAO dao3 = BoardDAO.getInstance();
		BoardDAO dao4 = BoardDAO.getInstance();

		System.out.println(dao1.hashCode());
		System.out.println(dao2.hashCode());
		System.out.println(dao3.hashCode());
		System.out.println(dao4.hashCode());


	} // main

}


// 싱글톤 패턴

class BoardDAO {

	private static volatile BoardDAO boardDAO;

	// 외부에서 객체 생성 불가
	private BoardDAO () {

	}

	// Lazy Initialization(지연 초기화) : 멀티스레드에 안전하지 않다
	// 생성자가 private 이어서 객체 생성을 못하니까 여기서 생성
	/*
	public static BoardDAO getInstance() {
		// 첫 번째 호출 시에만 객체를 생성
		if (boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;

	}
	 */

	// Thread-Safe
	public static BoardDAO getInstance() {
		 // 첫 번째 if문으로 성능을 최적화
		if (boardDAO == null) {
			synchronized (BoardDAO.class) {
				// 동기화 블록 안에서만 인스턴스를 생성하도록 보장
				if (boardDAO == null) {
					boardDAO = new BoardDAO();
				} // if
			}
		}
		return boardDAO;
	}
}















