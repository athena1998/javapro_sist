package days25;

import java.io.FileWriter;

public class Ex06 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int kor = 90, eng = 87, mat = 76;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생정보를 파일로 저장
		String fileName = ".\\student.txt";
		
		try(FileWriter writer = new FileWriter(fileName, true)) {
			
			String data = String.format("%s,%d,%d,%d,%d,%.2f,%b\n", name, kor, eng, mat, tot, avg, gender);
			
			// 누적 작성
			writer.append(data);
			
			// 기존꺼 덮어쓰기
//			writer.write(data);
			writer.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("end");
		
	} // main

}
