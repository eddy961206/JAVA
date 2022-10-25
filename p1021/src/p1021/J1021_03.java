package p1021;

public class J1021_03 {

	public static void main(String[] args) {
		boolean power = true;
		char ch = 'A';
		char ch2 = '\u0041'; //16진수로 나타낸 A
		char ch3 = '\t'; //탭
		char ch4 = 'B';
		char ch5 = '\n'; //줄바꿈
		char ch6 = 65; //10진으로 표현한 A. char에만 알파벳 아스키코드 숫자 넣어야 문자로 나옴
		byte b = 127;
		short s = 32767; 
		int oct = 0100; // 0~~ : 8진수
		int hex = 0x100; // 0x~~ : 16진수
		
		System.out.print(ch);
		System.out.print(ch5);
		System.out.print(ch4);
		System.out.print(ch6);
		System.out.println();
		System.out.println(oct);  //println은 무조건 10진수로만 찍어냄. 64.
		System.out.println(hex); //256
		
		System.out.println("------------------");
		
		long num = 10000000000L;  //int는 21억까지만. int가 정수의 기본형. long에는 웬만하면 L붙여
		float f = 3.14f; //float 무조건 f 붙여. f안붙은 실수 있으면 double.
		float ff = 100f; // .0 알아서 붙여줌
		double d = 3.14; //실수의 기본형이 double이라 d 안붙여도 됨. 소수점 쓰는 거면 웬만하면 !!double!! 사용 권장. 
		System.out.println(ff); //100.0
		
		char c1 = ' '; //char는 빈칸 쓰려면 한 칸 띄워.
		System.out.println((int)c1); //32가 아스키코드로 space.
		String s1 = ""; //string은 아무것도 안넣어도 돼
		char c2 = ' ';
		char c3 = 'a';
		System.out.println(c2);
		
		
	}

}
