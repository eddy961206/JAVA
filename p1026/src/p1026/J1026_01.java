package p1026;

import java.util.Scanner;

public class J1026_01 {

	public static void main(String[] args) {

		// ctrl + shift + f --> 정렬

		// 영문자만 입력가정. 소->대, 대->소 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("영문자 입력하시오");
		String input = scan.next(); // String 입력 받고
		char ch = input.charAt(0); // 받은 String의 첫 글자를 char로 가져오기
		char chg = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : (char) (ch - 32);  // !!!!!!!!!!중요!!!!!!!!!!!
		System.out.println(chg);
		

//		// 다 받는다고 가정. 소->대, 대->소 출력하시오
//		String chg = (ch>='A' && ch<='Z')?(char)(ch+32)+"":((ch>='a' && ch<='z')?(char)(ch-32)+"":"영문자 아닙니다");
//		System.out.println(chg);
//		// 또는
//		if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {~~}

		// 880101-1(2)111111 , 020101-3(4)111111 주민번호 입력받고 남녀구분 출력하시오
//		Scanner scan = new Scanner(System.in);
//		System.out.println("주민번호 입력하시오(-포함)");
//		String input = scan.next();
//		char num = input.charAt(7);
//		String gen = (num == '1' || num == '3') ? "남자" : (num == '2' || num == '4') ? "여자" : "형식이 다릅니다";
////		String gen = (num == 1 || num == 3) ? "남자" : (num == 2 || num == 4) ? "여자" : "형식이 다릅니다";  //024922-4049502안됨
//		System.out.println(gen);

//		//입력한 수가 2의 배수인지 아닌지 출력하시오
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력하시오");
//		int input = scan.nextInt();
//		String str = (input%2 ==0 && input != 0)?"2의 배수입니다":(input != 0)?"2의 배수 아닙니다":"0입니다";
//		System.out.println(str);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력하시오");
//		int input = scan.nextInt();
//		String str = (input>0)?"양수":(input<0?"음수":"0");
//		System.out.println(str);

//		int num = 5;
//		String str = (num>=0)?"양수":"음수";
//		System.out.println(str); // 양수

//		int score = 50;
//		char grade = (score>90)?'A':((score>80)?'B':'C');
//		System.out.println(grade); //C

//        // 삼항연산자 사용. 웬만하면 if 사용
//		int x = -10;
//		int abs_x = (x>=0)?x:-x;    //절댓값 구하기. 
//		System.out.println(abs_x);  //10  
//		int a = -5;
//		System.out.println(Math.abs(a)); //메소드 사용 절댓값 구하기 // 5

//		char ch = 'a';
//		char ch2 = '7';
//		System.out.println('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'); // true  알파벳이냐?
//		System.out.println('0' <= ch2 && ch2 <= '9'); // true  숫자냐?

	}

}
