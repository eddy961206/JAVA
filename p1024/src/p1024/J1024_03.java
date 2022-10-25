package p1024;

public class J1024_03 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a * b;
		
		
		double d2 = 0;
		d2 = 100000/300; // int나누기 int는 int므로 3.33333..을 3으로 자름. 근데 double이라 3.0으로 저장
		d2 = 100000/3.0; // 둘 중 하나를 double로 만들면 3.333333 나옴. int/double 값은 double이니까 15자리까지만 정확하게.
		System.out.println(d2);
		
		
		char c1 = 'a'; //97
		char c2 = (char)(c1+1);  //98->b
		System.out.println(c2); //b
		
		char c3 = ++c2; //가능
		System.out.println(c3);
		char c4 = (char)(c1 - 32); //소문자를 대문자로 바꿀 때 -- 빼
		System.out.println(c4);
		
		char c5 = 'A';
		System.out.println((char)(c5+32)); //대문자를 소문자로 바꿀 때 --- 더해
		
		
		int i = '1' - '0'; //0: 48, 1: 49, 2: 50, 3: 51 (아스키코드)
		// char - char는 int - int로 변하니까 int지만 0을 뺏으므로 앞의 값 그대로 나옴.
		System.out.println(i); //1 즉 문자끼리 빼는 거도 숫자 그냥 계산하듯이. 나머지 연산은x
		//!!!!!!!!문자인 숫자를 숫자(int)로 변환시킬려면 "- '0'" (빼기 영) 하면 돼!!!!!!!!
		
		
		
		double f = 5.0;
		int result = (int)f + 5;
		System.out.println(result); //10
		
		double dd = 85.4;
		result = (int)dd;
		
		

	}

}
