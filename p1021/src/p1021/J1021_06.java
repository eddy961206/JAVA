package p1021;

public class J1021_06 {

	public static void main(String[] args) {
		// 형변환 오버플로우 조심. byte short int long float double 순서
		int a = 65;
		char ch = (char)a;
		System.out.println(ch); //A
		System.out.println("------------------");
		
		char ch2 = 'a';
		int b = (int)ch2;
		System.out.println(b); //97
		
		float f = 1.6f;
		int c = (int)f;
		System.out.println(c); //1
		
		float f2 = (float)c;
		System.out.println(f2); //1.0
		
		System.out.println("------------------");

		
		//작은 타입을 큰 타입으로 변환할 땐 ()생략 가능.  
		byte bb = 100;
		int d = bb; //(byte)bb 생략
		
		//큰 타입을 작은 타입으로 변환할 땐 ()생략 불가
		long a2 = 1000L;
		int num1 = (int)a2;
	
		
	}

}
