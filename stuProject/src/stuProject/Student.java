package stuProject;

public class Student {
	String stuNum;
	static int count;
	String name;
	int kor,eng,math,total,rank;
	double avg;
	
	public Student() {
		count++;
		stuNum = String.format("s%04d",count);
	}
	
	Student(String name, int kor, int eng, int math){
		count++;
		stuNum = String.format("s%04d",count);
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	
	public Student(String stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}

	public String toString() {
		return String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n",stuNum,name,kor,eng,math,total,avg,rank);
				
	}
	
}
