package 성적프로그램_최종시험연습;

import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) {
		StuCal stuCal = new StuCal();
		int choice = 0;
		loop : 
		while (true) {
			
			choice = stuCal.print_main();
			
			switch (choice) {
			case 1: //성적입력
				stuCal.input_score();
				break;
			case 2://성적출력
				stuCal.print_score();
				break;
			case 3://학생검색
				stuCal.student_search();
				break;
			case 4: //성적수정
				stuCal.edit_main(); // 동명이인 처리해야
				break;
			case 5://등수계산
				stuCal.ranking();
				break;
			case 6://파일로 저장
				stuCal.save();
				break;
			case 7://파일에 있는 거 불러오기
				stuCal.load();
				break;
			case 0://프로그램 종료
				System.out.println("프로그램 종료합니다..");
				break loop;

			} // switch
		}//while

	}//main

}//StuManager
