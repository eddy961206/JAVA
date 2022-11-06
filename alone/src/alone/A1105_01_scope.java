package alone;

class C {
	int v = 10; //전역변수.
	// class 바로 밑에 있고 메소드 내에 있는 게 아니니 전역변수.

	void m() {
		int v = 20; //지역변수
		System.out.println(v);  // 20 (가까운 지역변수먼저 참조. 지역변수가 선언/할당 안돼있으면 전역변수(10)를 참조함.
		System.out.println(this.v); // 10
		//this : 인스턴스 자체.자신. && 객체에 대한 '전역'
	}
}

public class A1105_01_scope {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m(); 
	}

}
