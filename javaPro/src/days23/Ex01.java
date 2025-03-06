package days23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("게임 횟수 입력 : ");
//		int turn = sc.nextInt();
//		
//		for(int i=1; i<=turn; i++) {
//			System.out.printf("[%d번째] ", i);
//			Random rnd = new Random();
//			
//			HashSet<Integer> set = new HashSet<Integer>(6);
//			while (set.size() < 6) {
//				set.add(rnd.nextInt(45)+1);
//			} // while
//	
//			ArrayList<Integer> list = new ArrayList<Integer>(set);
//			Collections.sort(list);
//			
//			Iterator<Integer> it = list.iterator();
//			while (it.hasNext()) {
//				int num = (int) it.next();
//				System.out.printf("[%02d]", num);
//			}
//			System.out.println();
//		}
		
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);) {
			String str;
			while ((str = br.readLine()) != null) {
				char ch = 'A';
				String[] split = str.split("[/|:]");
				System.out.printf("[%s]\n", split[0]);
				for (int i = 1; i < split.length; i++) {
					System.out.printf("\t%c. %s\n", ch++, split[i]);
				} // for i
				System.out.println();
			} // while

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e1) {
			System.out.println(e1.toString());
		}
		
		
//		String fileName = ".\\src\\days23\\1차_조편성.txt";
//		try(FileReader reader = new FileReader(fileName);
//				BufferedReader br = new BufferedReader(reader);) {
//			String str;
//			while ((str = br.readLine()) != null) {
//				ArrayList<String> list = new ArrayList<String>();
//				char ch = 'A';
//				String[] split = str.split("[/|:]");
//				System.out.printf("[%s]\n", split[0]);
//				for (int i = 1; i < split.length; i++) {
//					list.add(split[i]);
//					System.out.printf("\t%c. %s\n", ch++, list.get(i-1));
//				} // for i
//				System.out.println();
//			} // while
//
//		} catch (FileNotFoundException e) {
//			System.out.println(e.toString());
//		} catch (IOException e1) {
//			System.out.println(e1.toString());
//		}
		
//		String fileName = ".\\src\\days23\\1차_조편성.txt";
//		String line = null;
//
//		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
//
//		String [] lineArr = null;
//		ArrayList<String> team = null;
//
//		try (FileReader reader = new FileReader(fileName);
//				BufferedReader br = new BufferedReader(reader);   ){
//
//			while ( (line = br.readLine())!= null) {
//				team = new ArrayList<String>(); //  
//				lineArr = line.split("[/:]"); 
//				for (int i = 1; i < lineArr.length; i++) {
//					team.add( lineArr[i] );
//				} // for i
//
//				class5.add(team);
//
//			} // while
//
//			// 각 팀원 출력형식 출력 
//			dispClass(class5);
//
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
//
//		System.out.println("end");
		
	} // main

	private static void dispClass(ArrayList<ArrayList<String>> class5) {
		
		Iterator<ArrayList<String>> ir = class5.iterator();
		int teamNum = 1;
		while (ir.hasNext()) {
			System.out.printf("[%d조]\n", teamNum++);
			ArrayList<String> team = ir.next();
			
			Iterator<String> ir2 = team.iterator();
			char ch = 'A';
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf("\t%c.%s\n", ch++, name);
			}
			System.out.println();
			
		}
		 
		
		
		
	}

}












