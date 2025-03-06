package days23;

// alt + shift + o : 전체 임포트
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06_02 {
	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();
//		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("kim", "admin");
		hm.put("lee", "user1");
		hm.put("park", "user2");

		System.out.println(hm);
		
		// 모든 키 출력
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("-".repeat(50));
		
		
		Collection<String> cs = hm.values();
		Iterator<String> it2 = cs.iterator();

		while (it2.hasNext()) {
			String key = (String) it2.next();
			System.out.println(key);
		}
		
		Set<Entry<String, String>> entrySet =  hm.entrySet();
		Iterator<Entry<String, String>> it1 = entrySet.iterator();
		while (it1.hasNext()) {
			Map.Entry<String, String> entry = it1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
			
		}
		
	} // main

}
