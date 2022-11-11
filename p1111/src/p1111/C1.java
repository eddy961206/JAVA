package p1111;

public class C1 extends P1 {
	
	int x = 200; //이렇게 부모랑 변수명이 똑같은 경우 없음
	
	void method() { //오버라이딩
		System.out.println("자손 메소드입니다(C1클래스)");
	}
}
