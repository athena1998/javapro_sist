package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {
	 public static void main(String[] args) {
	      String fileName = ".\\src\\days23\\1차_조편성.txt";
	      String line = null;
	      
	      //          팀명	   팀원목록
	      // HashMap<String, ArrayList<String>>
//	      ArrayList<ArrayList<String>> class5 = new ArrayList<>();
	      LinkedHashMap<String, ArrayList<String>> class5 = new LinkedHashMap<>();
	      
	      String [] lineArr = null;
	      ArrayList<String> team = null;
	      
	      try (FileReader reader = new FileReader(fileName);
	         BufferedReader br = new BufferedReader(reader);){
	         
	         while ( (line = br.readLine())!= null) {
	            team = new ArrayList<String>(); //  
	            lineArr = line.split("[/:]"); 
	            String teamName = lineArr[0];
	            for (int i = 1; i < lineArr.length; i++) {
	               team.add( lineArr[i] );
	            } // for i
	            
	            class5.put(teamName, team);
	            
	         } // while
	         
	         // 각 팀원 출력형식 출력 
	         dispClass(class5);
	         
	      } catch (Exception e) {
	         System.out.println(e.toString());
	      }
	      
	      System.out.println("end");
	   } // main

	   // 반복자 사용해서 출력.
	 private static void dispClass(LinkedHashMap<String, ArrayList<String>> class5) {

		 Set<Entry<String, ArrayList<String>>> set= class5.entrySet();
		 Iterator<Entry<String, ArrayList<String>>> it = set.iterator();
		 
		 while (it.hasNext()) {
			 Entry<String, ArrayList<String>> team = it.next();
			 char seq = 'A';
			 System.out.printf("[%s]\n", team.getKey());
			 ArrayList<String> values = team.getValue();
			 for (String name : values) {
				 System.out.printf("\t%c. %s\n", seq++, name);
			}

		 } // while
	 } 


}
