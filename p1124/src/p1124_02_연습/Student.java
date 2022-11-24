package p1124_02_연습;

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
//	{
//		count++;
//		stuNum = String.format("s%04d", count); //s0001, s0002, ... 학번이 자동으로 붙도록.
//	}

	Student() {
		count++;
		stuNum = String.format("s%04d", count); // s0001, s0002, ... 학번이 자동으로 붙도록.
	}

	Student(String name, int kor, int eng, int math) {
		count++;
		stuNum = String.format("s%04d", count); // s0001, s0002, ... 학번이 자동으로 붙도록.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
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

//	public String toString() {
//		return ""+stuNum+", "+name;
//	} // toString() 오버라이딩 안돼있으면 참조변수 print할 때 주소값만나옴.
//	 // 정의해놨으면 이 메소드로 참조변수의 내용 볼 수 있어. 

}
