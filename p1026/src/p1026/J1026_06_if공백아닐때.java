package p1026;

import java.util.Scanner;

public class J1026_06_if공백아닐때 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		boolean power = false; //true:켜짐, false:꺼짐 가정
//		if(power) { // if(power)는 if(power==true)와 같은 말
//			System.out.println("컴퓨터 켜져있습니다");
//		} else {
//			System.out.println("컴퓨터 꺼져있습니다");
//		}
		
		char ch = ' ';
		System.out.println("문자 입력하세요");
		String str = scan.next();
		if(str!=null&&!str.equals("")) {  //입력받은게 공백이 아니면
			ch = str.charAt(0);		 // 변수 선언은 if 안에서 웬만하면 하지 말고 밖에서 미리 해놔	
		}
		System.out.println(ch);
		
		
//		if(ch!=null&&ch!equals("")) {
//			char ch = str.charAt(0);			
//		}
//		System.out.println(ch);
		
		
		
		
		
//		boolean b = true;
//		b = !b;
//		if(!(b==true)) {
//			System.out.println("false일때만 출력");
//		}
	
		
		
//		System.out.println("한 자리 숫자를 입력하세요");
//		String str = scan.next();
//		// 입력한 문자열 길이를 확인, str.charAt(0)
//		if ('0' <= str.charAt(0) && str.charAt(0) <= '9') {
//			if (str.length() == 1) {
//				System.out.println("입력한 한자리 숫자 : " + str.charAt(0));
//			} else {
//			    System.out.println("한 자리 아님. 입력한 숫자 길이 : " + str.length());
//			}
//		} else {
//			System.out.println("숫자가 아닙니다 다시 입력하세요");
//		}

		
		
//		System.out.println("정수 입력하세요");
//		int input = scan.nextInt();
//		if (input % 5 == 0) {
//			System.out.println("5의 배수입니다");
//		} else {
//			System.out.println("5의 배수 아닙니다");
//		}

	}

}
