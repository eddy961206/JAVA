package p1102;

import java.util.Scanner;

public class J1102_02_성적출력_2차원배열혼자 {
	public static void main(String[] args) {
		// 학생성적처리프로그램
		// 변수선언
		// 학생입력까지만 프로그램 하시오.

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;
		int checkNo = 1;
		String check = "";
		String[] name = new String[3];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];

		// 무한반복
		loop: while (true) {
			System.out.println("  [ 성적처리 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			loopInsert:
			switch (choice) {
			case 1: // 성적 입력
				System.out.println(" [[ 성적 입력 ]] ");
				while (count < 3) {
					for (int i = 0; i < 3; i++) {
						System.out.println((count + 1) + "번째 이름을 입력하세요 : (0. 뒤로 돌아가기)");
						check = scan.next();
						name[count] = check;
						if (check.equals("0")) {
							System.out.println("이전 페이지로 이동합니다.");
							break loopInsert;
						}
						System.out.println("국어 점수를 입력하세요 >> ");
						score[count][0] = scan.nextInt();
						System.out.println("영어 점수를 입력하세요 >> ");
						score[count][1] = scan.nextInt();
						System.out.println("수학 점수를 입력하세요 >> ");
						score[count][2] = scan.nextInt();
						count++;
					}
				}
				break;

			case 2: // 성적 출력
				System.out.println(" [[ 성적 출력 ]]");
				System.out.println("이름\t국어\t영어\t수학\t총합\t평균\n");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t",name[i]);
					for (int j = 0; j < count; j++) {
						System.out.printf("%");
					}
				}
				break;

			case 3: // 성적 수정

				break;

			case 0: // 시스템 종료
				System.out.println("시스템을 종료합니다..");
				break loop;

			}// 메인화면 선택 switch

		} // 무한반복 while

	}// main
}// class
