package p1108;

public class J1108_11 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		
		MyMath2 m = new MyMath2();
		m.a = 100L;
		m.b = 200L;
		System.out.println(m.add());
		
	}

} // class

class MyMath2 { 
	long a, b; // 인스턴스 변수
	
	
	long add() {
		return a + b; // 인스턴스 변수
	}

	static long add(long a, long b) {
		return a + b; // 지역 변수

	}
}