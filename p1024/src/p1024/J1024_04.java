package p1024;

import java.util.Scanner;

public class J1024_04 {
	public static void main(String[] args) {
		
		//소수점 첫째자리에서 반올림. 1.8되게
		// Math.round() -> 무조건 소수점 첫째자리에서 반올림. long으로 리턴. 정수만.
		double num = 1.75478;
		// num * 10 = 17.5478
		// Math.round(num*10) = 18
		// Math.round(num*10)/10.0 = 1.8
		System.out.println(Math.round(num*10)/10.0); //1.8
		
		//소수점 5째 자리에서 반올림
		System.out.println(Math.round(num*10000)/10000.0);
		
		
		// Math.round():반올림, Math.floor():버림, Math.ceil:올림

		
		double num2 = 45.78956;
		
		//3자리 반올림
		System.out.println(Math.round(num2*100)/100.0);
		//4자리 올림
		System.out.println(Math.ceil(num2*1000)/1000.0);
		//5자리 버림 Math 함수 사용해서 출력하시오
		System.out.println((int)(num2*10000)/10000.0);
		
		
		
		
		
		
//		// 소수점 5자리까지만 표현. 95빼
//		double num = 3.457895;
//		double result = (int)(num *10000)/10000.0;
//		System.out.println(result); //3.4578
		
//		//소수점 3자리까지만 표현
//		double num2 = 102.145789;
//		System.out.println((int)(num2 * 1000)/1000d);
		
		
			
	
//		
//		// 3.141(셋째짜리)까지만 출력시키려면?
//		double pi = 3.141592; 
//		
////		pi * 1000/1000 이런식으로 해야
////		pi * 1000; //3141.592;   필요한데 까지만 곱하고
////		(int)(pi*1000); //3141   곱한걸 int로 바꿔서 뒤에 다 없애고
//		double result = (int)(pi*1000)/1000.0; //3.141  곱했던 만큼 다시 나눠(.0이나 d붙여서 double로 바꿔야)
//		System.out.println(result);

		
		
	}
}
