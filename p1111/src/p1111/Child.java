package p1111;

public class Child extends Parent {
	// 기본생성자 없음 -> 자동생성됨
//	Child(){
//		super(); //자동으로 붙
//	} //자동으로 생성되서 조상의 생성자를 호출
	
	
	int x = 20; //인스턴스 변수
	
	void method() {
		int x = 30; // 지역변수
		System.out.println(x); //30 메소드 내 지역변수
		System.out.println(this.x); //20 현재인스턴스 거
		System.out.println(super.x); //10 부모 거
	}
}
