package p1108;

public class J1108_10 {

	public static void main(String[] args) {
		//객체선언
		Data2 d2 = new Data2();
		d2.x = 10;
		System.out.println(d2.x); // 10
		System.out.println(d2); // 주소. p1108.Data2@587d1d39
		
		// 메소드 호출
		change(d2); // 메소드에 d2(주솟값)을 전달함.
		
		System.out.println(d2.x); // 1000.
		
	}// main메소드
	
	
	static void change(Data2 d2) { //매개변수로 참조형변수 받으면 주솟값이 들어와서 
		d2.x = 1000; //그 주소의 값을 직접 바꿈.
		// 매개변수로 기본형변수 받으면 값이 직접바뀌지 않음. 리턴한 값을 변수에 담아놓지 않는 이상.
	}

}

class Data2 {
	int x;
}