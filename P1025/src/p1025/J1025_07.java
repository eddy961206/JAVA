package p1025;

import java.util.Scanner;

public class J1025_07 {

	public static void main(String[] args) {

		// 실수 입력받아 소수점 n자리에서 반올림해
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 입력하시오");
		double input = scan.nextDouble();
		System.out.println("소수점 반올림 하고싶은 자리수 입력하시오");
		int n = scan.nextInt();
		double jari = Math.pow(10, n-1); // 10의 n-1제곱
		System.out.println(Math.round(input*jari)/jari);
//		System.out.println(Math.round(input*10)/10.0);
		
		
//		System.out.println(Math.round(12.56874*1000)/1000.0); //4째자리에서 반올림. //타입 : long
//		System.out.println(Math.ceil(12.56874));  //타입 : double
//		System.out.println(Math.floor(12.56874)); //타입 : double
//		
//		double a = 25.687945;
//		//4자리에서 반올림, 올림, 내림
//		System.out.println(Math.round(a*1000)/1000.0);
//		System.out.println(Math.ceil(a*1000)/1000.0);
//		System.out.println(Math.floor(a*1000)/1000.0);
		
		
//		int a = 1000000;
//		int b = 1000000;
//		// a+b, -*/를 출력해
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println((long)a*b);  //1000000000000  21억 넘으니까 형변환해야
//		System.out.println((double)a/b);
		
		
	}

}
