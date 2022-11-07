package p1107;


public class J1107_06_클래스변수변경 {

	public static void main(String[] args) {
		// Card - kind,number
		Card2 c1 = new Card2();
		c1.kind = "Heart";
		c1.number = 7; // 인스턴스변수 -> 참조명.변수명
		Card2 c2 = new Card2();
		c2.kind = "Spade";
		c2.number = 4;
				
		System.out.printf("%s : %d \n", c1.kind, c1.number);
		Card2.width = 50; // 클래스변수 -> 클래스명.변수명
		Card2.height = 100;

		System.out.printf("가로 : %d, 세로 : %d \n", Card2.width, Card2.height);


	}

}
