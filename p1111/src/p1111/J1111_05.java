package p1111;

public class J1111_05 {

	public static void main(String[] args) {
		P1 p = new C1(); // 다형성. 조상의 참조변수(p)로 자손의 객체를 다룸
		System.out.println(p.x); //100 에러아닌 에러. 다형성에서 부모자식 둘 다 변수가 같은 경우 부모거 가져옴 - 신경쓰지마 안쓰여
		p.method();				// 자손메소드. 정상적. 자손거 가져옴.
		
		C1 c = new C1(); // 객체선언
		System.out.println(c.x); //200
		c.method();				 //자손메소드

	}

}
