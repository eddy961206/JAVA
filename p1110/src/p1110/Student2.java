package p1110;

public class Student2 {
	String name;
	String check;
	int kor, eng, math, total, count, CheckNo, rank;
	double avg;

	Student2() {
	}

	Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = this.kor + this.eng + this.math;
		avg = total / 3.0;
	}

}
