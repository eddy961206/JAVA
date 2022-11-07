package p1107;

public class J1107_04_객체배열활용 {
	public static void main(String[] args) {
		// Tv 클래스 -> 3개의 객체를 생성 후, channel [0]=10, [1]=11, [2]=12
		// 넣고 출력

		Tv[] t = new Tv[3]; // 3칸짜리 Tv객체가 들어가는 배열t 선언

		for (int i = 0; i < t.length; i++) {
			t[i] = new Tv(); // Tv 인스턴스 3개를 만들어서 배열에 집어넣
			t[i].channel = i + 10; //각 인스턴스들의 변수 입력
			System.out.printf("tv[%d] = %d\n", i,t[i].channel);
		}
	}
}
