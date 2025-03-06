package days23;

import java.util.HashMap;
import java.util.Map;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 *  Map
		 *  1. 키-값 쌍으로 데이터를 저장하는 구조 
		 *  	entry(엔트리)
		 *  2. 키는 중복허용 X 
		 *  3. Map 인터페이스를 구현한 클래스
		 *  	1) HashMap = ArrayList와 비슷
		 *  	2) HashTable (구버전, 멀티스레드 안전 (동기화처리) Vector와 비슷
		 *  		hash - 해싱이라는 기법을 사용해서 데이터를 저장 -> 검색 성능이 뛰어남
		 *  
		 *  		해싱기법 - 해시함수 (Hash Fuction)를 이용해서
		 *  					데이터를 해시테이블에 저장하고 검색하는 기법
		 *  					해시함수는 데이터가 저장되어 있는 곳을 알려주기 때문에
		 *  					다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다. 
		 *  
		 *  	3) TreeMap - 검색, 정렬
		 *  	4) LinkedHashMap - 순서 유지
		 */

		HashMap<String, String> hm = new HashMap<String, String>();
//		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("kim", "admin");
		hm.put("lee", "user1");
		hm.put("park", "user2");
		
		System.out.println(hm);
		
		// 검색, 수정, 삭제
		// "kim" 
		hm.containsKey("kim");
		hm.containsValue("lee");
		
		if (hm.containsKey("kim")) {
			String value = hm.get("kim");
			System.out.println(value);
			hm.put("kim", "user1");
		} // if
		
		System.out.println(hm);
		
		hm.put(null, null);
		
		System.out.println(hm);
		hm.remove(null);
		
		System.out.println(hm);
//		hm.clear();
		
		String value = hm.getOrDefault("abc", "0");
		System.out.println(value);
		
		Map<String, Integer> map = new HashMap<>();

		// 초기 데이터 추가
		map.put("apple", 1);
		map.put("banana", 2);

		// merge() 메서드 사용 예
		map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값
		map.merge("banana", 1, (oldValue, newValue) -> oldValue + newValue); // 기존 값 + 새 값
		map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장

		System.out.println(map);
		
	} // main

}
