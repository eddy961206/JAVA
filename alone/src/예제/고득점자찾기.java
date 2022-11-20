package 예제;

import java.util.Arrays;

//자바 프로그래밍 시험에서 B+ 학점을 넘기면 장학금을 탈 수 있게 된 Kate(21) 학생. 과연 장학금의 행방은 어디로!?

//최고 득점자를 출력하는 프로그램을 작성하시오.

class Student {
	String name;
	int score;
	int rank;

	public Student() {
		this("무명", 0);
	}

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}


}

public class 고득점자찾기 {

	public static void main(String[] args) {
		Student[] s = new Student[9];
		s[0] = new Student("Elena", 65);
		s[1] = new Student("Suzie", 74);
		s[2] = new Student("John", 23);
		s[3] = new Student("Emily", 75);
		s[4] = new Student("Neda", 68);
		s[5] = new Student("Kate", 96);
		s[6] = new Student("Alex", 88);
		s[7] = new Student("Daniel", 98);
		s[8] = new Student("Hamilton", 54);

		// 등수 처리
		for (int i = 0; i < s.length; i++) {
			s[i].rank = 1;
			for (int j = 0; j < s.length; j++) {
				if (s[i].score < s[j].score) {
					s[i].rank++;
				}
			} // for
		} // for

		// 등수출력 (순서대로)
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				while (true) {
					if (s[j].rank == i + 1) {
 						System.out.printf("%d등 : %s\t%d점\n", s[j].rank, s[j].name, s[j].score);
					}
					break;
				} // while
			} // for
		} // for

//		// 등수 출력(순서X)
//		System.out.println("등수 확인 : ");
//		for (int i = 0; i < s.length; i++) {
//			System.out.printf("%d등 : %s\n",s[i].rank,s[i].name);
//		}

	}// main

}// class
