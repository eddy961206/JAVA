package p1121_03_학생성적_ArrayList활용;

public class StuManager {

	public static void main(String[] args) {
		int choice = 0;
		StuCal stuCal = new StuCal();

		loop: while (true) {
			//화면출력메소드 호출
			choice = stuCal.screen_print();

			switch (choice) {
			case 1: // 1. 성적 입력
				stuCal.score_input();
				break;
			case 2: // 2. 성적 출력
				stuCal.score_print();
				break;
			case 3: // 3. 성적 수정
				stuCal.score_modify();
				break;
			case 4:// 4. 학생 검색
				stuCal.rank();
				break;
			case 5:// 5. 등수 계산
				
				break;
			case 0:// 0. 프로그램 종료
				
				System.out.println("[[프로그램 종료]]");
				break loop;
			}

		} // while

	}// main

}// class
