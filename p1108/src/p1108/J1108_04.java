package p1108;

public class J1108_04 {

	public static void main(String[] args) {
		System.out.println("메인 메소드입니다.");
		// * 같은 클래스 내에서 static이 있는 메소드는 클래스이름 생략가능 (J1108_04 생략가능)
		J1108_04.firstMethod();
	}
		
	static void firstMethod() {
		System.out.println("1번째 메소드입니다.");
		J1108_04.secondMethod();
	}

	static void secondMethod() {
		System.out.println("2번째 메소드를 출력합니다.");
	}

}
