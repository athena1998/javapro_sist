package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_02 {
	public static void main(String[] args) {

		String strMoney = "₩ 3,455,600";

		// [1]
		//		int money = Integer.parseInt(strMoney.replace(",", ""));
		//		System.out.println(money);

		// [2] DecimalFormat 
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			int money = n.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 숫자 -> 형식화된 문자열 : df.format()
		// 형식화된 문자열 -> 숫자 : df.parse()


	} // main
}
