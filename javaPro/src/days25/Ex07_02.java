package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex07_02 {
	public static void main(String[] args) {


		// 이 학생정보를 파일로 저장
		String fileName = ".\\student02.dat";
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		try(FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis)) {
			
			while (dis.available() > 0) {
				name = dis.readUTF();
				kor = dis.read();
				eng = dis.read();
				mat = dis.read();
				tot = dis.read();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
						, name, kor, eng, mat, tot, avg, gender);
			} // while

		} catch (EOFException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end");

	} // main

}
