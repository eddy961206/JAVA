package p1110_02;

public class Test01 {
	public static void main(String[] args) {
		int choice = 0;
		StuCal stuCal = new StuCal();
		
		loop:
		while(true) {
			choice = stuCal.screen_print();
			
			switch(choice) {
			case 1: // 성적입력
				stuCal.score_input();
				break;
			case 2:
				stuCal.score_print();
				break;
			case 3:
				stuCal.score_modify();
				break;
			case 4:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} //메인화면 선택 switch
			
			
		}// 무한반복while
		
		
		
		
	}//main
	
}//class
