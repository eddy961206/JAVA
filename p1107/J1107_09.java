package p1107;

public class J1107_09 {

	public static void main(String[] args) {
		// 넓이 구하는 프로그램
		// 사각형 넓이 구하는 계산식
		// 직사각형 rect : 가로*세로
		// 마름모 rhom: 대각선길이*대각선길이 / 2
		// 사다리꼴 trape : (밑변+윗변)/2 * 높이

		// 직사각형 100,25 210,30
		// 마름모 100,25 210,30
		// 사다리꼴 100,25 ,10 210,30,10

		Cal2 c = new Cal2();

		System.out.println(c.rect(100, 25));
		System.out.println(c.rect(210, 30));
		System.out.println(c.rhom(100, 25));
		System.out.println(c.rhom(210, 30));
		System.out.println(c.trape(100, 25, 10));
		System.out.println(c.trape(210, 30, 10));

	}

}
