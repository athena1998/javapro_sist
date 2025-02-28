package days20;

import java.text.ChoiceFormat;

/**
 * @author junginn
 * @date : 2025. 2. 28. - 오후 5:23:59
 * @subject	ChoiceFormat
 * 			ㄴ특정범위에 속하는 값을 문자열로 반환해주는 클래스
 * @content
 */
public class Ex12 {
	public static void main(String[] args) {
		int [] kors = { 100, 57,  95, 88, 77, 80, 0 };

		//		double[] limits = {0, 60, 70, 80, 90};
		//		String[] formats = {"가","양", "미", "우","수"};
		//		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		
		ChoiceFormat cf = new ChoiceFormat(newPattern);

		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d점 : %s 등급\n", kors[i], cf.format(kors[i]));
		}


	} // main

}
