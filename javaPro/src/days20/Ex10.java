package days20;

import java.text.DecimalFormat;import javax.management.monitor.Monitor;

public class Ex10 {
	public static void main(String[] args) {

		/*
		 * 형식화 클래스
		 * 	ㄴ java.text 패키지에 있는 클래스
		 * 	ㄴ 숫자, 날짜, 문자열 아래 데이터를 일정한 형식에 맞춰
		 * 		표현할 수 있는 메서드를 제공하는 클래스
		 * 	1. DecimalFormat : 숫자를 형식화하는 클래스
		 * 	2. SimpleDateFormat
		 * 	3. ChoiceFormat
		 * 	4. MessageFormat
		 * 
		 */

		int money = 3275000;

		// [1]
		String.format("%,d", money);
		System.out.printf("%,d\n", money);

		// [2]
		String pattern = "\u00A4 #,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);

	} // main
}
