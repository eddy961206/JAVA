package p1102;

import java.util.Scanner;

public class J1102_03_성적출력_2차원배열활용_재연습 {
	public static void main(String[] args) {

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0; // 번호선택
		// 데이터변수 선언 - 이름,국영수,합계,평균
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[10];
		int[][] score = new int[10][3]; // 10명x3과목
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; // 인원수
		String check = ""; // 이전 페이지 이동할건지 체크용
		int checkNo = 0; // 수정할 학생 인덱스
		int flag = 0; // 수정할 학생이 없을경우

		// 무한반복
		loop: while (true) {
			// 1. 화면 출력
			System.out.println(" [ 성적처리 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			choice = scan.nextInt();

			// 메인 화면에서 번호선택
			switch (choice) {
			case 1: // 성적입력
				System.out.println("[[ 성적 입력 ]]");

				// 10명 학생 확인
				while (count < name.length) {
					// 이름 입력
					System.out.printf("%d번째 이름을 입력하세요 (0.이전 페이지로 이동)>> \n", (count + 1));
					check = scan.next();
					if (check.equals("0")) {
						System.out.println("이전 페이지로 이동합니다");
						System.out.println();
						break; // while 성적입력 빠져나감
					} // if
					name[count] = check;

					// 점수 입력
					for (int i = 0; i < 3; i++) {
						System.out.printf("%s 점수를 입력하세요 >> \n", title[i + 1]);
						score[count][i] = scan.nextInt();
					} // for

					// 합계,평균
					total[count] = score[count][0] + score[count][1] + score[count][2];
					avg[count] = total[count] / 3.0;

					System.out.printf("%d명의 성적입력이 완료되었습니다.\n", count + 1);
					count++; // 인원수 1증가
				} // while count가 3미만인 동안 반복

				break; // switch case1 성적입력 빠져나가기
			case 2:
				// 상단 title
				System.out.println("[[ 성적 출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("-----------------------------------------------");
				// 학생출력
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i]);
				}
				break;
			case 3: // 성적 수정
				System.out.println("[[ 성적 수정 ]]");
				System.out.println("수정할 학생의 이름을 입력하세요 >>");
				check = scan.next();

				// 수정하려는 학생 검색
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) {
						System.out.printf("%s 학생이 검색되었습니다", name[i]);
						System.out.println();
						checkNo = i;
						flag = 1; // 검색되는 경우
						break;
					} // if
				} // for

				// 수정하려는 학생이 없어서 검색되지 않을 경우
				if (flag == 0) {
					System.out.println("해당 학생이 조회되지 않습니다. 다시 확인하세요");
					break;
				} // if

				flag = 0; // 학생이 검색되는 경우 다시 리셋

				// 점수 수정화면 출력
				System.out.printf("[ %s 학생의 성적 수정 ]\n", name[checkNo]);
				System.out.println("1. 국어점수 수정");
				System.out.println("2. 영어점수 수정");
				System.out.println("3. 수학점수 수정");
				System.out.println("0. 수정 취소");
				System.out.println("----------------------------");
				System.out.println("수정할 과목을 선택하세요.>>");
				choice = scan.nextInt();
				
				// 수정 취소
				if(choice ==0) {
					System.out.println("성적 수정이 취소되었습니다.");
					System.out.println();
					break;
				}//if
				
				
				//성적 수정
				System.out.printf("현재 %s점수 : %d\n", title[choice], score[checkNo][choice-1]);
				System.out.printf("수정할 %s점수 입력 : \n", title[choice]);
				score[checkNo][choice-1] = scan.nextInt();
				// 합계 = 국 + 영 + 수
				total[checkNo] = score[checkNo][0] + score[checkNo][1] + score[checkNo][2];
				avg[checkNo] = total[checkNo] / 3.0;
				
				
				System.out.printf("%s점수가 %d점으로 변경되었습니다.\n", title[choice],score[checkNo][choice-1]);
				System.out.println();
				
				

				break; // 3. 성적 수정 switch break. 메인메뉴로 돌아감.
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			}// switch

		} // while
		System.out.println("프로그램이 완전 종료되었습니다.");
	}// main
}// class
