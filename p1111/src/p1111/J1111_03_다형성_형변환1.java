package p1111;


public class J1111_03_다형성_형변환1 {

	public static void main(String[] args) {
		
		Car c1 = null; //참조변수선언. Car c1 = null; 는 참조변수 선언후 초기화
//		c1.drive(); // 에러. 객체 생성은 아직 안됐어
		FireEngine fe = new FireEngine(); // 객체선언
		fe.water();
		FireEngine fe2 = null;
		c1 = fe; // 다형성. 조상의 참조변수로 자손의 객체를 조작
		c1.drive(); //가능
//		c1.water(); //안돼. 참조변수가 조상꺼라(c1) 조상의 멤버(변수/메소드)만 조작 가능
		
		fe2 = (FireEngine)c1;
		fe2.water();// 가능
		
		
	}

}
