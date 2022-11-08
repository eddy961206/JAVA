package p1108;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class Method {

	// 메소드 정의
	// 결괏값을 리턴해서 넘겨주면 됨.
	
//	Scanner scan = new Scanner(System.in);
//	int a;
//	int b;
//	int c;
//
//	Method input(Method m) {
//		System.out.println("첫번째 숫자 입력하세요 : ");
//		m.a = scan.nextInt();
//		System.out.println("두번째 숫자 입력하세요 : ");
//		m.b = scan.nextInt();
//		System.out.println("세번째 숫자 입력하세요 : ");
//		m.c = scan.nextInt();
//		return m; 
//	}
//	
//	int add(Method m) {
//		int result = m.a + m.b + m.c;
//		return result;
//	}

	void all(int a, int b, int c) {
		add(a,b,c);
		sub(a,b,c);
		multi(a,b,c);
		div(a,b,c);
		// 메소드 안에 메소드 '호출'은 가능. 정의는 불가능.
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int sub(int a, int b, int c) {
		return a-b-c;
	}
	
	int multi(int a, int b, int c) {
		return a*b*c;
	}
	
	double div(int a, int b, int c) {
		return (double)a/b/c;
	}

	

}
