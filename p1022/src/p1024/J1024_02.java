package p1024;

public class J1024_02 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
//		int c = a + b;
		
		char ch1 = '9';
		char ch2 = '0';	//48
		char ch3 = 'a';	//97
		char ch4 = 'A';	//65
		
		char ch5 = ++ch3; //b. char변수에 ++,-- 사용가능 
//		char ch6 = (char)(ch3 + 1);
		int ch6 = ch3 + 3;
		System.out.println(ch5);  // 아스키코드 98은 b.
		
		float f = 1.0f;
		float result = f + a; // a=10
		
		double dd = 1.0;
		dd = dd + a; //11.0 
	
		
	}
}
