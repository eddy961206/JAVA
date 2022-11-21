package p1121_03_학생성적_ArrayList활용;

public class Student {
	static int count;
	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// 초기화블럭. 어느 생성자가 실행되든 얘가 다 실행.
	{
		count++;
		stuNum = String.format("s%04d", count); //s0001, s0002, ... 학번이 자동으로 붙도록.
	}
	
	Student() {}
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
}
