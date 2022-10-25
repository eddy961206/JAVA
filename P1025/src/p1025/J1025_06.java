package p1025;

public class J1025_06 {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 4;
		// printf, println 사용해서 아래 주석처럼 출력해
		// 10 + 4 = 14
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.println(a + " + " + b + " = " + (a+b));
		
		// 10 - 4 = 6
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.println(a + " - " + b + " = " + (a-b));
		
		// 10 * 4 = 40
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.println(a + " * " + b + " = " + a*b);
		
		// 10 / 4 = 2.5
		System.out.printf("%d / %d = %.1f\n",a,b,(double)a/b);
		System.out.println(a + " / " + b + " = " + (double)a/b);  //println은 소수점 자리수 맘대로 못정함
		
		
//		int a = 100;
//		int b = 100000000;
//		double d = 9.254567;
//		String name = "홍길동";
//		// 문자열 : %s, 정수형 : %d, 실수형 : %f, 문자 : %c, 논리형 : %b......
//		System.out.printf("이름:%s, 점수:%d, 평균:%010.3f\n", name,a,d); // %10.3f\n -> 소수점 3자리까지 나타내되 총 10칸 사용. 
//																	 // %010.3f -> 총 10칸 사용하되 앞쪽 빈 공백을 0으로 채움.
//		System.out.printf("%,020d",b);   // %,d -> 1,000 단위로 표시.  
										 // %,020d는 20칸을 차치하되 1,000단위로 표시하면서 빈 칸은 0으로 채움
		
	}

}
