package p1109;

public class J1109_02_생성자사용학생입력 {
	public static void main(String[] args) {
		// 기본생성자 사용 객체선언
		Stu s1 = new Stu();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 99;
		s1.total = s1.kor + s1.eng;
		s1.avg = s1.total / 2.0;

		// 매개변수 3개짜리 생성자 사용 객체선언
		Stu s2 = new Stu("유관순", 90, 99);
	    
		
	}

}
