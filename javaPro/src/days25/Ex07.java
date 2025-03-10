package days25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex07 {
	public static void main(String[] args) {

		String name = "이길동";
		int kor = 90, eng = 87, mat = 76;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;

		// 이 학생정보를 파일로 저장
		String fileName = ".\\student02.dat";

		try(FileOutputStream fos = new FileOutputStream(fileName, true);
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("end");

	} // main

}
