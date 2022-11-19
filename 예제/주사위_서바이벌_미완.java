package 예제;

//짝수가 나온 주사위가 살아남는, 주사위 서바이벌 게임이 시작되었습니다. 
//참가 주사위는 각각 12간지의 이름을 갖는 정 2면체 부터 13면체 입니다. 
//주사위를 던져 살아남은 주사위를 남기고, 
//살아남은 주사위 끼리 다시 이를 반복하여 최종 생존 주사위를 찾아주세요.

//주사위가 이름과 면의 개수, 던져진 주사위의 눈 정보를 갖도록 필드를 만들고, 
//1부터 planeNum사이의 임의의 정수를 반환 하는 메소드 갖도록 클래스를 작성하세요
class Dice {
	String name;
	int planeCount; // 면 갯수
	int planeNum; // 나온 면의 수
	int flag = 0; // 기본은 0 살아있다는 뜻. 탈락하면(홀수면)1로 바뀜

	Dice() {
	}

	Dice(String name, int planeCount) {
		this.name = name;
		this.planeCount = planeCount;
	}

	int roll() {
		int r_num = (int) (Math.random() * planeCount + 1);
		planeNum = r_num;
		return planeNum;
	}

}

public class 주사위_서바이벌_미완 {
	public static void main(String[] args) {
		Dice[] d = new Dice[12];
		int count = 0;
		int survivedNum = 12;
		int survivedRoundNum = 12;
		boolean[] survivedArr = new boolean[12]; // false(죽음) 기본

		d[0] = new Dice("자", 2);
		d[1] = new Dice("축", 3);
		d[2] = new Dice("인", 4);
		d[3] = new Dice("묘", 5);
		d[4] = new Dice("진", 6);
		d[5] = new Dice("사", 7);
		d[6] = new Dice("오", 8);
		d[7] = new Dice("미", 9);
		d[8] = new Dice("신", 10);
		d[9] = new Dice("유", 11);
		d[10] = new Dice("술", 12);
		d[11] = new Dice("해", 13);

//		// 1차 실행
//		System.out.println("살아남은 주사위 : ");
//		for (int i = 0; i < d.length; i++) {
//			if (d[i].roll() % 2 == 0) {
//				d[i].flag = 1;
//				System.out.printf("%s\t%d면체\t 나온숫자 : %d \n", d[i].name, d[i].planeCount, d[i].planeNum);
//			}
//		}
//
//		// 2차 실행
//		System.out.println("2차 - 살아남은 주사위 : ");
//		for (int i = 0; i < d.length; i++) {
//			if (d[i].roll() % 2 == 0 && d[i].flag == 1) {
//				System.out.printf("%s\t%d면체\t 나온숫자 : %d \n", d[i].name, d[i].planeCount, d[i].planeNum);
//			} else {
//				d[i].flag = 0;
//			}
//		}
//
//		// 3차 실행
//		System.out.println("3차 - 살아남은 주사위 : ");
//		for (int i = 0; i < d.length; i++) {
//			if (d[i].roll() % 2 == 0 && d[i].flag == 1) {
//				System.out.printf("%s\t%d면체\t 나온숫자 : %d \n", d[i].name, d[i].planeCount, d[i].planeNum);
//			} else {
//				d[i].flag = 0;
//			}
//		}

//		while (true) {
//			
//			System.out.println(count + 1 + "차 - 살아남은 주사위 : ");
//
//			for (int i = 0; i < survivedNum; i++) {
//				if (d[i].roll() % 2 == 0 && d[i].flag == 0) { //살아있다는 뜻인 0
//					System.out.printf("%s\t%d면체\t 나온숫자 : %d \n", d[i].name, d[i].planeCount, d[i].planeNum);
//				} else {
//					survivedNum--;
//					d[i].flag = 1; //홀수면 1로 바꿔서 탈락시킴
//				}
//			}
//			System.out.println(survivedNum);
//			if (survivedNum == 1) {
//				break;
//			}
//			count++;
//
//		} // while

		while (true) {

			System.out.println(count + 1 + "차 - 살아남은 주사위 : ");

			for (int j = 0; j < survivedArr.length; j++) {
				if (survivedArr[j] == false) {// 생존해 있는(false) 것들중에서만 반복
					for (int i = 0; i < survivedRoundNum; i++) {
						d[i].roll();
						if (d[i].planeNum % 2 == 0 && d[i].flag == 0) { // 살아있다는 뜻인 false,0
							System.out.printf("%s\t%d면체\t 나온숫자 : %d \n", d[i].name, d[i].planeCount, d[i].planeNum);
						} else {
							survivedArr[i] = true; // false생존 -> true죽음
							survivedNum--;
							d[i].flag = 1; // 홀수면 1로 바꿔서 탈락시킴
						}
					} // 작은 for
					survivedRoundNum = survivedNum;
					System.out.println("살아남은 주사위 갯수 : " + survivedRoundNum);
					if (survivedRoundNum == 1) {
						break;
					}
					count++;
				} else { // 생존해 있지 않은 거면(true) 다음걸로 넘어가
					continue;
				} // if
			} // 큰 for

		} // while

	}// main
}// class
