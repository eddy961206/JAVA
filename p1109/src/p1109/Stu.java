package p1109;

public class Stu {
	String name;
	int kor;
	int eng;
	int total;
	double avg;

	// 기본생성자
	Stu() {}

	// 매개변수 3개짜리 생성자
	Stu(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		total = kor + eng;  //매개변수에 total이랑 avg 없으니까
		avg = total / 2.0;  //this 없어도 알아서 iv로 인식함
	}

}
