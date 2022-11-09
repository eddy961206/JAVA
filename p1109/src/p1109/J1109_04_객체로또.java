package p1109;

public class J1109_04_객체로또 {

	public static void main(String[] args) {
		int[] input = new int[6];
		int count = 0;
		// 입력을 Lotto 클래스에서 받아
		Lotto l = new Lotto();
		count = l.lotto_input(count, input);

		// 출력
		System.out.printf("넣은 번호 : ");
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d, ", input[i]);
		}
		System.out.println();
		System.out.println("입력 횟수 : " + count);

	}

}
