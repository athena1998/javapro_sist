package days26;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> sticks = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sticks.add(sc.nextInt());
		}

		// 막대기들을 오름차순으로 정렬
		Collections.sort(sticks);

		// Cut operation 반복
		while (!sticks.isEmpty()) {
			System.out.println(sticks.size()); // 남은 막대기의 수 출력
			int cutLength = sticks.get(0); // 가장 작은 막대기 길이
//			sticks.removeIf(stick -> stick == cutLength); // 길이가 가장 작은 막대기들을 제거
			sticks.replaceAll(stick -> stick - cutLength); // 나머지 막대기들은 길이 자르기
			sticks.removeIf(stick -> stick == 0); // 길이가 0인 막대기들 제거
		}
	}
}
