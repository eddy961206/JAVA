package 예제;

public class 임금계산 {

//	직원의 임금은 주급으로 정산하며, (근무시간) X (기본시급)을 기준으로 한다.
//	주당 근무시간이 40시간을 초과시, 초과급여는 (초과시간) X (기본시급) X (1.5)으로 한다.
//	기본시급은 최저 $8.00이며, 이보다 작을 경우 에러를 출력한다.
//	주당 근무시간이 60시간을 초과하는 경우 에러를 출력한다.

	double basePay;
	int hours;
	static final int STANDARD_HOUR = 40;

	public static void printPay(double basePay, int hours) {
		double wage = 0;
		if (basePay < 8.0 && hours <= 60) {
			System.out.println("기본시급이 8달러 이하일 수 없습니다");
		} else if (basePay >= 8.0 && hours <= 60) {
			if (hours > STANDARD_HOUR) {
				wage = (basePay * STANDARD_HOUR) + ((hours - STANDARD_HOUR) * basePay * 1.5);
			} else {
				wage = basePay * hours;
			}
			System.out.println(wage+"$");
		} else if (basePay >= 8.0 && hours > 60) {
			System.out.println("주당 근무시간이 60시간을 초과할 수 없습니다");
		} else if (basePay < 8.0 && hours > 60) {
			System.out.println("기본시급이 8달러 이하일 수 없습니다");
			System.out.println("주당 근무시간이 60시간을 초과할 수 없습니다");
		}
	}

	public static void main(String[] args) {
		printPay(7.50, 35);
		printPay(8.20, 47);
		printPay(7.00, 73);
	}
}
