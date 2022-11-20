package 예제;

import java.util.Scanner;

class Pay {
	int hourly_wage;
	int worked_hour;
	int pay;

	public Pay() {
	}

	Pay(int hourly_wage, int worked_hour) {
		this.hourly_wage = hourly_wage;
		this.worked_hour = worked_hour;
	}

	void pay() {
		pay = hourly_wage * worked_hour;
		System.out.println(pay);
	}
}

public class 급여계산기 {
	public static void main(String[] args) {
		int hourly_wage;
		int worked_hour;

		Scanner scan = new Scanner(System.in);
		System.out.println("시급을 입력해주세요 : ");
		hourly_wage = scan.nextInt();
		System.out.println("일한 시간을 입력해주세요 : ");
		worked_hour = scan.nextInt();
		Pay p1 = new Pay(hourly_wage, worked_hour);
		p1.pay();
	}

}
