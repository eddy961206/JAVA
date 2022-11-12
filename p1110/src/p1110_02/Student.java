package p1110_02;

public class Student {
	String name;
	int kor, eng, math, total, rank;
	double avg;

	Student() {

	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = this.kor + this.eng + this.math;
		avg = total / 3.0;
	}
}
