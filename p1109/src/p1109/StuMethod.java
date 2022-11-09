package p1109;

import java.util.Scanner;

public class StuMethod {
	// scan앞에 static붙여서 클래스변수로 만들어서 모든 메소드에서 사용 가능하게.
	static Scanner scan = new Scanner(System.in); 
	
	// 입력
	int input(int count, Stu[] s) {
		System.out.println("인원 수를 입력하세요 : ");
		count = scan.nextInt();
		System.out.println("홍길동을 뭘로 바꿀까요 : ");
		s[0].name = scan.next();
		return count;
	}
	
	// 수정
	
	
}
