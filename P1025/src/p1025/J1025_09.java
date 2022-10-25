package p1025;

public class J1025_09 {

	public static void main(String[] args) {

		System.out.println('A'<'B'); //true
		System.out.println('0' == 0); //false 48이므로
		System.out.println('0' == 48); //true
		System.out.println('A' != 65); //false
		System.out.println(10.0d == 10.0f); //true  
		System.out.println(0.1d == 0.1f); //false    float 가 double보다 작으니까 작은 쪽(double->float)으로 변환해야 같아질 수 있음.
		System.out.println((float)0.1d == 0.1f); //true  0.1f->0.10000000  0.1d -> 0.1000000000000000
		double d = 0.1f;
		double a = 0.1;
		System.out.println(d); // 0.10000000149011612 임의
		System.out.println(a); // 0.1
		
		
//	!!	char x = 'j';
//	!!	(x>='a' &&  x<='z') ---> 소문자냐 물어보는것. a,z대신 0,9 넣으면 숫자인지 물어보는 것.
//	!!	(x>='a' &&  x<='z') || (x>='A' &&  x<='Z') ---> 알파벳인지 물어보는 것
	
	}

}
