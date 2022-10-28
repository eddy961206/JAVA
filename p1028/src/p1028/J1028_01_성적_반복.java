package p1028;

import java.util.Scanner;

public class J1028_01_성적_반복 {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0, score=0;
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0;
		String name = "", grade ="";
				
		//무한반복
		loop:
		while(true) {
			System.out.println("         [성적처리 프로그램]     ");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("-----------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt(); // 여기서 엔터 치면
			scan.nextLine(); //여기로 엔터가 입력됨
			System.out.println("");
			
			switch(choice) {
			case 1:
				System.out.println("[[ 성적입력 ]]");
				System.out.println();
				// 성적입력
				System.out.println("이름? : ");
				name = scan.nextLine(); // 띄어쓰기, 엔터를 입력받기위해 scan.nextLine()을 쓰려면 
									    //직전에 빈 scan.nextLine()으로 엔터를 흡수해버려야.
				System.out.println("국어? : ");
				kor = scan.nextInt();
				System.out.println("영어? : ");
				eng = scan.nextInt();
				System.out.println("수학? : ");
				math = scan.nextInt();
				total = kor + eng + math;
				avg = total/3.0;
				
				//성적입력 끝
				System.out.println("성적입력 완료되었습니다");
				System.out.println();
				break;
			case 2:
				System.out.println("[[ 성적출력 ]]	");
				System.out.println();
				//출력부분
				System.out.println("          [성적처리 프로그램]        ");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("----------------------------------------------------");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t", name, kor, eng, math, total, avg);
				//출력부분 끝
				break;
			case 3: // 성적 수정
				System.out.println("[[ 성적 수정 ]]"); 
				System.out.println("1. 국어 점수 수정");
				System.out.println("2. 영어 점수 수정");
				System.out.println("3. 수학 점수 수정");
				System.out.println("0. 이전화면으로 이동");
				System.out.println("---------------------");
				System.out.println("원하는 번호를 선택하세요");
				choice = scan.nextInt();
				if(choice ==1) {
					System.out.println("현재 국어점수 : "+kor);
					System.out.println("변경할 점수를 입력하세요>>");
					kor = scan.nextInt();
					total  = kor + eng + math;
					avg = total/3.0;		//	이 식들 다시 안쓰면 원래 입력했던 것들 그대로 나옴
					System.out.println("변경된 국어점수 : "+ kor);
				} else if(choice == 2) {
					System.out.println("현재 영어점수 : "+kor);
					System.out.println("변경할 점수를 입력하세요>>");
					eng  = scan.nextInt();
					total = kor +eng + math;
					avg = total/3.0;
					System.out.println("변경된 영어점수 : "+ eng);
				} else if(choice == 3)	{
					System.out.println("현재 수학점수 : "+ math);
					System.out.println("변경할 점수를 입력하세요>>");
					math = scan.nextInt();
					total = kor + eng + math;
					avg = total/3.0;
					System.out.println("변경된 수학점수 : " +math);
				} else if(choice == 0) {
					System.out.println("이전 페이지로 이동합니다");
					System.out.println();
					break; //이전 화면으로 돌아가기 case 3: 속한 스위치문 빠져나감 
				}
				System.out.println("점수가 변경되었습니다");
				System.out.println();
				break;
				
			case 0:
				System.out.println("[[프로그램 종료]]");
				System.out.println();
				break loop; //그냥 break만 쓰면 switch를 빠져나옴. 
				//while을 빠져나온 건 아님. 전체while의 이름인 loop를 붙여야
				
			}//switch
			
		}//while
		
	}//main

}//class
