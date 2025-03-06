package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;

public class Ex08_02 {
	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\Ex10.java";
		char one = '\u0000';
		int code = -1;
		
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for (int i = '0'; i <= 'z'; i++) {
			if (Character.isAlphabetic(i)|| Character.isDigit(i)) {
				hm.put((char) i, 0);
			} // if
			
		} // for i
		
		try (FileReader reader = new FileReader(fileName);){
			
			String regex = "[A-Za-z0-9]";

//			while ( (code = reader.read()) != -1 ) {
//				one = (char) code;
//				hm.put(one, hm.getOrDefault(one, 0)+1);
//			} // while
			
			while ( (code = reader.read()) != -1 ) {
				// 'a'   ->  key  hm     ++1
				// if (  [A-Za-z0-9]  ) {
				if (  Character.isUpperCase(code) || Character.isLowerCase(code) || Character.isDigit(code)   ) {					
					one = (char) code;  // key 존재 유무 확인
//					int oldValue = hm.get(one);
//					hm.put(one, oldValue+1 );
					hm.put(one, hm.getOrDefault(one, 0)+1);
				} // if // if
			} // while

			// 막대그래프 그리기
			Set<Entry<Character, Integer>> set = hm.entrySet();
			Iterator<Entry<Character, Integer>> it = set.iterator();
			while (it.hasNext()) {
				Map.Entry<Character, Integer> entry = it.next();
				char key = entry.getKey();
				int value = entry.getValue();
				System.out.printf("%c(%d) %s\n", key, value, "#".repeat(value));
				
			}
			
//			int count = 0;
//			for (int i = 0; i < counts.length; i++) {      
//				// int[] -> IntStream
//				//               Arrays.stream(counts[i]).sum()
//				int totalCount = IntStream.of(counts[i]).sum();
//				System.out.printf("==%s:%d==\n"
//						,i==0?"대문자":(i==1?"소문자":"숫자")
//								,  totalCount );
//
//				for (int j = 0; j < counts[i].length; j++) {
//					count  = counts[i][j];
//					System.out.printf("%c(%d) %s\n", 
//							j+(i==0?'A':(i==1?'a':'0')), count, "#".repeat(count));
//				} // for j
//
//			} // for i


		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main

}
