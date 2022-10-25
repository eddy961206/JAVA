package p1021;

public class J1021_07 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
//		(x>3)&&(x<5) 괄호 넣어주는 습관. 보기 편하게.
//		&& 가 ||보다 우선.
		
	
		System.out.println("---------------------");
		
		b = a++; // a값을 b에 먼저 대입하고 그 다음에 1을 증가시켜라 (++이 뒤에 있으므로) ((그냥 a++만 있으면 문제없음. 대입이 있어서 문제.))
		// b=0, a=1 됨
		System.out.println(b); //0
		
		b = ++a; // a값에 1을 먼저 더하고 그 다음에 b에 대입해라 (++이 앞에 있으므로)
		// b=2, a=2 됨
		System.out.println(b); //2
		
		
		System.out.println("---------------------");
		
		--a; // a=a-1
		a--; // a=a-1
	}

}
