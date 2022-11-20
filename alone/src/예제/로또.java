package 예제;

import java.util.Scanner;

public class 로또 {

	// 1~45 랜덤숫자 생성 메소드
	public static int generateRandomNum() { 
		int r_num = (int) (Math.random() * 45 + 1);
		return r_num;
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] inputArr = new int[5];
		boolean[] isPicked = new boolean[46]; // 기본 false
		int[] output = new int[6];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			while (true) {
				System.out.println("넣기 싫은 숫자 5개 차례대로 입력하세요 : ");
				int input = scan.nextInt();
				
				if (isPicked[input] == false) { //중복이 아니니?
					isPicked[input] = true;
					// isPicked에 기본적으로 다 false저장돼있. 입력받은 수에 해당하는 인덱스 값은 true로 바꿈. 
					// 나중에 true로 된 건 사용 안하려고 표시해 두는 것. 
					
					inputArr[count] = input; // 입력받은 숫자를 배열에 담아놓기
					count++;
					
					break; // while문 빠져나감
				}//if
			} // while
		} // for

		// 내가 입력했던 5개의 숫자들 뭔지 보려고 출력. 출력하려고 위에서 배열 만들어서 담아놓았던 것.
		System.out.printf("제외할 숫자들 : ");
		for (int i = 0; i < inputArr.length; i++) {
			System.out.printf("%d ",inputArr[i]);
		}
		System.out.println();
		
		
		// 중복X, 입력했던 수X  조건 만족하는 로또 번호 생성
		for (int i = 0; i < output.length; i++) { // 6개 뽑을 거니까 결국 6번 반복(for로 횟수 지정)
			while (true) { // 입력했던 수와 같으면 스킵하고 같지 않은게 나올 때 까지 계속 반복해야 하니까 while(true)로.
				int temp = generateRandomNum(); // 1~45

				if (isPicked[temp] == false) {
					isPicked[temp] = true; // 중복 제거하기 위해서 true로 바꿔버림. 다음 반복때 실행 안되게.
					output[i] = temp;
					break;
				}
			} // while
		} // for

		// 로또 번호 출력
		System.out.printf("로또 번호 : ");
		for (int i : output) {
			System.out.printf("%d ",i);
		}



	}
}
