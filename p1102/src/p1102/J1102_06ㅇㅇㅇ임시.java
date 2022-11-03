package p1102;

import java.awt.Choice;
import java.util.Scanner;

public class J1102_06ㅇㅇㅇ임시 {

	public static void main(String[] args) {

		// 변수 설정
		Scanner scan = new Scanner(System.in);
		String check = "";
		int choice = 0;
		int count = 0;
		int checkNo = 0;
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		int score[][] = new int[10][3];
		int total[] = new int[10];
		double avg[] = new double[10];
		int rank[] = new int[10];

		// 무한반복
		loop: while (true) {
			System.out.println("  [[ 성적확인 프로그램 ]]  ");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			choice = scan.nextInt();

			switch (choice) {
			case 1: //성적 입력

				while (count < name.length) {
					System.out.println("   [[ 성적 입력 ]]  ");
					System.out.printf("%d번째 이름을 입력하세요 : (0. 이전페이지로 돌아가기)", count+1);
					check = scan.next();

					if (check.equals("0")) {
						System.out.println("이전 화면으로 돌아갑니다\n\n");
						break;
					}
					name[count] = check;
					
					for(int i =0; i<3; i++) {
						System.out.printf("%s 점수를 입력하세요 : ",title[i+1]);
						score[count][i] = scan.nextInt();
					}
					
					System.out.printf("%d명의 성적입력이 완료되었습니다.\n", count + 1);
					System.out.println();
					count++;
				}

				break;
			case 2: //성적 출력
				System.out.println("   [[ 성적 출력 ]]  ");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("------------------------------------------------");
				for(int i =0; i<count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",name[i],score[i][0],score[i][1],score[i][2],
							total[i],avg[i],rank[i]);
				}
				break;
			case 3:

				break;
			case 0:

				break loop;
			}// 메인화면 고르는 switch

		} // 무한반복while

	} // main

}// class
