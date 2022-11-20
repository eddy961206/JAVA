package alone;

class Outer2{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; // 1. 외부클래스의 private멤버 접근 가능. 결국 Outer라는 같은 클래스 내에 있으니까.
		int icv = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; //오류. static클래스는 외부 클래스의 인스턴스멤버에 접근 불가
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0; //지역변수라 메소드 끝나고 사라짐
		final int LV = 0; //JDK1.8부터 final 생략가능. 웬만하면 붙여
		
		class LocalInner{ // 2. 지역내부클래스를 감싸고 있는 메소드의 상수만 사용가능
			int iiv = outerIv;
			int iiv2 = outerCv;
			
			// 외부클래스(LocalInner의 외부)의 지역변수는 final이 붙은 변수(상수)만 접근가능.
			// 지역변수는 메소드 끝나면 사라지지만 지역클래스의 객체는 더 오래 존재 가능한데
			// 그 객체가 사라져버린 지역변수를 참조하면 말이 안되니까. 
			// 상수는 constant pool이란 곳에 따로 남아있어서 참조 가능. 
			int iiv3 = lv; //근데 왜 오류 안남???? -- 왜냐면
			// lv 지역'변수'지만 JDK1.8부턴 변수가 값이 한번도 안바뀌면
			// 변수가 아닌 상수취급을 해버려서.
			int iiv4 = LV; //상수는 접근가능
		}
		
	}
	
	
}




public class A1113_내부클래스3 {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
//		System.out.println(outer2.myMethod().LV);
		
	}
}
