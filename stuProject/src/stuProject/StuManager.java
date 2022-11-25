package stuProject;

import java.io.BufferedReader;
import java.util.Scanner;

public class StuManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuCal stuCal = new StuCal();
		String name = "";
		int choice = 0;
			
		stuCal.logIn();
						
		if(stuCal.flag == 1) {
			loop:
				while(true) {
					
					choice = stuCal.main_menu();
					
					switch (choice) {
					case 1: //1. 성적 입력
						stuCal.input_score();
						break;
					case 2: //2. 성적 출력 
						stuCal.print_score();
						break;
					case 3: //3. 성적 수정
						stuCal.modify_main();
						break;
					case 4: //4. 학생 검색
						stuCal.search_student();
						break;
					case 5: //5. 등수 처리
						stuCal.ranking();
						break;
					case 6: //6. 정렬 선택
						stuCal.sort();
						break;
					case 7: //7. 파일 불러오기
						stuCal.load();
						break;
					case 8: //8. 파일 저장하기
						stuCal.save();
						break;
					case 0:
						System.out.println("프로그램을 종료합니다...");
						break loop;
					}//switch
					
				}//while
		}
		
		
		
		
	} // main
} //class
