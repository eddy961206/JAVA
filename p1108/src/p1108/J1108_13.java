package p1108;

public class J1108_13 {

	public static void main(String[] args) {
		// 객체선언
		Data1 d1 = new Data1();
		d1.value = 100;
		System.out.println(d1.value);

		Data3 d3 = new Data3(5);
		System.out.println(d3.value);
	}

}// class

class Data1 {
//	Data1(){} // 기본생성자. 있어도되고 없어도.
	int value;
}

class Data3 {
	int value;
	
	Data3(){} // 다른 생성자 만들면 기본생성자도 만들어놓는게 좋아. 에러 안나게.

	Data3(int x) {
		value = x;
	}
}
