package p1111;

public class J1111_01_질문 {
	int x; // 인스턴스 변스
//	x=2; // 오류. 메소드 밖에서 사용은 안됨. 정의만 됨.

	public static void main(String[] args) {
//		x = 2; //오류!! 메소드 안에 지역변수 없으니까 인스턴스 변수를 가져와야하는데..? 라고 생각했음
		//클래스 메소드인 main메소드 안에 있으니까 인스턴스 변수인 x를 가져올 수 없음. 새로 정의해야
		
		String str = null;
		String str2 = "";
		int x;
//		System.out.println(x.length);// 오류
//		System.out.println(str.length());// 오류 NullPointerException
		System.out.println(str2.length());// 0
		
	}
}

//