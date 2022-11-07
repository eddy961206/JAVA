package p1107;

public class J1107_10 {

	public static void main(String[] args) {

		String[] name = { "홍길동", "유관순", "이순신" };
		int[] kor = { 100, 99, 88 };
		int[] eng = { 99, 98, 87 };
		int[] total = new int[3];
		double[] avg = new double[3];
		Stu s = new Stu();

		// [학생 1]
		// 이름 : 홍갈동
		// 국어점수 : 100
		// 영어점수 : 100
		// 합계 : 200
		// 평균 : 100
		// [학생 2]
		// ..... 3명 까지

		for (int i = 0; i < name.length; i++) {
			s.print(i, name[i], kor[i], eng[i]);  //메소드 호출
		}

	}

}
