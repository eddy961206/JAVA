package p1109;

public class J1109_03_객체학생_입출력 {

	public static void main(String[] args) {
		// 3명의 학생객체선언

		int count = 0;
		StuMethod stu = new StuMethod();
		
		// 배열선언. //s는 객체가 담긴 배열의 주솟값. s를 메소드에 넣어주면 내용물 return없이 편집/저장가능. 참조변수니까.
		Stu[] s = new Stu[3]; 
		s[0] = new Stu("홍길동", 100, 99);
		s[1] = new Stu("유관순", 90, 99);
		s[2] = new Stu("이순신", 99, 98);
		count = 3;

		// 출력

		// input 메소드 호출 후 결괏값 출력
		// 홍길동 -> 홍길순으로 변경 후 출력
		count = stu.input(count, s);
		
		System.out.println("인원 수 : \n" + count);
		System.out.printf("이름\t국어\t영어\t합계\t평균\n");
		System.out.println("--------------------------------------");
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%.2f\n", 
					s[i].name, s[i].kor, s[i].eng, s[i].total, s[i].avg);
		}

	}

}
