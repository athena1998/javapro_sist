package days14;

public class Student {

	int no;
	String name;
	int kor, eng, mat, tot, rank, wRank;
	double avg;

	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
				, no
				, name
				, kor, eng, mat, tot
				, avg, rank, wRank); 
	}
}
