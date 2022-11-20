package alone;

class Outer { // 외부 클래스
	
	class InstanceInner{ // 1. 인스턴스 (내부) 클래스
		
		int iv = 1; // iv
		static int cv = 0; // cv - static내부 클래스아니면 cv정의할수 없댔는데...? 되는데?
		final static int CONST = 100; // final static은 상수이므로 가능
		
		void InstanceMethod() { // 인스턴스 메소드
			System.out.println("Inner클래스의 인스턴스메소드입니다");
		}
		
		static void staticMethod() { // static 메소드
			System.out.println("Inner클래스의 클래스메소드입니다");
		}
		
	}
	
	static class StaticInner{ // 2. 스태틱 (내부) 클래스
		
		int iv = 2; // static클래스 안에도 인스턴스멤버(iv,im)들어갈 수 있음. 
		// 왜냐면 스태틱클래스도 결국 일반 클래스의 한 종류니까. cv/cm만 들어가야 하는 건 아님 
		// static 멤버가 instance멤버에 직접 접근이 불가능한거랑 헷갈리지마. 내부클래스2.java 참고
		static int cv = 3; // cv. !!!!!!!!!static클래스에만 static멤버 정의 가능!!!!!!!!!!!!
		// 왜냐하면 static변수는 객체 생성 없이도 사용가능해야 하는 것인데, 내부클래스에 static이 안붙어있으면
		// 그 내부클래스는 인스턴스 클래스가 되므로 객체를 생성해야만 사용 가능하니까 모순.
		
		void InstanceMethod() { // 인스턴스 메소드
			System.out.println("StaticInner클래스의 인스턴스메소드입니다");
		}
		
		static void staticMethod() { // static 메소드
			System.out.println("StaticInner클래스의 클래스메소드입니다");
//			iv = 12; // static 메소드 내에서 iv 접근 불가
		}
	}
	
	void myMethod() {
		class LocalInner{ // 3. 지역 (내부) 클래스 . - 메소드내에서만 사용가능. 메소드 끝나면 다 사라짐
			int iv = 4;
			static int cv = 5; // 에러. 지역클래스에 cv 선언 불가. --라는데 에러 안걸림??? 
			final static int CONST = 200; // final static은 상수이므로 가능
		}
		int i = LocalInner.CONST; // myMethod 안에선 접근 가능.
		int c = LocalInner.cv;
		System.out.println(i); //200
		System.out.println(c); //5
	}
//	int i = LocalInner.CONST; //myMethod밖에선 안됨. 메소드 내에서만 존재하다 사라지니까.
	
}

public class A1113_내부클래스 {
	public static void main(String[] args) {
		
		// 인스턴스 (내부) 클래스의 인스턴스를 생성하려면
		// 외부클래스의 인스턴스부터 생성하고 그걸로 접근해야. 총 두단계
		Outer outer = new Outer(); 
		Outer.InstanceInner ii = outer.new InstanceInner();
		
		ii.InstanceMethod(); // Inner클래스 안의 인스턴스 메소드 호출. "Inner클래스의 인스턴스메소드입니다"
		ii.staticMethod(); // Inner클래스 안의 클래스 메소드 호출. "Inner클래스의 클래스메소드입니다"
		Outer.InstanceInner.staticMethod(); // 위와 동일. '클래스명.메소드명'으로 호출. "Inner클래스의 클래스메소드입니다"
		System.out.println(ii.iv); // 1
		System.out.println(ii.cv); // 0
		System.out.println(Outer.InstanceInner.cv); // 위와 동일. '클래스명.변수명' 0
		// 얘 안되야 되는 거 아닌가? InstanceInner는 인스턴스멤버라서 객체 생성하고 써야하는데?
		
		//------------------------------------------------------------------------------
		
		// 스태틱 내부 클래스의 인스턴스는
		// 외부클래스의 인스턴스 생성 필요 없어. 한 단계 줄어듦.
		Outer.StaticInner si = new Outer.StaticInner();
		
		si.InstanceMethod(); //StaticInner클래스 안의 인스턴스 메소드 호출. "StaticInner클래스의 인스턴스메소드입니다"
		si.staticMethod(); //StaticInner클래스 안의 클래스 메소드 호출. "StaticInner클래스의 클래스메소드입니다"
		System.out.println(si.iv); // 2
		System.out.println(Outer.StaticInner.cv); //3. '클래스명.변수명'
		
		//------------------------------------------------------------------------------
		outer.myMethod(); 
		// 지역내부클래스는 어떻게 활용하는 거??? - 메소드 호출 후 끝나면 바로 사라져버리니까 못 씀
		
		
	}
}
