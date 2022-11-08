package p1108;

public class J1108_05 {

	public static void main(String[] args) {
		Data d = new Data(); // 객체선언
		d.x = 10;
		System.out.println("d.x의 처음 값 :" + d.x); // 10
		d.x = J1108_05.change(d.x); // 1000 
		// 매개변수에 기본형 타입 들어가면 받아서 대입해야(d.x = ~~).
		// 매개변수에 참조형 타입 넣으면 굳이 대입 안해도 됨.
		System.out.println("change 메소드 호출 후 d.x의 값 : " + d.x);
	}// main 메소드

	static int change(int x) { // 매개변수 기본형 타입인지 참조형 타입(주솟값저장)인지 중요. 
							   //참조형 타입이면 주솟값을 공유하기 때문에 여기서 바꾸면 원래 호출한 쪽에서도 바뀜
		x = 1000; // 지역변수.
		System.out.println("change메소드 x의 값 : " + x); // 1000
		// x에 들어간 1000이 리턴되서 다른곳에 담기는 게 아니기 때문에 그대로 사라짐.
		return x;
	}

}// class

class Data {
	int x;
}// class