package alone;

public class A1113_내부클래스2 {
	class InstanceInner{} //인스턴스 멤버(변수)
	static class StaticInner{} //static(클래스) 멤버(변수)
	
	
	InstanceInner iv = new InstanceInner(); // 인스턴스멤버끼리는 직접접근 가능
	static StaticInner cv = new StaticInner(); // static멤버끼리는 직접접근 가능
//	static StaticInner cv = new InstanceInner(); // 에러. static멤버가 instance멤버 사용 불가.
	
	
	static void StaticMethod() { // static 멤버(메소드)
//		InstanceInner obj1 = new InstanceInner(); // 에러. static메서드에선 인스턴스 멤버에 직접접근 불가
		StaticInner obj2 = new StaticInner();
		
		A1113_내부클래스2 outer = new A1113_내부클래스2();
		InstanceInner obj1 = outer.new InstanceInner(); //인스턴스클래스는 외부클래스를 먼저 생성해야 접근가능.
		// 근데 이렇게 쓸 일 없음, 쓰지도 마
	}

	
	void InstanceMethod() { //인스턴스 멤버(메소드)
		InstanceInner obj1 = new InstanceInner(); // 인스턴스메서드에서는 인스턴스멤버, 
		StaticInner obj2 = new StaticInner(); // static멤버 둘 다 접근 가능
//		LocalInner lv = new LocalInner(); // 오류. 지역내부클래스는 외부에서 접근 불가.
	}
	
	void myMethod() { // 인스턴스 멤버(메소드)
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
	
	
	
	public static void main(String[] args) {

	}

}
