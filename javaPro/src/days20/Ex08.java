package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

/**
 * @author junginn
 * @date : 2025. 2. 28. - 오후 3:12:14
 * @subject	달력 그리기
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		// [일정관리/근태관리] => 달력
		// 년도와 월 입력 => 달력 ? 
		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);
	} // main


	private static void printCalendar(int year, int month) {
		Calendar startDate = getStartDate(year, month);
//		System.out.println(getCalendar(startDate));

		System.out.printf("\t\t[%d년 %d월]\n", year, month);
		Graphic2D.drawLine(65, "-");
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c" , week.charAt(i));
		} // for i
		System.out.println();
		Graphic2D.drawLine(65, "-");
		
		Calendar c = Calendar.getInstance();
		int today = c.get(Calendar.DATE);

		// 1의 날짜 위치 for문
		Graphic2D.drawLine(65, "-");
		for (int i = 0; i < 42; i++) {
			int date = startDate.get(Calendar.DATE);
			
			if (today == date) {
				System.out.printf("\t[%d]", date);
			} else {
				System.out.printf("\t%d", date);
			}
			
			
			if (i % 7 == 6) {
				System.out.println();
			} // if
			
			startDate.add(Calendar.DATE, 1);
		}

		System.out.println();
//		Graphic2D.drawLine(65, "-");

	} // printCalendar

	private static Calendar getStartDate(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);

		return c;
	}


	public static String getCalendar(Calendar c) {
		return String.format("%d, %02d, %02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}
}
